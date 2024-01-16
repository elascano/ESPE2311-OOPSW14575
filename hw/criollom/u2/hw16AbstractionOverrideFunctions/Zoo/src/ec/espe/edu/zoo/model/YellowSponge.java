
package ec.espe.edu.zoo.model;

import java.util.Date;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class YellowSponge extends Poriferous {
    private String texture;

    public YellowSponge(String texture, int numberOfPore, String symmetry, int quantityOfLimbs, String feedType, String habitad, String reproduction, int id, String ciemtificName, Date bornOnDate, int cageId) {
        super(numberOfPore, symmetry, quantityOfLimbs, feedType, habitad, reproduction, id, ciemtificName, bornOnDate, cageId);
        this.texture = texture;
    }

    @Override
    public String toString() {
        return "YellowSponge{" +super.toString()+ "texture=" + getTexture() + '}';
    }

    /**
     * @return the texture
     */
    public String getTexture() {
        return texture;
    }

    /**
     * @param texture the texture to set
     */
    public void setTexture(String texture) {
        this.texture = texture;
    }
    
    public void generateLight(){
        
    }
    
    public void filterFeed(){
        
    }

    @Override
    public void breathe() {
        System.out.println("The Yellow Sponge breathes through pores and canaliculi");
    }
}
