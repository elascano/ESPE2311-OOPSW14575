
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Juan Granda
 */
public class Centipedes extends Arthropods{
    private boolean shell;
    private String size;

    public Centipedes(boolean shell, String size, int legs, int eyes, int athens, int endoskeleton, int quantityOfLegs, String feedType, String habitat, int id, String scietificName, Date BornDate, int cageld) {
        super(legs, eyes, athens, endoskeleton, quantityOfLegs, feedType, habitat, id, scietificName, BornDate, cageld);
        this.shell = shell;
        this.size = size;
    }

    

    @Override
    public String toString() {
        return "Centipedes{" + super.toString() + ", shell=" + shell + ", size=" + size + '}';
    }

    public boolean isShell() {
        return shell;
    }

    public void setShell(boolean shell) {
        this.shell = shell;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void feed() {
    }
    
    
}
