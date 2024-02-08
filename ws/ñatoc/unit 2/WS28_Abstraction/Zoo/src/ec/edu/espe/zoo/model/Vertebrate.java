
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Carlos Ñato, The Javas, DCC-ESPE
 */
public abstract class Vertebrate extends Animal{
    private String habitat;
    private int size;

    public Vertebrate(String habitat, String spine, int size, int id, String cientificName, Date bornDate, int cageId) {
        super(id, cientificName, bornDate, cageId);
        this.habitat = habitat;
        this.size = size;
    }
    

    public void hunt(){
    
    };

    @Override
    public String toString() {
        return super.toString()+"Vertebrate{" + "habitat=" + habitat + ", size=" + size + '}';
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
  
    


 
    
}
