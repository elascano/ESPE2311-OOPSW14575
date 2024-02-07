
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Juan Granda
 */
public class Crab extends Mollusks {
    private int tweezers;

    public Crab(int tweezers, String shell, boolean mucousGland, int endoskeleton, int quantityOfLegs, String feedType, String habitat, int id, String scietificName, Date BornDate, int cageld) {
        super(shell, mucousGland, endoskeleton, quantityOfLegs, feedType, habitat, id, scietificName, BornDate, cageld);
        this.tweezers = tweezers;
    }

    

  public void breastfeed(int calf){
        System.out.println("Crab is breastfeeding its calf number -->" + calf);
    }
    
    @Override
    public void breastfeed(){
        System.out.println("Crab is breastfeeding");
    }
    
  
    @Override
    public String toString() {
        return "Crab{" + super.toString() + "tweezers=" + tweezers + '}';
    }
    public int getTweezers() {
        return tweezers;
    }

    public void setTweezers(int tweezers) {
        this.tweezers = tweezers;
    }
    
    
}
