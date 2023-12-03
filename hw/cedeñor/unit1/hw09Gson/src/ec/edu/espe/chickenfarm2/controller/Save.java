/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm2.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.chickenfarm2.model.Coop;
import java.io.File;
import java.io.PrintWriter;

public class Save {
    public void saveInfo(Coop coop){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String gsonCoop = gson.toJson(coop);
        System.out.println("<----Chicken List---->");
        System.out.println(gsonCoop);      
        try(PrintWriter printWriter = new PrintWriter(new File("chickenList.json"))){
            printWriter.write(gsonCoop);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
