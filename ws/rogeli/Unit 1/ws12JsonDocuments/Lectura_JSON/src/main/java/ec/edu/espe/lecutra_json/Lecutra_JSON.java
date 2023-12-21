package ec.edu.espe.lecutra_json;
import ec.edu.espe.dinosaur.Dinosaurs;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Ilhan
 */
public class Lecutra_JSON {

    public static void main(String[] args) {
        Dinosaurs dinosaur = new Dinosaurs(123,"Pterodactyle",true,true);
        
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonFile =gson.toJson(dinosaur);
        String filepath = "C:\\Users\\HP\\Documents\\NetBeansProjects\\Lecutra_JSON";
        convertToJson(filepath,jsonFile);
        System.out.println(jsonFile);
    }
    
    private static void convertToJson(String filepath, String json) {
         try (BufferedWriter writer = new BufferedWriter(new FileWriter(new File(filepath)))) {
         writer.write(json);
            } catch (IOException e) {
                e.printStackTrace();
        }
    }
}

 

    



        
        
        
    

