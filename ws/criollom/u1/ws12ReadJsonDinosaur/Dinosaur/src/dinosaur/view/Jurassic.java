package dinosaur.view;

import java.io.FileReader;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

/**
 *
 * author MateoCriollo
 */
public class Jurassic {
    public static void main(String[] args) {
        try {
            // Utilizando JSONTokener para leer desde un archivo
            JSONTokener tokener = new JSONTokener(new FileReader("C:\\Users\\MSI\\OneDrive\\Escritorio\\Dinosaur.json"));
            JSONObject jsonObject = new JSONObject(tokener);

            JSONArray array = jsonObject.getJSONArray("Dinosaurs");
            System.out.println();
            for (int i = 0; i < array.length(); i++) {
                JSONObject jsonObject1 = array.getJSONObject(i);

                System.out.println("Dinosaur");
                System.out.println("ID: " + i);
                System.out.println("Name: " + jsonObject1.getString("name"));
                System.out.println("Height: " + jsonObject1.getString("height"));
                System.out.println("Alimentation: " + jsonObject1.getString("alimentation"));

                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}