
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Ilhan
 */
public class Squid extends Mollusc{
    private boolean haveInk;
    private String typeOfStucker;

    @Override
    public String toString() {
        return "Squid{" + super.toString()+ "haveInk=" + haveInk + ", typeOfSucker=" + typeOfStucker + '}';
    }
    
    /**
     * @return the haveInk
     */
    public boolean isHaveInk() {
        return haveInk;
    }

    /**
     * @param haveInk the haveInk to set
     */
    public void setHaveInk(boolean haveInk) {
        this.haveInk = haveInk;
    }

    /**
     * @return the typeOfStucker
     */
    public String getTypeOfStucker() {
        return typeOfStucker;
    }

    /**
     * @param typeOfStucker the typeOfStucker to set
     */
    public void setTypeOfStucker(String typeOfStucker) {
        this.typeOfStucker = typeOfStucker;
    }   

    public Squid(boolean haveInk, String typeOfStucker, String shellStatus, String shellType, int id, String scientificName, Date borndateM, int cageId) {
        super(shellStatus, shellType, id, scientificName, borndateM, cageId);
        this.haveInk = haveInk;
        this.typeOfStucker = typeOfStucker;
    }

    @Override
    public void locomotion() {
        System.out.println("Squid locomotion consist of using their funnel to propulse in water");
    }

}
