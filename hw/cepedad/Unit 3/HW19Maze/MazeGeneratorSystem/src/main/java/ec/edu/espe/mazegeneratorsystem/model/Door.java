package ec.edu.espe.mazegeneratorsystem.model;

import ec.edu.espe.mazegeneratorsystem.controller.Room;

/**
 *
 * @author David
 */
public abstract class Door {
    protected Room room;
    protected boolean isOpen;
    protected boolean isClosed;

    public Door(Room room, boolean isOpen, boolean isClosed) {
        this.room = room;
        this.isOpen = isOpen;
        this.isClosed = isClosed;
    }

    public void open(){
        if (isClosed) {
            isOpen = true;
            isClosed = false;
        }
    }
    public void close() {
        if (isOpen) {
            isOpen = false;
            isClosed = true;
        }
    }
}
