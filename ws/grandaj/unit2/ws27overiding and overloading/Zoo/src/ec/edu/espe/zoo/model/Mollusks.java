
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Juan Granda
 */
public class Mollusks extends Invertebrate {
    private String shell;
    private boolean mucousGland;

    public Mollusks(String shell, boolean mucousGland, int endoskeleton, int quantityOfLegs, String feedType, String habitat, int id, String scietificName, Date BornDate, int cageld) {
        super(endoskeleton, quantityOfLegs, feedType, habitat, id, scietificName, BornDate, cageld);
        this.shell = shell;
        this.mucousGland = mucousGland;
    }
    
    public void breastfeed(){
        System.out.println("Mollusks breastfeed babby 1");
    }
    @Override
    public String toString() {
        return "Mollusks{" +super.toString()+ ", shell=" + shell + ", mucousGland=" + mucousGland + '}';
    }
    
    public void molluskLocation(){
        System.out.println("Sea ​​floor");
        
    }

    public String getShell() {
        return shell;
    }

    public void setShell(String shell) {
        this.shell = shell;
    }

    public boolean isMucousGland() {
        return mucousGland;
    }

    public void setMucousGland(boolean mucousGland) {
        this.mucousGland = mucousGland;
    }

    @Override
    public void feed() {
    }


}
