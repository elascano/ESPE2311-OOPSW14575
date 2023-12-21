<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenFarm.utils;

import ec.edu.espe.chickenFarm.model.Chicken;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Olivier Paspuel
 */
public class Writer {

    public static void writeFile(Chicken[] chickens ) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("chickensDB.txt"));
            for(Chicken chicken: chickens){
                writer.write(chicken.toCsvString()+ "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenFarm.utils;

import ec.edu.espe.chickenFarm.model.Chicken;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Olivier Paspuel
 */
public class Writer {

    public static void writeFile(Chicken[] chickens ) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("chickensDB.txt"));
            for(Chicken chicken: chickens){
                writer.write(chicken.toCsvString()+ "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
>>>>>>> 7ad623e1c914bfdcb885f888488936540dbfba3f
