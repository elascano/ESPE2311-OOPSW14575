package ec.edu.espe.chickenfarm.view;


import ec.edu.espe.chickenfarm.model.Chicken;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import com.opencsv.exceptions.CsvValidationException;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.FileNotFoundException;
import java.util.Date;


/**
 *
 * @author Mateo Rogeron, NullPointerException, DCCO - ESPE
 */

public class ChickenFarmSystem {
   
    private static void ageDate(){
        String bornDateStr;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese su fecha de nacimiento (formato: YYYY-MM-DD): ");
            bornDateStr = scanner.nextLine();
        }

      
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    LocalDate bornDate = LocalDate.parse(bornDateStr, formatter);

 
                int edad = calcularEdad(bornDate);

   
                System.out.println("The chicken is: " + edad + "years old ");
    }
    
    public static void main(String[] args) throws CsvValidationException, FileNotFoundException, IOException {//psvm
        //Poop poop = new Poop();
        //Egg egg = new Egg();
        ArrayList<Chicken> chickenList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello Chicken from the simulator");
        System.out.println("Menu");
        //System.out.println("poop ---->" + poop);
        //System.out.println("egg ---->" + egg);
        boolean putNewChicken = true;
        int menuSelect;
       
        
        
        
        while(putNewChicken == true){

            System.out.println("1. Add Chickens");
            System.out.println("2. Print chicken´s List");
            System.out.println("3. Exit");
 
            menuSelect = scan.nextInt();
            scan.nextLine();
            
        switch (menuSelect){
            case 1:
               
            while (putNewChicken) {
            System.out.println("Put the chicken's ID (Use only numbers)");
            int Id = scan.nextInt();
            scan.nextLine();

            System.out.println("Write the chicken's name:");
            String name = scan.nextLine();

            System.out.println("Write the chicken's color:");
            String color = scan.nextLine();

            System.out.println("Put the chicken's age:(Use only numbers)");
            int age = scan.nextInt();
            scan.nextLine();

            System.out.println("Question, the Chicken is Molting?");
            boolean isMolting = scan.nextBoolean();
            scan.nextLine();
            
            System.out.println("When the chicken born?");
            Date bornOnDate = sdf.parser;

            Chicken chicken = new Chicken(Id, name, color, isMolting, bornOnDate);
            
            chickenList.add(chicken);

            System.out.println("Chicken added to the list: " + chicken);

            System.out.println("Do you want to put more Chickens? (true/false)");
            putNewChicken = scan.nextBoolean();
        }
            
            JsonArray jsonArray = new JsonArray();
            for (Chicken chicken : chickenList){
                JsonObject jsonChickens = new JsonObject();
                jsonChickens.addProperty("Id", chicken.getId());
                jsonChickens.addProperty("Age", chicken.getAge());
                jsonChickens.addProperty("name ", chicken.getName());
                jsonChickens.addProperty("color ", chicken.getColor());
                jsonChickens.addProperty("Is chicken Molting? ", chicken.isIsMolting());
                
                jsonArray.add(jsonChickens);
                
            }
            
            //cretes and save information to .Json arhive
            try (FileWriter fileWriter = new FileWriter("ChickenList.json")) {
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                fileWriter.write(gson.toJson(jsonArray));
                System.out.println("Archivo JSON con ArrayList creado exitosamente.");
            } catch (IOException e) {
                e.printStackTrace();
            }
            
            break;
            /*try (CSVWriter writer = new CSVWriter(new FileWriter("C:\\Users\\mate-\\OOP\\ESPE2311-OOPSW14575\\hw\\rogeronm\\Unit01\\hw05ChickenFarm\\ChickenList.csv"))) {
          
            List<String[]> datosArrayList = new ArrayList<>();
            for (Chicken chicken : chickenList) {
                datosArrayList.add(new String[]{
                        String.valueOf(chicken.getId()),
                        chicken.getName(),
                        chicken.getColor(),
                        String.valueOf(chicken.getAge()),
                        String.valueOf(chicken.isIsMolting())
                });
            }
      
            writer.writeAll(datosArrayList);
            System.out.println("Archivo CSV creado con éxito.");
        } catch (IOException e) {
            e.printStackTrace();
        }*/

            case 2:
                try (FileReader fileReader = new FileReader("ChickenList.json")) {
                jsonArray = JsonParser.parseReader(fileReader).getAsJsonArray();

                for (JsonElement jsonElement : jsonArray) {
                    JsonObject jsonChicken = jsonElement.getAsJsonObject();

                int id = jsonChicken.get("Id").getAsInt();
                int age = jsonChicken.get("Age").getAsInt();
                String name = jsonChicken.get("name ").getAsString();
                String color = jsonChicken.get("color ").getAsString();
                boolean isMolting = jsonChicken.get("Is chicken Molting? ").getAsBoolean();

                Chicken chicken = new Chicken(id, name, color, age, isMolting);
                chickenList.add(chicken);

                System.out.println("Chicken retrieved from JSON: " + chicken);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
          break;               
            
   
            case 3:
                putNewChicken = false;
                System.out.println("Thanks for using the program. See you next time");
                break;
        }
            
        }
    
    }

    private static int calcularEdad(LocalDate bornDate) {
       LocalDate actualDate = LocalDate.now();
       return Period.between(bornDate, actualDate).getYears();
    }

}

    /*public static Chicken addChicken(){
        Chicken chicken;
        int Id;
        String name;
        String color;
        int age;
        boolean isMolting;
        
        Scanner scan = new Scanner(System.in);
          

        System.out.println("Hello, Welcome to the register Chicken System. Please, follow the instruction");
        System.out.println("Put the chicken´s ID (Use only numbers)");
        Id = scan.nextInt();
        scan.nextLine();
        
        System.out.println("Write the chicken´s name:");
        name = scan.nextLine();
        
        System.out.println("Write the chicken´s color:");
        color = scan.nextLine();
        
        System.out.println("Put the chicken´s age:(Use only numbers)");
        age = scan.nextInt();
        scan.nextLine();
        
        System.out.println("Question, the Chicken is Molting?");
        isMolting = scan.nextBoolean();
        scan.nextLine();
        chicken = new Chicken(Id,name,color,age,isMolting);
        return chicken;*/





//instanciar
        //variables para inicializar por teclado
        //nmae del main, del contructor y del cjicken
/**System.out.println("Hello Chicken from the simulator");
        System.out.println("My name is ----> Mateo Rogeron");
        System.out.println("poop ---->" + poop);
        System.out.println("egg ---->" + egg);
        System.out.println("chicken ------>" + chicken);*/ 
