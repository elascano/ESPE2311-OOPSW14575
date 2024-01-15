
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Carlos Ñato, The Javas, DCC-ESPE
 */
public class Vulture extends bird{
    
    private boolean newWorld;
    
    public Vulture(boolean poisoness, int poisonGlands, int numberOfMammaryGlands, String spine, int numberOfBones, int id, String cientificName, Date bornDate, int cageId, boolean newWorld) {
        super(numberOfMammaryGlands, spine, numberOfBones, id, cientificName, bornDate, cageId);
       this.newWorld=newWorld;
    }

    @Override
    public String toString() {
        return "Vulture{" +super.toString() +"newWorld : "+newWorld+'}';
    }

    public boolean isNewWorld() {
        return newWorld;
    }

    public void setNewWorld(boolean newWorld) {
        this.newWorld = newWorld;
    }
    

    }
    
    
    
    
    
    
    

