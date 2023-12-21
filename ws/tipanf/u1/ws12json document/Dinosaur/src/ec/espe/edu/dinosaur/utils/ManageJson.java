
package ec.espe.edu.dinosaur.utils;

import com.google.gson.Gson; 
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import ec.espe.edu.dinosaur.model.Dinosaur;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 *
 * @author Frederick
 */
public class ManageJson {
    
    public ArrayList<Dinosaur> readFile(String fileAdress){
        ArrayList<Dinosaur> dinosaurs = null;
        try{
              FileReader fileReader = new FileReader(fileAdress);
              Type type = new TypeToken<ArrayList<Dinosaur>>(){}.getType();
              Gson gson = new GsonBuilder().setPrettyPrinting().create();
              
              dinosaurs=gson.fromJson(fileReader, type);
              fileReader.close();
              
          }catch(FileNotFoundException e){
              System.err.println("Error in creating the File Reader Object");
          }catch(IOException e){
              throw new RuntimeException(e);
          }
        return dinosaurs;
    }
    
    public void writeFile(String fileAdress,ArrayList<Dinosaur> disaurs){         
          try{
              FileWriter fileWriter = new FileWriter(fileAdress);
              Gson gson = new GsonBuilder().setPrettyPrinting().create();
              gson.toJson(disaurs,fileWriter);
              fileWriter.close();
          
          }catch(IOException e){
              throw new RuntimeException(e);
          }
    }
    
}
