package ec.edu.espe.question33.view;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.question33.model.VinylRecord;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Luis Sagnay
 */
public class VinylRecordSystem {
    private static final String JSON_FILE = "vinylRecord.json";
    
    public static void main(String[] args){
        ArrayList<VinylRecord> vinylRecordList = loadFromJson();
        
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nVinyl record Menu:");
            System.out.println("1. Add a Vinyl record");
            System.out.println("2. Count a Vinyl record");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    VinylRecord newVinylRecord = addVinylRecord();
                    vinylRecordList.add(newVinylRecord);
                    System.out.println("Vinyl Record added successfully");
                    saveToJson(vinylRecordList);
                    break;
                case 2:
                    countVinylRecord(vinylRecordList);
                    break;
                case 3:
                    System.out.println("Exiting. Goodbye");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please enter a valid option");
            }
        }
    }
    
    public static VinylRecord addVinylRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Vinyl Record:");
        System.out.print("Id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the diameter (in cm): ");
        int diameter = scanner.nextInt();
        System.out.print("Enter the memory (in mb) : ");
        int memory = scanner.nextInt();

        return new VinylRecord(id, diameter, memory);
    }
    
    public static void saveToJson(ArrayList<VinylRecord> vinylRecordList) {
        Gson gson = new Gson();

        try (FileWriter writer = new FileWriter("vinylRecord.json")) {
            gson.toJson(vinylRecordList, writer);
            System.out.println("Vinyl record saved to JSON successfully.");
        } catch (IOException e) {}
    }
    
    private static ArrayList<VinylRecord> loadFromJson() {
        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<VinylRecord>>() {}.getType();

        try (Reader reader = new FileReader(JSON_FILE)) {
            return gson.fromJson(reader, type);
        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        } catch (IOException e) {
            return new ArrayList<>();
        }
    }

    public static void countVinylRecord(ArrayList<VinylRecord> vinylRecordList) {
        System.out.println("Total Vinyl Records: " + vinylRecordList.size());
    }
}