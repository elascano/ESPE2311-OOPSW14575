package ec.edu.espe.dinosaur.view;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import ec.edu.espe.dinosaur.model.Dinosaur;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JuanGranda,Error 404,DCCO-ESPE
 */

public class DinosaurSystem {

    public static void main(String[] args) {

        try {
            String filePath = "C:\\Users\\WILLIAM\\Desktop\\Juan Granda\\Homework\\Dinosaur\\Dinosaur.json";

            JsonParser parser = new JsonParser();

            JsonObject jsonObject = parser.parse(new FileReader(filePath)).getAsJsonObject();
            JsonArray jsonArray = jsonObject.getAsJsonArray("Dinosaur");

            List<Dinosaur> dinosaurs = new ArrayList<>();

            for (JsonElement element : jsonArray) {
                JsonObject dinosaurJs = element.getAsJsonObject();

                Dinosaur dino = new Dinosaur(
                        dinosaurJs.get("id").getAsInt(),
                        dinosaurJs.get("name").getAsString(),
                        dinosaurJs.get("color").getAsString(),
                        parseInt(dinosaurJs.get("age").getAsString().trim())); 

                dinosaurs.add(dino);
            }

            for (Dinosaur dino : dinosaurs) {
                System.out.println("Id: " + dino.getId());
                System.out.println("Name: " + dino.getName());
                System.out.println("Color: " + dino.getColor());
                System.out.println("Age: " + dino.getAge());
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int parseInt(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return 0;
        }
    }
}

