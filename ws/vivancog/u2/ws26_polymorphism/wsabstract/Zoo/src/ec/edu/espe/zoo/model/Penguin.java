package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Penguin extends Birds{
    private boolean haveACouple;

    public Penguin(boolean haveACouple, int wings, String feathers, int id, String scientificName, Date bornDate, int cageId, String spine, int numberOfBones) {
        super(wings, feathers, id, scientificName, bornDate, cageId, spine, numberOfBones);
        this.haveACouple = haveACouple;
    }

    @Override
    public String toString() {
        return "Penguin{" + "haveACouple=" + haveACouple + '}';
    }
    
    

    /**
     * @return the haveACouple
     */
    public boolean isHaveACouple() {
        return haveACouple;
    }

    /**
     * @param haveACouple the haveACouple to set
     */
    public void setHaveACouple(boolean haveACouple) {
        this.haveACouple = haveACouple;
    }

    @Override
    public void vocalization() {
        System.out.println("The penguin guttural sounds");
    }
    
    
}
