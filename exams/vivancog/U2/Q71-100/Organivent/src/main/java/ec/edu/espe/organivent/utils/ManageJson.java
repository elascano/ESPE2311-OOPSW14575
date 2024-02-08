package ec.edu.espe.organivent.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.Primitives;
import com.google.gson.reflect.TypeToken;
import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Projections.excludeId;
import static com.mongodb.client.model.Projections.fields;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author Gabriel Vivanco
 */
public class ManageJson {
    
    public static <T> ArrayList<T> readFile(String fileAdress, Type type){
        
        File theFile = new File(fileAdress);
        ArrayList<T> objectList = new ArrayList<>();
        
        if(theFile.exists()){
            
            try{
                FileReader fileReader = new FileReader(fileAdress);
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
              
                objectList=gson.fromJson(fileReader, type);
                fileReader.close();
                
            }catch(FileNotFoundException e){
                System.err.println("Error in creating the File Reader Object");
            }catch(IOException e){
                throw new RuntimeException(e);
            }
            
        }else{
            writeFile(fileAdress,objectList);
        }
        return objectList;
    }
    
    
    public static <T> void writeFile(String fileAdress,ArrayList<T> objectList){         
          try{
              FileWriter fileWriter = new FileWriter(fileAdress);
              Gson gson = new GsonBuilder().setPrettyPrinting().create();
              gson.toJson(objectList,fileWriter);
              fileWriter.close();
          
          }catch(IOException e){
              throw new RuntimeException(e);
          }
    }
    
    public static <T> T passJsonToObject(Document doc, Class classType){
        String jsonData = doc.toJson();
        Gson gson = new Gson();
        
        T object = (T) gson.fromJson(jsonData, TypeToken.get(classType));
        return (T) Primitives.wrap(classType).cast(object);
    }
    
    public static <T> ArrayList<T> passCollectionToList(MongoCollection coll, Class classType){
        ArrayList<T> objectList = new ArrayList<>();
        T objectInDB;
        
        List<Document> docList;
        docList = (List<Document>) coll.find().projection(fields(excludeId())).into(new ArrayList<>());
        
        for (Document currentDoc : docList) {
            objectInDB = passJsonToObject(currentDoc, classType);
            objectList.add(objectInDB);
        }
        
        return objectList;
    }
    
    public static <T> String passObjectToJson(T Object){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(Object);
    }
    
}
