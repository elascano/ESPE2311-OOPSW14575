
package ec.espe.edu.zoo.model;

import java.util.Date;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public abstract class Mollusk extends Invertebrate {
    
    private boolean shell;
    private String locomotion;

    public Mollusk(boolean shell, String locomotion, String symmetry, int quantityOfLimbs, String feedType, String habitad, String reproduction, int id, String ciemtificName, Date bornOnDate, int cageId) {
        super(symmetry, quantityOfLimbs, feedType, habitad, reproduction, id, ciemtificName, bornOnDate, cageId);
        this.shell = shell;
        this.locomotion = locomotion;
    }

    @Override
    public String toString() {
        return "Mollusk{" +super.toString()+ "shell=" + isShell() + ", locomotion=" + getLocomotion() + '}';
    }

    /**
     * @return the shell
     */
    public boolean isShell() {
        return shell;
    }

    /**
     * @param shell the shell to set
     */
    public void setShell(boolean shell) {
        this.shell = shell;
    }

    /**
     * @return the locomotion
     */
    public String getLocomotion() {
        return locomotion;
    }

    /**
     * @param locomotion the locomotion to set
     */
    public void setLocomotion(String locomotion) {
        this.locomotion = locomotion;
    }
    
    public void recordLocomotion(){
        
    }

    public void pushOn(){
        System.out.println("The animal mollusk is wake/activate");
    }
}
