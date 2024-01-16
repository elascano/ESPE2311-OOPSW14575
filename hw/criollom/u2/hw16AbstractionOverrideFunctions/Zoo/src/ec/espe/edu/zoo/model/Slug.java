
package ec.espe.edu.zoo.model;

import java.util.Date;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class Slug extends Mollusk{
    private int quantityOfAntenna;

    public Slug(int quantityOfAntenna, boolean shell, String locomotion, String symmetry, int quantityOfLimbs, String feedType, String habitad, String reproduction, int id, String ciemtificName, Date bornOnDate, int cageId) {
        super(shell, locomotion, symmetry, quantityOfLimbs, feedType, habitad, reproduction, id, ciemtificName, bornOnDate, cageId);
        this.quantityOfAntenna = quantityOfAntenna;
    }

    
    @Override
    public String toString() {
        return "Slug{" +super.toString()+ "quantityOfAntenna=" + getQuantityOfAntenna() + '}';
    }

    /**
     * @return the quantityOfAntenna
     */
    public int getQuantityOfAntenna() {
        return quantityOfAntenna;
    }

    /**
     * @param quantityOfAntenna the quantityOfAntenna to set
     */
    public void setQuantityOfAntenna(int quantityOfAntenna) {
        this.quantityOfAntenna = quantityOfAntenna;
    }
    
    public void sing(){
        
    }
    
    public void createSilk(){
        
    }
    
    @Override
    public void pushOn(){
        System.out.println("The Slug is activate/moving, not important temperature");
    }
    
    public void pushOn(int roomTemperature ){
        if(roomTemperature<=5){
            System.out.println("Temperature "+roomTemperature+":The Slug is not active/sleeping");
        }else{
            System.out.println("Temperature "+roomTemperature+":The Slug is activate/moving");
        }
    }

    @Override
    public void breathe() {
        System.out.println("The slug breathes through lung and mantle cavity");
    }
}
