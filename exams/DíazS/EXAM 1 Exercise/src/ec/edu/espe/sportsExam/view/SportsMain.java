package ec.edu.espe.sportsExam.view;

import ec.edu.espe.sportsExam.model.JsonFile;
import ec.edu.espe.sportsExam.model.Sport;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Stefany Díaz
 */
public class SportsMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        JsonFile jsonFile = new JsonFile("Sports");
        List<Sport> sportsList = new ArrayList<>();
        
        int option;
        do{
            System.out.println("1. Add Sport");
            System.out.println("2. Delete Sport");
            System.out.println("3. Exit");
            jsonFile.write(sportsList);

            option = scan.nextInt();
            
            switch (option){
                case 1:
                   
                    System.out.println("Enter the id:");
                    int id =scan.nextInt();
                    System.out.println("Enter the name of the sport:");
                    String name = scan.next();
                    System.out.println("Enter the number of players:");
                    int players = scan.nextInt();
                    
                    Sport sport = new Sport(id, name, players);
                    sportsList.add(sport);
                    jsonFile.write(sportsList);
                    break;
            
                case 2:
                    deleteSport(sportsList,jsonFile);
                    break;
                case 3:
                    System.out.println("Leaving the program");
                    break;
                default:
                    System.out.println("Invalid option, try again.");
            }
        } while (option != 3);
        
    }
                
            
        private static void deleteSport(List<Sport> sportsList, JsonFile jsonFile) {
            if (sportsList.isEmpty()) {
                System.out.println("No sports available for deletion.");
                return;
        }

            System.out.println("----- Sports List -----");
                for (int i = 0; i < sportsList.size(); i++) {
                System.out.println((i + 1) + ". " + sportsList.get(i));
        }

            System.out.println("Select the sport to delete (1-" + sportsList.size() + "): ");
            Scanner scanner = new Scanner(System.in);
                int sportIndex = scanner.nextInt();

            if (sportIndex >= 1 && sportIndex <= sportsList.size()) {
                sportsList.remove(sportIndex - 1);
                jsonFile.write(sportsList);
                System.out.println("Sport deleted successfully.");
        } else {
            System.out.println("Invalid selection. No sport deleted.");
        }
    }
}

                    
              
                  