
package ec.espe.edu.zoo.model;

import java.util.Date;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class RedTreeSponge extends Poriferous{
    private String color;

    public RedTreeSponge(String color, int numberOfPore, String symmetry, int quantityOfLimbs, String feedType, String habitad, String reproduction, int id, String ciemtificName, Date bornOnDate, int cageId) {
        super(numberOfPore, symmetry, quantityOfLimbs, feedType, habitad, reproduction, id, ciemtificName, bornOnDate, cageId);
        this.color = color;
    }

    @Override
    public String toString() {
        return "RedTreeSponge{" +super.toString()+"color=" + color + '}';
    }
    
    public void changeColor(String color){
        
    }
    
    public void produceBioactives(){
        
    }

    @Override
    public void breathe() {
        System.out.println("The red tree sponge breathes through pores and ostia ");
    }
    
}
