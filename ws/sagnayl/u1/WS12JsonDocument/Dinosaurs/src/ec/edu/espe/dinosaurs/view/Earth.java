package ec.edu.espe.dinosaurs.view;

import ec.edu.espe.dinosaurs.model.Dinosaur;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Luis Sagnay
 */
public class Earth {
    public static void main(String[] args) throws JSONException {
        try {
            String contenido = new String(Files.readAllBytes(Paths.get("C:\\Users\\Luis Sagnay\\Desktop\\ESPE\\OOP\\Dinosaurs\\dinosaur.json")));

            JSONObject jsonObject = new JSONObject(contenido);

            JSONArray dinosaurs = jsonObject.getJSONArray("dinosaurs");

            for (int i = 0; i < dinosaurs.length(); i++) {
                JSONObject dinosaurJSON = dinosaurs.getJSONObject(i);

                int id = dinosaurJSON.getInt("id");
                String name = dinosaurJSON.getString("name");
                String color = dinosaurJSON.getString("color");
                String species = dinosaurJSON.getString("species");

                Dinosaur dinosaur = new Dinosaur(id, name, color, species);

                System.out.println(dinosaur);
            }   
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
