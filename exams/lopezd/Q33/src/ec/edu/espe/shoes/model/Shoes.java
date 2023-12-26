
package ec.edu.espe.shoes.model;

 /*
 * @author David Lopez
 */
public class Shoes {
    private int id;
    private String color;
    private int size;

    @Override
    public String toString() {
        return "Shoes{" + "id=" + id + ", color=" + color + ", size=" + size + '}';
    }

    public Shoes(int id, String color, int size) {
        this.id = id;
        this.color = color;
        this.size = size;
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
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
}

