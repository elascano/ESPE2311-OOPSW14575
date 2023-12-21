
package ec.espe.edu.Exam.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.espe.edu.Exam.model.CellPhone;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author MateoCriollo
 */
public class RegisterCellPhone {
    public static void main(String[] args) {
        String enter;
        ArrayList<CellPhone> cellPhones = enterCellphone();
        savePersonsToJsonFile(cellPhones);
        Scanner scanner = new Scanner(System.in);
        
        for (CellPhone cellPhone : cellPhones) {
            System.out.println("id: " + cellPhone.getId());
            System.out.println("Brand: " + cellPhone.getBrand());
            System.out.println("Price: " + cellPhone.getPrice());
            System.out.println("--------------------------");
        }

        System.out.println("Enter for continue for delete");
        enter=scanner.nextLine();
        cellPhones.clear();
        
        savePersonsToJsonFile(cellPhones);
    }

    
    private static ArrayList<CellPhone> enterCellphone() {
        ArrayList<CellPhone> cellPhones = new ArrayList<>();
        CellPhone cellPhone;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("Enter id");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter brand ");
            String brand = scanner.nextLine();
            System.out.println("Enter price");
            float price = scanner.nextFloat();

            cellPhone = new CellPhone(id, brand, price);
            cellPhones.add(cellPhone);
        }

        return cellPhones;
    }

    private static String convertToJson(List<CellPhone> cellPhones) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(cellPhones);
    }

    private static void savePersonsToJsonFile(List<CellPhone> cellPhones) {
        String json = convertToJson(cellPhones);
        saveJsonToFile(json, "cellPhones.json");
    }

    private static void saveJsonToFile(String json, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(json);
            System.out.println("Archivo guardado exitosamente como " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
