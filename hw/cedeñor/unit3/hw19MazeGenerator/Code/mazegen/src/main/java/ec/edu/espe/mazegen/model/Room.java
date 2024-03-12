package ec.edu.espe.mazegen.model;

public class Room {
    private RoomElement[] roomElements;
    private int posX;
    private int posY;
    private boolean isStartingRoom = false;

    private boolean isFinishRoom = false;

    public Room(int posX, int posY) {
        this.roomElements = new RoomElement[4];
        for (int i = 0; i < roomElements.length; i++) {
            this.roomElements[i] = new Wall();
        }
        this.posX = posX;
        this.posY = posY;
    }

    public RoomElement[] getRoomElements() {
        return roomElements;
    }

    public RoomElement getRoomElement(int index) {
        return roomElements[index];
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public boolean isFinishRoom() {
        return isFinishRoom;
    }

    public void setFinishRoom(boolean isFinishRoom) {
        this.isFinishRoom = isFinishRoom;
    }

    public boolean isStartingRoom() {
        return isStartingRoom;
    }

    public void setStartingRoom(boolean isStartingRoom) {
        this.isStartingRoom = isStartingRoom;
    }
}
