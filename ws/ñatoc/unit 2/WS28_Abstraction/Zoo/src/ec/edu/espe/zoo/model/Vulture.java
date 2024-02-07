
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Carlos Ñato, The Javas, DCC-ESPE
 */
public class Vulture extends Bird{
    
    private boolean newWorld;

    public Vulture(boolean newWorld, int beak, String habitat, int size, int id, String cientificName, Date bornDate, int cageId) {
        super(beak, habitat, habitat, size, id, cientificName, bornDate, cageId);
        this.newWorld = newWorld;
    }
        @Override
    public void feed(){
            System.out.println("vulture is eating carrion");
    };


    @Override
    public String toString() {
        return "Vulture{" + super.toString()+ "newWorld=" + newWorld + '}';
    }

    public boolean isNewWorld() {
        return newWorld;
    }

    public void setNewWorld(boolean newWorld) {
        this.newWorld = newWorld;
    }
    

    

    }
    
    
    
    
    
    
    

