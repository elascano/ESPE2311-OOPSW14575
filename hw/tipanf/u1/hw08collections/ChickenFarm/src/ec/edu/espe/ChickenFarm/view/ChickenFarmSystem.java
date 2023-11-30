package ec.edu.espe.ChickenFarm.view;

import ec.edu.espe.ChickenFarm.model.Chicken;
import ec.edu.espe.ChickenFarm.model.Egg;
import ec.edu.espe.ChickenFarm.model.Poop;
import ec.edu.espe.ChickenFarm.model.Date;
import ec.edu.espe.ChickenFarm.model.Usecsv;
import java.util.Scanner;
import java.util.ArrayList;

import java.time.LocalDate;

/**
 *
 * @author Frederick Tipán - Bit Coderz - DCCO ESPE
 */
public class ChickenFarmSystem {  
    public static void main(String[] args) {
        ArrayList<Chicken> chickens = new ArrayList<Chicken>();
        Usecsv file = new Usecsv();
        file.readFile("C:\\Users\\Frederick\\Downloads\\chickens.csv",chickens);
        
        menu(chickens);

    }
    
    public static void menu(ArrayList<Chicken> chickens){
        int option;
        Scanner scan = new Scanner(System.in);
        
        do{
            System.out.println("========== CHICKEN FARM SIMULATOR ==========");
            System.out.println("|| 1.- Add a chicken");
            System.out.println("|| 2.- Show all the chickens");
            System.out.println("|| 3.- Exit");
            System.out.println("============================================");
            option=scan.nextInt();
            scan.nextLine();
            
            switch(option){
                case 1:
                    chickens.add(addChicken());
                    Usecsv file = new Usecsv();
                    file.writeFile("C:\\Users\\Frederick\\Downloads\\chickens.csv",chickens);
                    System.out.println("Chicken added! Press any button to return");
                    scan.nextLine();
                    break;
                case 2:
                    showChickens(chickens);
                    System.out.println("Done! Press any button to return");
                    scan.nextLine();
                    break;
                case 3: break;
                default: 
                    System.out.println("Insert a valid number");
                    break;
            }
        }while(option != 3);
    
    }
    
    public static void showChickens(ArrayList<Chicken> chickens){
        int j=1;
        
        for(Chicken currentChicken : chickens) {
            System.out.print("\nChicken [" + j + "]: " + currentChicken);
            j++;
        }
    }
    
    
    public static Chicken addChicken(){
        Scanner scan = new Scanner(System.in);
        Date birthdate=new Date(0,0,0);
        
        System.out.println("Set a chicken ID");
            int id = scan.nextInt();
            scan.nextLine();
        
            System.out.println("Give the chicken a name");
            String name = scan.nextLine();
        
            System.out.println("Set a color for the chicken");
            String color = scan.nextLine();
            
            System.out.println("Insert the day the chicken was born");
            birthdate.setDay(scan.nextInt());
            scan.nextLine();
            
            System.out.println("Insert the month the chicken was born");
            birthdate.setMonth(scan.nextInt());
            scan.nextLine();
            
            System.out.println("Insert the year the chicken was born");
            birthdate.setYear(scan.nextInt());
            scan.nextLine();
            
            int age = calculateAge(birthdate.getDay(),birthdate.getMonth(),birthdate.getYear());
        
            System.out.println("Is the chicken molting? (True/False)");
            boolean isMolting = scan.nextBoolean();
            scan.nextLine();
            
        return new Chicken(id,name,color,birthdate,age,isMolting);
    }
    
    public static int calculateAge(int day, int month,int year){
        Date finalAge = new Date(0,0,0);
        LocalDate presentDate = LocalDate.now();
        finalAge.setYear(presentDate.getYear() - year);
        finalAge.setMonth(presentDate.getMonthValue() - month);
        finalAge.setDay(presentDate.getDayOfMonth() - day);
        
        if(finalAge.getMonth() < 0){
            finalAge.setYear(finalAge.getYear() - 1);
            finalAge.setMonth(12 + finalAge.getMonth());
        }
        
        if(finalAge.getDay() < 0){
            finalAge.setMonth(finalAge.getMonth() - 1);
            finalAge.setDay(30 + finalAge.getDay());
        }
        
        return finalAge.getYear();
    }
    
}
