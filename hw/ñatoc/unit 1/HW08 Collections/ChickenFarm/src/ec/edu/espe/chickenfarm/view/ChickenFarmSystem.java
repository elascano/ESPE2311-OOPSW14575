package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author CarlosÑato,Coding Ninjas,DCCO-ESPE
 */
public class ChickenFarmSystem {

    private static ArrayList<Chicken> allChickens = new ArrayList<>();
    private static final String SAVE_FILE_NAME = "chickens.csv";

    public static void main(String[] args) {
        Poop poop = new Poop();
        Egg egg = new Egg(1);

        System.out.println("Hello Chickens from the Simulator");
        System.out.println("My name is --> Carlos Ñato");
        Chicken chicken2 = new Chicken(1, "Lucy", "Red", 0, true);
        System.out.println("poop --> " + poop);
        System.out.println("egg --> " + egg);

        Scanner scanner = new Scanner(System.in);

        Chicken[] arrayChicken = createChickes(scanner);

        System.out.println("The chickens is: ");
        for (Chicken array : arrayChicken) {
            System.out.println(array);
        }

        saveChickensToCSV(allChickens);

    }

    private static Chicken[] createChickes(Scanner scanner) {

        System.out.println("Enter the number of chickens:");
        int numberOfChickens = scanner.nextInt();
        scanner.nextLine();
        

        Chicken[] chickens = new Chicken[numberOfChickens];

        for (int i = 0; i < chickens.length; i++) {

            System.out.println("Ingrese los datos del pollo " + (i + 1) + " :");

            System.out.println("ID:");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Name:");
            String name = scanner.nextLine();

            System.out.println("Color:");
            String color = scanner.nextLine();

            System.out.println("Age:");
            String age = calculateAge(scanner);
            System.out.println(age);
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-YY");
                Date transformedDate = dateFormat.parse(age);
                System.out.println(transformedDate);
             
            } catch (ParseException e) {
                e.printStackTrace();
            }
        

        System.out.println("Is the chick molting?(true/false):");
        boolean isMolting = scanner.nextBoolean();
        //Error Age
        chickens[i] = new Chicken(id, name, color, id, isMolting);
    }
    return chickens ;
}

public static String calculateAge(Scanner scanner){
        try{
            Calendar currentDate = Calendar.getInstance();
            int currenyDay = currentDate.get(Calendar.DAY_OF_MONTH), currentMonth = currentDate.get(Calendar.MONTH)+ 1, currentYear = currentDate.get(Calendar.YEAR);
   

        
            System.out.println("--------Date the chicken was born-----");
        
        
            System.out.println("Day: ");
            int day = scanner.nextInt();
            if( day<0 | day >31){
                throw new Exception("Invalid digit");
            }
        
       
            System.out.println("Month");
            int month = scanner.nextInt();
            if( month<0 | month >12){
                throw new Exception("Invalid digit");
            }
        
            System.out.println("Year");
            int year = scanner.nextInt();
            if( year <0 ){
                throw new Exception("Invalid digit");
            }
            int resultDay = Math.abs(day - currenyDay); 
            int resultMonth = Math.abs(month - currentMonth);
            int resultYear = Math.abs(year - currentYear);
            
            return "Year= "+ resultYear + " Month= "+ resultMonth+ "Day= "+ resultDay;
        
        }catch(Exception ex){
            
            return "Error: "+ ex.getMessage();       
        }
                
    }
        
         private static void saveChickensToCSV(ArrayList<Chicken> chickens) {
        try (FileWriter writer = new FileWriter(SAVE_FILE_NAME)) {
            
            writer.write("ID,Name,Color,Age,IsMolting\n");

            
            for (Chicken chicken : chickens) {
                writer.write(chicken.toCSVString()+ "\n");
            }

            System.out.println("Chickens data saved to CSV file: " + SAVE_FILE_NAME);

        } catch (IOException e) {
            System.err.println("Error writing to CSV file: " + e.getMessage());
        }
    }
         
    
  
}
