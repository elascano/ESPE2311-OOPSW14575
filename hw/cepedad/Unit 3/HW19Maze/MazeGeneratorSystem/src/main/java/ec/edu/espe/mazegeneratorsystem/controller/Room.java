package ec.edu.espe.mazegeneratorsystem.controller;

import ec.edu.espe.mazegeneratorsystem.model.Door;
import ec.edu.espe.mazegeneratorsystem.model.Wall;

/**
 *
 * @author David
 */
public class Room {
    private Wall[] walls;
    private Door[] doors;
    private int numberOfWalls;
    private int numberOfDoors;

    public Room(Wall[] walls, Door[] doors, int numberOfWalls, int numberOfDoors) {
        this.walls = walls;
        this.doors = doors;
        this.numberOfWalls = numberOfWalls;
        this.numberOfDoors = numberOfDoors;
    }
    
    public void createDoors() {
    }
    
    public void createWalls() {
    }
    public void verifyDoorsAndBuild() {
    }
}
