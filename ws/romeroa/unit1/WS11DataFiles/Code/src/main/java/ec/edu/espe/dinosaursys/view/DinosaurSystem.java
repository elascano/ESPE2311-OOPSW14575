package ec.edu.espe.dinosaursys.view;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.reflect.TypeToken;

import ec.edu.espe.dinosaursys.model.Dinosaur;
import ec.edu.espe.dinosaursys.utils.JsonHandler;

/**
 * @author Andrés Romero
 */
public class DinosaurSystem {
    private static ArrayList<Dinosaur> allDinosaurs = new ArrayList<>();
    private static final String SAVE_FILE_NAME = "dinosaurs.json";

    public static void main(String[] args) {
        // allDinosaurs.add(new Dinosaur(1, -2800000000L, "Chordata", "Tyrannosaurus Rex"));
        // allDinosaurs.add(new Dinosaur(2, -2500000000L, "Chordata", "Triceratops"));
        // allDinosaurs.add(new Dinosaur(3, -3000000000L, "Chordata", "Stegosaurus"));
        // allDinosaurs.add(new Dinosaur(4, -2500000000L, "Chordata", "Velociraptor"));
        // allDinosaurs.add(new Dinosaur(5, -2500000000L, "Chordata", "Brachiosaurus"));
        // try {
        //     JsonHandler.writeToJson(SAVE_FILE_NAME, allDinosaurs);
        // } catch (IOException e){}

        // Print all dinosaurs
        allDinosaurs = loadFromJson(SAVE_FILE_NAME);
        if (allDinosaurs.isEmpty()) {
            System.out.println("No dinosaurs found.");
        } else {
            System.out.println("All dinosaurs:");
            for (Dinosaur dinosaur : allDinosaurs) {
                System.out.println(dinosaur);
            }
        }
    }

    private static  ArrayList<Dinosaur> loadFromJson(String fileName) {
        Type listType = new TypeToken<ArrayList<Dinosaur>>(){}.getType();
        ArrayList<Dinosaur> data = new ArrayList<>();;
        try {
            data = JsonHandler.readFromJson(SAVE_FILE_NAME, listType);
        } catch (IOException e) {}
        return data;
    }
}
