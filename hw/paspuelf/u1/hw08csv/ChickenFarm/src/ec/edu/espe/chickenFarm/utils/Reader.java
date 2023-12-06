/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenFarm.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Olivier Paspuel
 */
public class Reader {

    public static void readFile() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("chickensDB.txt"));
            String line;
            while((line = reader.readLine())!= null){
                System.out.println(line);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
