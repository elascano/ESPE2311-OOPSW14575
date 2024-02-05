
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Carlos Ñato, The Javas, DCC-ESPE
 */
public class bird extends Vertebrate {
    private int beak;
    
    public void breastfeed(){
        System.out.println("chick eating 1");
    
    }

    public bird(int numberOfMammaryGlands, String spine, int numberOfBones, int id, String cientificName, Date bornDate, int cageId) {
        super(spine, numberOfBones, id, cientificName, bornDate, cageId);
        this.beak = numberOfMammaryGlands;
    }

    @Override
    public String toString() {
        return "bird{" +super.toString()+ "beak=" + beak + '}';
    }
    
    public void breastFeed(){};

    public int getBeak() {
        return beak;
    }

    public void setBeak(int beak) {
        this.beak = beak;
    }


    
}
