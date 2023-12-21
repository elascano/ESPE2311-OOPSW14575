package ec.espe.edu.dinosaur.model;

/**
 *
 * @author Frederick
 */
public class Dinosaur {
    private int id;
    
    private int height;
    private int weight;
    private boolean isFighting;

    @Override
    public String toString() {
        return  "\n id ----> " + id + "\n height ----> " + height + "\n weight ----> " + weight + "\n isFighting ----> " + isFighting + '}';
    }
    

    public Dinosaur(int id, int height, int weight, boolean isFighting) {
        this.id = id;
        this.height = height;
        this.weight = weight;
        this.isFighting = isFighting;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @return the isFighting
     */
    public boolean isIsFighting() {
        return isFighting;
    }

    /**
     * @param isFighting the isFighting to set
     */
    public void setIsFighting(boolean isFighting) {
        this.isFighting = isFighting;
    }
    
    
    
}
