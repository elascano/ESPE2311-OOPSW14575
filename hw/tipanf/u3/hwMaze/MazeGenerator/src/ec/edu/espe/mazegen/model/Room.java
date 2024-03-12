package ec.edu.espe.mazegen.model;

/**
 *
 * @author Frederick
 */
public class Room {
    private int posX;
    private int posY;
    private Wall[] walls = new Wall[4];
    private String type;
    private boolean passed;

    public Room(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
        this.type = "default";
        this.passed = false;
        
        initializeWalls();
    }
    
    private void initializeWalls(){
        for(int i=0;i<4;i++){
            getWalls()[i] = new Wall(i);
        }
    }

    /**
     * @return the posX
     */
    public int getPosX() {
        return posX;
    }

    /**
     * @param posX the posX to set
     */
    public void setPosX(int posX) {
        this.posX = posX;
    }

    /**
     * @return the posY
     */
    public int getPosY() {
        return posY;
    }

    /**
     * @param posY the posY to set
     */
    public void setPosY(int posY) {
        this.posY = posY;
    }

    /**
     * @return the walls
     */
    public Wall[] getWalls() {
        return walls;
    }

    /**
     * @param walls the walls to set
     */
    public void setWalls(Wall[] walls) {
        this.walls = walls;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the passed
     */
    public boolean isPassed() {
        return passed;
    }

    /**
     * @param passed the passed to set
     */
    public void setPassed(boolean passed) {
        this.passed = passed;
    }

    
    
}
