package turos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Dinosaurio {
    private String id;
    private String color;
    private String tipo;
    private int edad;

    public Dinosaurio(String id, String color, int edad, String tipo) {
        this.id = id;
        this.color = color;
        this.edad = edad;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Dinosaurio{" +
                "id='" + id + '\'' +
                ", color='" + color + '\'' +
                ", edad=" + edad +
                ", sexo='" + tipo + '\'' +
                '}';
    }

    public String toJson() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(this);
    }
}

public class DinosaurioManager {

    private static final String JSON_FILE_PATH = "dinosaurios.json";

    public static void main(String[] args) {
        List<Dinosaurio> dinosaurios = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese los datos del dinosaurio (o escriba 'fin' para salir):");

            System.out.print("ID: ");
            String id = scanner.nextLine();

            if (id.equalsIgnoreCase("fin")) {
                break;
            }
            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Color: ");
            String color = scanner.nextLine();

            System.out.print("Tipo: ");
            String sexo = scanner.nextLine();

            Dinosaurio dinosaurio = new Dinosaurio(id, color, edad, sexo);
            dinosaurios.add(dinosaurio);
        }

        guardarDatosEnArchivo(dinosaurios);

        System.out.println("Datos guardados en " + JSON_FILE_PATH);
    }

    private static void guardarDatosEnArchivo(List<Dinosaurio> dinosaurios) {
        try (FileWriter writer = new FileWriter(JSON_FILE_PATH)) {
            // Convertir cada dinosaurio a formato JSON y escribir en el archivo
            for (Dinosaurio dinosaurio : dinosaurios) {
                writer.write(dinosaurio.toJson() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}