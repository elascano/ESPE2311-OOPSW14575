package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Luis Sagnay
 */
public class Fish extends Vertebrate{
    private boolean itHasScales;
    
    public void swim(){
        System.out.println("The fish is swiming");
    }

    public Fish(boolean itHasScales, String sping, int numberOfBones, int id, String scientificName, Date bornDate, int cageId) {
        super(sping, numberOfBones, id, scientificName, bornDate, cageId);
        this.itHasScales = itHasScales;
    }

    @Override
    public String toString() {
        return "Fish{" + "itHasScales=" + itHasScales + '}';
    }    

    /**
     * @return the itHasScales
     */
    public boolean isItHasScales() {
        return itHasScales;
    }

    /**
     * @param itHasScales the itHasScales to set
     */
    public void setItHasScales(boolean itHasScales) {
        this.itHasScales = itHasScales;
    }

}
