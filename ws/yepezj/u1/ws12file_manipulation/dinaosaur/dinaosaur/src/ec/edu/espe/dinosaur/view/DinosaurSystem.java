package ec.edu.espe.dinosaur.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import ec.edu.espe.dinosaur.models.Dinosaur;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Jefferson David Yepez Moran, Bit Coderz, ESPE - DCCO
 */
public class DinosaurSystem {

    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String JSON_FILE = "dinosaur.json";
        try (BufferedReader reader = new BufferedReader(new FileReader(JSON_FILE))) {
            StringBuilder jsonContent = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                jsonContent.append(line);
            }
            JsonObject dinosaursObject = gson.fromJson(jsonContent.toString(), JsonObject.class);
            for (String key : dinosaursObject.keySet()) {
                try {
                    JsonObject dinosaurObject = dinosaursObject.getAsJsonObject(key);
                    System.out.println("Dinosaur (ID: " + key + "):");
                    System.out.println(gson.toJson(dinosaurObject));
                    System.out.println("------------------------------");
                } catch (JsonSyntaxException e) {
                    System.out.println("Error processing the event with ID." + key);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the JSON file.");
        }
    }

}
