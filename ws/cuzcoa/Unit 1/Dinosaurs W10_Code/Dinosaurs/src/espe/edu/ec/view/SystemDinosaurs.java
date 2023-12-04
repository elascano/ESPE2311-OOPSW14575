package espe.edu.ec.view;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import espe.edu.ec.model.Dinosaur;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Alex Cuzco, HoneyBadgers, DCCO-ESPE
 */
public class SystemDinosaurs {

    public static void main(String[] args) {
        
        //Dinosaur dino1 = new Dinosaur(1, "Tyrannosaurus Rex", "Adult", "Big");
        //Dinosaur dino2 = new Dinosaur(2, "Triceratops", "Young", "Medium");
        //Dinosaur dino3 = new Dinosaur(3, "Velociraptor", "Young", "little");
         Scanner namefile = new Scanner(System.in);
           Dinosaur dino1=new Dinosaur(1,"Tyrannosaurus Rex","Adult", "Big");
           Dinosaur dino2=new Dinosaur(2, "Triceratops", "Young", "Medium");
           Dinosaur dino3 = new Dinosaur(3, "Velociraptor", "Young", "little");
           Dinosaur dino4 = new Dinosaur(4, "Velociraptor", "Young", "little");
           
        List<Dinosaur> dinosaurList = new ArrayList<>();

        
        dinosaurList.add(dino1);
        dinosaurList.add(dino2);
        dinosaurList.add(dino3);
        dinosaurList.add(dino4);
        String nombre="archivo";
        System.out.println("ingrese el nombre del archivo: ");
        nombre=namefile.nextLine();
        
        for (Dinosaur dinosaur : dinosaurList) {
            System.out.println(dinosaur.toString());
       Gson objGson = new Gson();
       String strJson = objGson.toJson(dinosaur);
            //System.out.println(strJson);
            SystemDinosaurs archivo = new SystemDinosaurs();
            archivo.writeJSON(nombre,strJson);
        } 
        
       for (Dinosaur dinosaur : dinosaurList) {
       Gson objGson = new Gson();
       String strJson = objGson.toJson(dinosaur);
            System.out.println(strJson);
        } 
        
    }
    
        void writeJSON(String File, String strJson){

       try{
            FileWriter fileWriter = new FileWriter(File,true);
             BufferedWriter bufferedwriter=new BufferedWriter(fileWriter);
             PrintWriter printwriter = new PrintWriter(bufferedwriter);
             printwriter.println(strJson);
             
             printwriter.flush();
             printwriter.close();
             
       }catch (IOException e){
            System.out.println(e);    
    }
}
}

