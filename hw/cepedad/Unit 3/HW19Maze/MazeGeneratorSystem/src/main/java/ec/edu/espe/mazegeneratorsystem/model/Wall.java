package ec.edu.espe.mazegeneratorsystem.model;

import ec.edu.espe.mazegeneratorsystem.controller.Room;

/**
 *
 * @author David
 */
public class Wall {
    public Room[][] createRooms(int width, int height){
        return new Room[height][width];
    }
}
