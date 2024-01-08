
package ec.edu.espe.smartwatches.view;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.reflect.TypeToken;

import ec.edu.espe.smartwatches.model.Smartwatch;
import ec.edu.espe.smartwatches.utils.ConsoleMenu;
import ec.edu.espe.smartwatches.utils.ConsoleUtil;
import ec.edu.espe.smartwatches.utils.JsonHandler;
import ec.edu.espe.smartwatches.utils.UserInput;

public class SmartwatchSystem {
    private static ArrayList<Smartwatch> smartwatches = new ArrayList();
    private static String SAVE_FILE = "./smartwatches.json";
    
    public static void main(String[] args) {
        final List<String> menuOptions = Arrays.asList("Create smartwatch", "List all smartwatches", "Delete all smartwatches", "Quit");
        
        loadData();
        
        final ConsoleMenu menu = new ConsoleMenu("Main Menu - Smartwatch system", menuOptions);
        
        ConsoleUtil.clearConsole();
        while (true) {
            menu.displayMenu();
            final int choice = menu.getUserChoice();
            ConsoleUtil.clearConsole();
            switch (choice) {
                case 1:
                    registerSmartwatch();
                    break;
                case 2:
                    showList();
                    break;
                case 3:
                    deleteAll();
                    break;
                case 4:
                    ConsoleUtil.clearConsole();
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\t Invalid option. Please choose a valid option. \n");
            }
            ConsoleUtil.consolePause();
        }
    }
    
    private static void registerSmartwatch() {
        final int id = UserInput.getInt("Please enter the ID: ");
        final String brand = UserInput.getString("Please enter the brand: ");
        final String modelName = UserInput.getString("Please enter the model name: ");
        final String color = UserInput.getString("Please enter the color: ");
        final float price = UserInput.getFloat("Please enter the price: ");
        
        final Smartwatch smartwatch = new Smartwatch(id, brand, modelName, color, price);
        
        
        System.out.println("\n Smartwatch registered successfully");
        smartwatches.add(smartwatch);
        saveData();
    }
    
    private static void showList() {
        System.out.println("All watches: ");
        for (int i = 0; i < smartwatches.size(); i++) {
            final Smartwatch watch = smartwatches.get(i);
            System.out.println(i+1 + ". " + watch.getBrand() + " (Model: " + watch.getModelName() + ") Color: " + watch.getColor() + " -> $" + watch.getPrice());
        }
    }
    
    private static void deleteAll() {
        final String confirmation = UserInput.getString("Are you sure you want to delete all watches? (yes/no)");
        if (confirmation.equalsIgnoreCase("yes")) {
            smartwatches = new ArrayList();
        }
        saveData();
    }
    
    private static void loadData() {
        Type listType = new TypeToken<ArrayList<Smartwatch>>() {
        }.getType();
        ArrayList<Smartwatch> data = new ArrayList<>();
        try {
            data = JsonHandler.readFromJson(SAVE_FILE, listType);
        } catch (IOException e) {}
        smartwatches = data;
    }
    
    private static void saveData() {
        try {
            JsonHandler.writeToJson(SAVE_FILE, smartwatches);
        } catch (IOException e) {
            System.out.println("An error occured while persisting data");
        }
    }
}
