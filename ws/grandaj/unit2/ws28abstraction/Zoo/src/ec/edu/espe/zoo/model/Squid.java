
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Juan Granda
 */
public class Squid extends Mollusks {
    private int tenculi;
    private int eye;

    public Squid(int tenculi, int eye, String shell, boolean mucousGland, int endoskeleton, int quantityOfLegs, String feedType, String habitat, int id, String scietificName, Date BornDate, int cageld) {
        super(shell, mucousGland, endoskeleton, quantityOfLegs, feedType, habitat, id, scietificName, BornDate, cageld);
        this.tenculi = tenculi;
        this.eye = eye;
    }

    

    @Override
    public String toString() {
        return "Squid{" + super.toString()+ ", tenculi=" + tenculi + ", eye=" + eye + '}';
    }

    public int getTenculi() {
        return tenculi;
    }

    public void setTenculi(int tenculi) {
        this.tenculi = tenculi;
    }

    public int getEye() {
        return eye;
    }

    public void setEye(int eye) {
        this.eye = eye;
    }
    
    
    
}
