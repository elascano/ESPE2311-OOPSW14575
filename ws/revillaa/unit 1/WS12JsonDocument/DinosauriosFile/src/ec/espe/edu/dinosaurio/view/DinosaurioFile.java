package ec.espe.edu.dinosaurio.view;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Antonio Revilla
 */

public class DinosaurioFile {
    
    public static void main(String[] args) {   
    String nombreArchivo = "C:\\Users\\revil\\Documents\\Homework-7\\DinosauriosFile\\Dinosaurios.json";

        try {

            JsonArray datosJson = leerJson(nombreArchivo);

            imprimirDatos(datosJson);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static JsonArray leerJson(String nombreArchivo) throws IOException {
        try (JsonReader reader = Json.createReader(new FileReader(nombreArchivo))) {
            return reader.readArray();
        }
    }

    public static void imprimirDatos(JsonArray datosJson) {
        System.out.println("JSON file data: ");

        for (int i = 0; i < datosJson.size(); i++) {
            JsonObject dinosaurio = datosJson.getJsonObject(i);

            int id = dinosaurio.getInt("id");
            String name = dinosaurio.getString("name");
            String color = dinosaurio.getString("color");
            int size = dinosaurio.getInt("size");

            System.out.println("id: " + id);
            System.out.println("name: " + name);
            System.out.println("color: " + color);
            System.out.println("size: " + size);
            System.out.println();
        }
    }
}    
   
