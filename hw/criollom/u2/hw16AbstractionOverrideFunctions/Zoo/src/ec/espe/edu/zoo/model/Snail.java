
package ec.espe.edu.zoo.model;

import java.util.Date;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class Snail extends Mollusk {
    private float speed;

    public Snail(float speed, boolean shell, String locomotion, String symmetry, int quantityOfLimbs, String feedType, String habitad, String reproduction, int id, String ciemtificName, Date bornOnDate, int cageId) {
        super(shell, locomotion, symmetry, quantityOfLimbs, feedType, habitad, reproduction, id, ciemtificName, bornOnDate, cageId);
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Snail{" +super.toString()+ "speed=" + getSpeed() + '}';
    }

    /**
     * @return the speed
     */
    public float getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(float speed) {
        this.speed = speed;
    }
    
    public void regulateSpeed(){
        
    }
    
    public void secretePerfume(){
        
    }

    @Override
    public void breathe() {
        System.out.println("The snail breathes through the pulmonary chamber");
    }
}
