package ec.edu.espe.Glasses.model;

/**
 *
 * @author Gabriel Vivanco - BIt Coderz
 */
public class Glasses {
    private int id;
    private String type;
    private String color;

    public Glasses(int id, String type, String color) {
        this.id = id;
        this.type = type;
        this.color = color;
    }

    @Override
    public String toString() {
        return "\n   id ---> " + getId() + "\n   type ---> " + getType() + "\n   color ---> " + getColor() +"\n";
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


  
}
