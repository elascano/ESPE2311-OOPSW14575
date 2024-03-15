package ec.edu.espe.mazesimulator.model;

/**
 *
 * @author Luis Sagnay
 */
public class Room {
    private boolean[] doors;

    public Room() {
        doors = new boolean[4];
        for (int i = 0; i < 4; i++) {
            doors[i] = false;
        }
    }

    public boolean hasDoor(int direction) {
        return doors[direction];
    }

    public void openDoor(int direction) {
        doors[direction] = true;
    }
}