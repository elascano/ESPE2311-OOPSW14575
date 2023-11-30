package ec.edu.espe.ChickenFarm.utils;

import com.google.gson.Gson; 
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.ChickenFarm.model.Chicken;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 *
 * @author Frederick Tipán - Bit Coderz - DCCO ESPE
 */
public class ManageJson {
    
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
    
    /*
    public static void main(String[] args) throws IOException {
        
      ArrayList<Chicken> chickenList;
      
      File file = new File("chickens.json");
      
      if(file.exists()){
          try{
              FileReader fileReader = new FileReader(file);
              Type type = new TypeToken<ArrayList<Chicken>>(){}.getType();
              Gson gson = new GsonBuilder().setPrettyPrinting().create();
              
              chickenList=gson.fromJson(fileReader, type);
              fileReader.close();
              
              for(Chicken currentChicken :chickenList){
                System.out.print("\nChicken " + currentChicken);
              }
          }catch(FileNotFoundException e){
              System.err.println("Error in creating the File Reader Object");
          }catch(IOException e){
              throw new RuntimeException(e);
          }
      }else{
          chickenList = new ArrayList<>();
          Date birthdate = new Date(1,4,2022);
          Chicken chicken1 = new Chicken(1,"Lucy","brown",birthdate,1,false);
          Chicken chicken2 = new Chicken(2,"Martha","brown",birthdate,1,false);
          Chicken chicken3 = new Chicken(3,"Elva","brown",birthdate,1,false);
          chickenList.add(chicken1);
          chickenList.add(chicken2);
          chickenList.add(chicken3);
          
          try{
              FileWriter fileWriter = new FileWriter(file);
              Gson gson = new GsonBuilder().setPrettyPrinting().create();
              gson.toJson(chickenList,fileWriter);
              fileWriter.close();
          
          }catch(IOException e){
              throw new RuntimeException(e);
          }
      }
   } */
    
}
