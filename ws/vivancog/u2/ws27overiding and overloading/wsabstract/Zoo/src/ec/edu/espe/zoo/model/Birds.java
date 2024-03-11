package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Gabriel Vivanco
 */
public abstract class Birds extends Vertebrate{
    private int wings;
    private String feathers;
    
    public void buildNest(){
        
    }

    @Override
    public String toString() {
        return "Birds{"+super.toString() + "wings=" + wings + ", feathers=" + feathers + '}';
    }

    public Birds(int wings, String feathers, int id, String scientificName, Date bornDate, int cageId, String spine, int numberOfBones) {
        super(id, scientificName, bornDate, cageId, spine, numberOfBones);
        this.wings = wings;
        this.feathers = feathers;
    }
    
    

    /**
     * @return the wings
     */
    public int getWings() {
        return wings;
    }

    /**
     * @param wings the wings to set
     */
    public void setWings(int wings) {
        this.wings = wings;
    }

    /**
     * @return the feathers
     */
    public String getFeathers() {
        return feathers;
    }

    /**
     * @param feathers the feathers to set
     */
    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    @Override
    public void feed() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
  
}
