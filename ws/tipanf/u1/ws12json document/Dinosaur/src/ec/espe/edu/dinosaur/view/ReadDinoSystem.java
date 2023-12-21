package ec.espe.edu.dinosaur.view;

import ec.espe.edu.dinosaur.model.Dinosaur;
import ec.espe.edu.dinosaur.utils.ManageJson;
import java.util.ArrayList;

/**
 *
 * @author Frederick
 */
public class ReadDinoSystem {
    
    public static void main(String[] args){
        
        ManageJson file = new ManageJson();
        ArrayList<Dinosaur> dinosaurs = file.readFile("dinosaurs.json");
        
        int j=1;
        
        for(Dinosaur currentDinosaur : dinosaurs) {
            System.out.print("\n Dinosaur [" + j + "]: " + currentDinosaur);
            j++;
        }
        
        //menu(chickens);
    
    
    }
    
}
