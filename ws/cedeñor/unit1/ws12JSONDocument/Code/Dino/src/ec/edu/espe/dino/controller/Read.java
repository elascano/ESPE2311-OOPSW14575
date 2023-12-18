/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.dino.controller;

/**
 *
 * @author RC_558
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.dino.model.JurassicPark;
import java.io.File;
import java.io.PrintWriter;

public class Read {
    public void readInfo(JurassicPark park){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String gsonPark = gson.toJson(park);
        System.out.println("<----Dino List---->");
        System.out.println(gsonPark);      
        try(PrintWriter printWriter = new PrintWriter(new File("dinoList.json"))){
            printWriter.write(gsonPark);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
