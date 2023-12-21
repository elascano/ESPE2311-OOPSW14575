package ec.edu.espe.Glasses.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.Glasses.model.Glasses;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 *
 * @author Gabriel Vivanco - Bit Coderz 
 */
public class ManageJson {
        public ArrayList<Glasses> readFile(String fileAdress){
        ArrayList<Glasses> glasses = null;
        try{
              FileReader fileReader = new FileReader(fileAdress);
              Type type = new TypeToken<ArrayList<Glasses>>(){}.getType();
              Gson gson = new GsonBuilder().setPrettyPrinting().create();
              
              glasses=gson.fromJson(fileReader, type);
              fileReader.close();
              
          }catch(FileNotFoundException e){
              System.err.println("Error in creating the File Reader Object");
          }catch(IOException e){
              throw new RuntimeException(e);
          }
        return glasses;
    }
        
        public void writeFile(String fileAdress,ArrayList<Glasses> glasses){         
          try{
              FileWriter fileWriter = new FileWriter(fileAdress);
              Gson gson = new GsonBuilder().setPrettyPrinting().create();
              gson.toJson(glasses,fileWriter);
              fileWriter.close();
          
          }catch(IOException e){
              throw new RuntimeException(e);
          }
    }
}
