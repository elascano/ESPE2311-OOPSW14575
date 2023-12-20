
package ec.edu.espe.FornitureSystem.view;

import ec.edu.espe.FornitureSystem.model.Forniture;
import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class MainFornitureSystem {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Forniture> fornitures = new ArrayList<>();

    public static void main(String[] args) {
        try {
            while (true) {
                mostrarMenu();
                int opcion = scanner.nextInt();
                ejecutarOpcion(opcion);
                if (opcion == 4) {
                    break;
                }
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Please enter a valid number.");
        } finally {
            scanner.close();
        }
    }

    private static void mostrarMenu() {
        System.out.println("Select an option:");
        System.out.println("1. Add furniture");
        System.out.println("2. Create JSON file");
        System.out.println("3. view all the furniture");
        System.out.println("4. Exit");
    }

    private static void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                addFurniture();
                break;
            case 2:
                crearArchivoJson();
                break;
            case 3:
                showallfurniture();
                break;
            case 4:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    private static void addFurniture() {
        System.out.println("Enter the name of the furniture:");
        String nombre = scanner.next();
        System.out.println("enter the weight of the furniture");
        int cantidad = scanner.nextInt();
        Forniture suministro = new Forniture(nombre, cantidad);
        fornitures.add(suministro);
        System.out.println("furniture added correctly.");
    }

    private static void crearArchivoJson() {
      JSONArray jsonArray = new JSONArray();
    for (Forniture forniture : fornitures) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", forniture.getName());
        jsonObject.put("weight", forniture.getId());
        jsonArray.put(jsonObject);
    }

    try (FileWriter fileWriter = new FileWriter("furniture.json")) {
        fileWriter.write(jsonArray.toString(2));
        System.out.println("JSON successfully saved in furniture.json");
    } catch (IOException e) {
        System.out.println("Error saving JSON to file.");
        e.printStackTrace();
    }
}

    private static void showallfurniture() {
        System.out.println("Furnitures:");
        for (Forniture forniture : fornitures) {
            System.out.println(forniture);
        }
    }
}
