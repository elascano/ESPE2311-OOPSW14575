package ec.edu.espe.mazegeneratorsystem.controller;

import ec.edu.espe.mazegeneratorsystem.model.Door;
import java.util.ArrayList;

/**
 *
 * @author David
 */
public class Path {
     private ArrayList<Door> doors;

    public Path(ArrayList<Door> doors) {
        this.doors = doors;
    }
     
    public void generateSolution() {
    }
    
    public boolean validate() {
        return true;
    }
    
    public boolean connectEntranceWithExit() {
        return true;
    }
}
