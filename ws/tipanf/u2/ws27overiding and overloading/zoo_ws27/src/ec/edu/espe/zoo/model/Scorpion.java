package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Frederick
 */
public class Scorpion extends Arthropod{
    private String typeOfPoison;

    public Scorpion(String typeOfPoison, boolean developsMetamorphosis, int numberOfArticulations, float size, String habitat, int id, String scientificName, Date bornDate, int cageId) {
        super(developsMetamorphosis, numberOfArticulations, size, habitat, id, scientificName, bornDate, cageId);
        this.typeOfPoison = typeOfPoison;
    }
    
    @Override
    public void shedExoskeleton(){
        System.out.println("The Scorpion is sheding it's exoskeleton");
    }
    
    public void shedExoskeleton(String color){
        System.out.println("The Scorpion is sheding its " + color + " exoskeleton");
    }

    @Override
    public String toString() {
        return "Scorpion{"+ super.toString() + "typeOfPoison=" + typeOfPoison + '}';
    }
    
    public void useStinger(){
        System.out.println("\nThe scorpion is using its stinger");
    }
    
    

    /**
     * @return the typeOfPoison
     */
    public String getTypeOfPoison() {
        return typeOfPoison;
    }

    /**
     * @param typeOfPoison the typeOfPoison to set
     */
    public void setTypeOfPoison(String typeOfPoison) {
        this.typeOfPoison = typeOfPoison;
    }
    
    
}
