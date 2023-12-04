package ec.edu.espe.dinosaur.view;

import ec.edu.espe.dinosaur.models.Dinosaur;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import ec.edu.espe.dinosaur.view.utils.FileHandler;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mateo
 */
public class Dinaosaur {

    public static void main(String[] args) {
        List<Dinosaur> dinosaursReader = new ArrayList<>();
        FileHandler fileHandler = new FileHandler();
        dinosaursReader = fileHandler.readDinosaurList("./dinosaur.json");
        dinosaursReader.forEach(dino -> {
            dino.prettieDinosaurPrint();
        });
    }
    

}
