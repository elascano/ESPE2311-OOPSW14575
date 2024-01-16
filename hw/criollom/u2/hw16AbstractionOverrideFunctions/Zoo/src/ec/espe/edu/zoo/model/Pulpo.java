
package ec.espe.edu.zoo.model;

import java.util.Date;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class Pulpo extends Mollusk {
    private int quantityOfSuctioCup;
    private String posion;

    public Pulpo(int quantityOfSuctioCup, String posion, boolean shell, String locomotion, String symmetry, int quantityOfLimbs, String feedType, String habitad, String reproduction, int id, String ciemtificName, Date bornOnDate, int cageId) {
        super(shell, locomotion, symmetry, quantityOfLimbs, feedType, habitad, reproduction, id, ciemtificName, bornOnDate, cageId);
        this.quantityOfSuctioCup = quantityOfSuctioCup;
        this.posion = posion;
    }

    @Override
    public String toString() {
        return "Pulpo{" +super.toString()+ "quantityOfSuctioCup=" + getQuantityOfSuctioCup() + ", posion=" + getPosion() + '}';
    }

    /**
     * @return the quantityOfSuctioCup
     */
    public int getQuantityOfSuctioCup() {
        return quantityOfSuctioCup;
    }

    /**
     * @param quantityOfSuctioCup the quantityOfSuctioCup to set
     */
    public void setQuantityOfSuctioCup(int quantityOfSuctioCup) {
        this.quantityOfSuctioCup = quantityOfSuctioCup;
    }

    /**
     * @return the posion
     */
    public String getPosion() {
        return posion;
    }

    /**
     * @param posion the posion to set
     */
    public void setPosion(String posion) {
        this.posion = posion;
    }
    
    public void envenom(){
        
    }

    @Override
    public void breathe() {
        System.out.println("The pulpo breathes through gills, mantle cavity and siphon");
    }
    
    
    
}
