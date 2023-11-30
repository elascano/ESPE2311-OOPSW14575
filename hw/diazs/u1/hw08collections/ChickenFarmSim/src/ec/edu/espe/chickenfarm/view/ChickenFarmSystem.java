package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop; 
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder; 


/** 
 /ctrl + shift + i aparaecen los import,
 * ctrl + tab = abren datos de chicken**/

/**
 *
 * @author Stefany Díaz, HoneyBadgers, DCCO - ESPE
 */
public class ChickenFarmSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /**Chicken chicken = new Chicken(1, "Lucy", "Black&White", 2, true);**/
        ArrayList<Chicken> chickens = new ArrayList<>();
        int chickenCount = 0;
        
        int option;
        do{
           System.out.println("Chicken Farm System");
           System.out.println("1. Add Chickens");
           System.out.println("2. Save to CSV");
           System.out.println("3. Save to JSON");
           System.out.println("4. Exit");
           System.out.println("Select an option:");
           option = scan.nextInt(); 
           
           switch (option){
               case 1:
                   if (chickenCount < 30){
                       addChickens(chickens);
                       chickenCount+= chickens.size();
                   }else{
                       System.out.println("Action not possible"); 
                   }
                   break;
               case 2:
                   saveToCSV(chickens);
                   break;  
               case 3:
                   saveToJSON(chickens);
                   break; 
               case 4:
                   System.out.println("Exit");
                   break;
               default: 
                   System.out.println("Invalid option");
                break;
           }
        }while(option !=4);          
}
             
     
    public static void addChickens(ArrayList<Chicken> chickens){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, insert how many chickens do you want (0 - 30):");
        int numChickens = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < numChickens; i++) {
            int id;
            String name;
            String color;
            int age;
            boolean isMolting;
                       
            System.out.println("Insert a chicken ID:");
            id = scan.nextInt();
            scan.nextLine();
        
            System.out.println("Insert a chicken name:");
            name = scan.nextLine();
        
            System.out.println("Insert a chicken color:");
            color = scan.nextLine();
        
            LocalDate birthDate = getBirthDate();
            age = calculateAge(birthDate);
        
            System.out.println("Is the chicken molting? (True or False):");
            isMolting = scan.nextBoolean();
            scan.nextLine();
        
            chickens.add(new Chicken(id, name, color, age, isMolting));
        }
    }
    
    
    public static void saveToCSV(ArrayList<Chicken> chickens){
        try(FileWriter writer = new FileWriter("chickens.csv")){
            for(Chicken chicken : chickens){
                writer.write(chicken.toCSVString() + "\n");
        }
            System.out.println("Data saved");
        }catch (IOException e){
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
    
    public static void saveToJSON(ArrayList<Chicken> chickens) {
    try (FileWriter writer = new FileWriter("chickens.json")) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        for (Chicken chicken : chickens) {
            writer.write(gson.toJson(chicken) + "\n");
        }
        System.out.println("Data saved to JSON");
    } catch (IOException e) {
        System.out.println("Error writing to file: " + e.getMessage());
    }
}
    
    public static LocalDate getBirthDate() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert a chicken birth date (YYYY-MM-DD):");
        String birthDateString = scan.nextLine();
        return LocalDate.parse(birthDateString);
    }

    public static int calculateAge(LocalDate birthDate) {
        LocalDate currentDate = LocalDate.now();
        return currentDate.getYear() - birthDate.getYear();
    }
}
    
   




   /** public static void showChickens(ArrayList<Chicken> chickens){
        if(chickens.isEmpty()){
            System.out.println("Empty List");
    }
        System.out.println("List of Chickens:");
        for(Chicken chicken : chickens){
            System.out.println("ID: " + chicken.getId());
            System.out.println("Name: " + chicken.getName());
            System.out.println("Color: " + chicken.getColor());
            System.out.println("Age: " + chicken.getAge());
            System.out.println("Is Molting? " + chicken.isMolting());
            System.out.println(); 
        }         
    }**/


    







        