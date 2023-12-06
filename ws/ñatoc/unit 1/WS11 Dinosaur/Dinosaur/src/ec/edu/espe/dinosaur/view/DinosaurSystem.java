package ec.edu.espe.dinosaur.view;

import com.google.gson.Gson;
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
 * @author Carlos Ñato, The Javas, DCC-ESPE
 */

public class DinosaurSystem {

    public static void main(String[] args) {

        try {
            String filePath = "C:\\Users\\Lenovo\\OneDrive\\Documentos\\NetBeansProjects\\AbrirJson\\Dinosaur.json";

            
 

            JsonParser parser = new JsonParser();


            JsonArray jsonArray = parser.parse(new FileReader(filePath)).getAsJsonArray();
            
            List<Dinosaur> dinosaurs = new ArrayList<>();

            for (JsonElement element : jsonArray) {
                
       
                JsonObject dinosaurJs = element.getAsJsonObject();

                Dinosaur dino = new Dinosaur(
                        
                        dinosaurJs.get("id").getAsInt(),
                        dinosaurJs.get("name").getAsString(),
                        dinosaurJs.get("color").getAsString(),
                        dinosaurJs.get("age").getAsInt());
                
               
                dinosaurs.add(dino);
            }

           
            for (Dinosaur dino : dinosaurs) {
                
                System.out.println("Id: " + dino.getId());
                System.out.println("Name: " + dino.getName());
                System.out.println("Colo: " + dino.getColor());
                System.out.println("Age: " + dino.getAge());
                System.out.println();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



    
    
    

