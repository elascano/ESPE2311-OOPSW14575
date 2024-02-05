
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Carlos Ñato, The Javas, DCC-ESPE
 */
public abstract class Bird extends Vertebrate {
    private int beak;
    
    public void fly(){
        System.out.println("Flying bird");
    
    };

    public Bird(int beak, String habitat, String spine, int size, int id, String cientificName, Date bornDate, int cageId) {
        super(habitat, spine, size, id, cientificName, bornDate, cageId);
        this.beak = beak;
    }

    @Override
    public String toString() {
        return "bird{"+super.toString() + "beak=" + beak + '}';
    }

    public int getBeak() {
        return beak;
    }

    public void setBeak(int beak) {
        this.beak = beak;
    }
    
    

    
}
