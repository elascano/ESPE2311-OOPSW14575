package ec.espe.edu.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import ec.espe.edu.model.Parent;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.io.File;

/**
 *
 * @author Frederick - DCCO ESPE
 */
public class ManageJson {
    
     public static  Parent readFile(String fileAdress){
        
        File theFile = new File(fileAdress);
        Parent parent=null;
        
        if(theFile.exists()){
            
            try{
                FileReader fileReader = new FileReader(fileAdress);
                Type type = new TypeToken<Parent>(){}.getType();
              
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
              
                parent=gson.fromJson(fileReader, type);
                fileReader.close();
                
            }catch(FileNotFoundException e){
                System.err.println("Error in creating the File Reader Object");
            }catch(IOException e){
                throw new RuntimeException(e);
            }
            
        }else{
            writeFile(fileAdress,parent);
        }
        return parent;
    }
    
    
    public static void writeFile(String fileAdress,Parent objectList){         
          try{
              FileWriter fileWriter = new FileWriter(fileAdress);
              Gson gson = new GsonBuilder().setPrettyPrinting().create();
              gson.toJson(objectList,fileWriter);
              fileWriter.close();
          
          }catch(IOException e){
              throw new RuntimeException(e);
          }
    }
    
}
