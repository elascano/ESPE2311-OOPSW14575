
package ec.edu.espe.view;

import ec.edu.espe.model.Chicken;
import ec.edu.espe.model.Egg;
import ec.edu.espe.model.Poop;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONObject;

public class ChickenFarmSystem {

    private static final String CSV_FILE_PATH = "chickens_data.csv";
    private static final String JSON_FILE_PATH = "chickens_data.json";

    public static void main(String[] args) {
        // Crear un arreglo de pollos y leer datos existentes desde el archivo CSV
        List<Chicken> chickens = readDataFromCSV();

        // Crear instancias de otras clases
        Poop poop = new Poop();
        Egg egg = new Egg();

        // Crear un bucle para el menú
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Ingresar un Chicken");
            System.out.println("2. Eliminar un Chicken");
            System.out.println("3. Imprimir todos los datos");
            System.out.println("4. Crear un archivo JSON");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea pendiente

            switch (option) {
                case 1 -> {
                    // Ingresar un Chicken
                    Chicken newChicken = enterChickenData(scanner);
                    chickens.add(newChicken);
                }
                case 2 -> // Eliminar un Chicken
                    deleteChicken(chickens, scanner);
                case 3 -> // Imprimir todos los datos
                    printAllData(chickens, poop, egg);
                case 4 -> // Crear un archivo JSON
                    writeDataToJSON(chickens);
                case 5 -> // Salir
                    exit = true;
                default -> System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }

        // Escribir los datos actualizados en el archivo CSV al salir
        writeDataToCSV(chickens);
    }

    private static Chicken enterChickenData(Scanner scanner) {
        // Solicitar datos para un nuevo Chicken
        System.out.println("Ingrese los datos para el nuevo Chicken:");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea pendiente

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Color: ");
        String color = scanner.nextLine();

        System.out.print("Fecha de Nacimiento (YYYY-MM-DD): ");
        String birthDateInput = scanner.nextLine();

        // Convertir la cadena de fecha a LocalDate
        LocalDate birthDate = LocalDate.parse(birthDateInput);

        System.out.print("¿Is Molting? (true/false): ");
        boolean isMolting = scanner.nextBoolean();

        // Calcular la edad
        int age = calculateAge(birthDate);

        return new Chicken(id, name, color, birthDate, isMolting, age);
    }

    private static int calculateAge(LocalDate birthDate) {
        // Calcular la edad basándose en la fecha de nacimiento
        LocalDate currentDate = LocalDate.now();
        return currentDate.getYear() - birthDate.getYear();
    }

    private static void deleteChicken(List<Chicken> chickens, Scanner scanner) {
        // Imprimir información de cada pollo antes de eliminar
        System.out.println("Pollos existentes:");
        for (Chicken chicken : chickens) {
            System.out.println("Chicken -->" + chicken);
        }

        // Solicitar ID del Chicken a eliminar
        System.out.print("Ingrese el ID del Chicken que desea eliminar: ");
        int idToDelete = scanner.nextInt();

        // Eliminar el Chicken con el ID proporcionado
        chickens.removeIf(chicken -> chicken.getId() == idToDelete);
        System.out.println("Chicken eliminado correctamente.");
    }

    private static void printAllData(List<Chicken> chickens, Poop poop, Egg egg) {
        // Imprimir información de cada pollo
        System.out.println("\nInformación de todos los pollos:");
        for (Chicken chicken : chickens) {
            System.out.println("Chicken -->" + chicken);
        }

        // Imprimir información adicional
        System.out.println("Poop -->" + poop);
        System.out.println("Egg -->" + egg);
    }

    private static void writeDataToCSV(List<Chicken> chickens) {
        try (CSVWriter writer = new CSVWriter(new FileWriter(CSV_FILE_PATH))) {
            // Escribir la cabecera del archivo CSV
            String[] header = {"ID", "Name", "Color", "BirthDate", "IsMolting", "Age"};
            writer.writeNext(header);

            // Escribir los datos de cada pollo en el archivo CSV
            for (Chicken chicken : chickens) {
                String[] data = {
                        String.valueOf(chicken.getId()),
                        chicken.getName(),
                        chicken.getColor(),
                        chicken.getBirthDate().toString(),
                        String.valueOf(chicken.isIsMolting()),
                        String.valueOf(chicken.getAge())
                };
                writer.writeNext(data);
            }

            System.out.println("Datos de pollos guardados en " + CSV_FILE_PATH);
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo CSV: " + e.getMessage());
        }
    }

  private static List<Chicken> readDataFromCSV() {
    List<Chicken> loadedChickens = new ArrayList<>();
    try (CSVReader reader = new CSVReader(new FileReader(CSV_FILE_PATH))) {
        // Leer la cabecera del archivo CSV
        String[] header = reader.readNext();

        // Leer los datos de cada pollo desde el archivo CSV
        String[] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            try {
                int id = Integer.parseInt(nextLine[0]);
                String name = nextLine[1];
                String color = nextLine[2];
                LocalDate birthDate = LocalDate.parse(nextLine[3]);
                boolean isMolting = Boolean.parseBoolean(nextLine[4]);
                int age = Integer.parseInt(nextLine[5]);

                Chicken chicken = new Chicken(id, name, color, birthDate, isMolting, age);
                loadedChickens.add(chicken);
            } catch (DateTimeParseException | NumberFormatException e) {
                System.out.println("Error al procesar una línea del archivo CSV: " + e.getMessage());
                // Puedes manejar el error según tus necesidades, por ejemplo, omitir la línea o mostrar un mensaje de error
            }
        }
    } catch (IOException | CsvValidationException e) {
        System.out.println("Error al leer el archivo CSV: " + e.getMessage());
    }
    return loadedChickens;
}

    private static void writeDataToJSON(List<Chicken> chickens) {
        // Crear un objeto JSON contenedor
        JSONObject jsonContainer = new JSONObject();

        // Crear un array JSON para los pollos
        JSONArray jsonChickens = new JSONArray();

        // Agregar cada pollo al array JSON
        for (Chicken chicken : chickens) {
            JSONObject jsonChicken = new JSONObject();
            jsonChicken.put("id", chicken.getId());
            jsonChicken.put("name", chicken.getName());
            jsonChicken.put("Color", chicken.getColor());
            jsonChicken.put("age", chicken.getAge());
            jsonChicken.put("IsMolting", chicken.isIsMolting());

            jsonChickens.put(jsonChicken);
        }

        // Agregar el array JSON de pollos al contenedor
        jsonContainer.put("Chicken", jsonChickens);

        // Escribir el JSON en un archivo
        try (FileWriter writer = new FileWriter(JSON_FILE_PATH)) {
            writer.write(jsonContainer.toString(4)); // El segundo argumento indica la cantidad de espacios de indentación
            System.out.println("Datos de pollos guardados en " + JSON_FILE_PATH);
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo JSON: " + e.getMessage());
        }
    }
}
