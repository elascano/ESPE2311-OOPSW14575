package ec.edu.espe.mazegeneratorsystem.model;

import ec.edu.espe.mazegeneratorsystem.controller.Room;

/**
 *
 * @author David
 */
public class EntranceDoor extends Door {
    public EntranceDoor(Room room, boolean isOpen, boolean isClosed) {
        super(room, isOpen, isClosed);
    }
    public boolean startTheMaze(){
        return true;
    }
}
