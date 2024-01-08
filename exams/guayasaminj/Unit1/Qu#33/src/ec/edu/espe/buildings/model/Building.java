
package ec.edu.espe.buildings.model;



/**
 *
 * @author JosuéG
 */
public class Building {
    private int id; 
    private String color;
    private int floors;

    public Building(int id, String color, int floors) {
        this.id = id;
        this.color = color;
        this.floors = floors;
    }
@Override
    public String toString() {
        return "Building{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", floors=" + floors +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
   
   
       
        
        
        
 
   
    
}
