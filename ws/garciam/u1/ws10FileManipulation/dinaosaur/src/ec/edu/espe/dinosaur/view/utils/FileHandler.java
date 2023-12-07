/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.dinosaur.view.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.dinosaur.models.Dinosaur;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mateo
 */
public class FileHandler {

    public void readFile() {
        String filePath = "./dinosaur.json";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line = reader.readLine();

            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Dinosaur> readDinosaurList(String path) {
        List<Dinosaur> listaPersonas = new ArrayList<>();

        try (Reader reader = new FileReader(path)) {
            Type listType = new TypeToken<ArrayList<Dinosaur>>() {
            }.getType();
            listaPersonas = new Gson().fromJson(reader, listType);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaPersonas;
    }

}
