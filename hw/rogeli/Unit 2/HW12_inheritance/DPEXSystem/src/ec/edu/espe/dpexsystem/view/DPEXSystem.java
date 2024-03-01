package ec.edu.espe.dpexsystem.view;

import ec.edu.espe.dpexsystem.model.Package;
import ec.edu.espe.dpexsystem.model.User;
import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

/**
 *
 * @author Luis Sagnay
 */
public class DPEXSystem {
    public static void main(String[] args) {
        User user = new User();
        DPEXSystem mainSystem = new DPEXSystem();
        mainSystem.adminInterface();
    }
    
    public void adminInterface(){
        Scanner scanner = new Scanner(System.in);
        
        while(true){
        System.out.println("\t Sample text");
        System.out.println("You have logged in as an Administrator" );
        System.out.println("Please, select an option");
        System.out.println("\t1. Register a new electoral package");
        System.out.println("\t2. Modify a registered package");
        System.out.println("\t3. Assign new roles");
        System.out.println("\t4. Export electoral packages data");
        System.out.println("\t5. Log in as a different user");
        System.out.println("\t6. Exit system");
        System.out.println("\n Your option: ");
        
        int menuOption = scanner.nextInt(); 
        
            switch (menuOption) {
                case 1:
                    registerElectoralPackage();
                break;
                case 2:
                    modifyPackages();
                break;
                case 3:
                    createNewRole();
                break;
                case 4:
                    //saveToJson();
                break;
                case 5:
                    logInNewUser();
                break;
                case 6:
                    System.out.println("Thanks for using ____");
                    System.exit(0);
                break;
                
                default:
                    System.out.println("\t Invalid option. Please choose a valid option. \n");
            }
        }
    }
    
    private void registerElectoralPackage() {

    }

    private void modifyPackages() {

    }

    private void createNewRole() {

    }

    public static void saveToJson(Package[] packages) {
        Gson gson = new Gson();
        ArrayList<Package> packageList = new ArrayList<>();

        try (FileWriter writer = new FileWriter("package.json")) {
            gson.toJson(packageList, writer);
            System.out.println("Chickens saved to JSON successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to JSON file: " + e.getMessage());
          }
    }
    
    private void logInNewUser() {

        System.out.println("Executing option 5: Log in as a different user");
    }
    
}
    
   

