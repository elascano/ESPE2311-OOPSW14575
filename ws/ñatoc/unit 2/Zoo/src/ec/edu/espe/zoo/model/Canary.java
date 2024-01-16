
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Carlos Ñato, The Javas, DCC-ESPE
 */
public class Canary extends bird{

    public Canary(int numberOfMammaryGlands, String spine, int nomberOfBones, int id, String cientificName, Date bornDate, int cageId) {
        super(numberOfMammaryGlands, spine, nomberOfBones, id, cientificName, bornDate, cageId);
        
    }
    @Override
    public void breastfeed(){
        System.out.println("chick eating");
    }
    
     public void breastfeed( int calf){
        System.out.println("chick eating its calf number -->" + calf);
    }
    
   
    @Override
    public String toString() {
        return "Canary{" + super.toString()+ '}';
    }
    
    
    public void brushNeck(){
        System.out.println("brushing the nek of the canary");
    
    }


    
    

    
    
}
