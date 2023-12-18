package ec.edu.espe.chickensm.utils;

import com.google.gson.Gson; 
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.chickensm.model.Chicken;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 *
 * @author Carlos Hernandez
 */
public class UseJson {
     public ArrayList<Chicken> readFile(String fileAdress){
        ArrayList<Chicken> chickens = null;
        try{
              FileReader fileReader = new FileReader(fileAdress);
              Type type = new TypeToken<ArrayList<Chicken>>(){}.getType();
              Gson gson = new GsonBuilder().setPrettyPrinting().create();
              
              chickens=gson.fromJson(fileReader, type);
              fileReader.close();
              
          }catch(FileNotFoundException e){
              System.err.println("Error in creating the File Reader Object");
          }catch(IOException e){
              throw new RuntimeException(e);
          }
        return chickens;
    }
    
    public void writeFile(String fileAdress,ArrayList<Chicken> chickens){         
          try{
              FileWriter fileWriter = new FileWriter(fileAdress);
              Gson gson = new GsonBuilder().setPrettyPrinting().create();
              gson.toJson(chickens,fileWriter);
              fileWriter.close();
          
          }catch(IOException e){
              throw new RuntimeException(e);
          }
    }
}
