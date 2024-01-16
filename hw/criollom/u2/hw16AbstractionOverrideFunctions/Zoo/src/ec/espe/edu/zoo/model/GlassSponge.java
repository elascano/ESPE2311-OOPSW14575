
package ec.espe.edu.zoo.model;

import java.util.Date;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class GlassSponge extends Poriferous{
    private String material;

    public GlassSponge(String material, int numberOfPore, String symmetry, int quantityOfLimbs, String feedType, String habitad, String reproduction, int id, String ciemtificName, Date bornOnDate, int cageId) {
        super(numberOfPore, symmetry, quantityOfLimbs, feedType, habitad, reproduction, id, ciemtificName, bornOnDate, cageId);
        this.material = material;
    }

    @Override
    public String toString() {
        return "GlassSponge{" +super.toString()+ "material=" + getMaterial() + '}';
    }

    /**
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }
    
    public void regenerate(){
        
    }
    
    public void scheduleBioluminescence(){
        
    }

    @Override
    public void breathe() {
        System.out.println("The Glass Sponge respira mediante coanocitos y poros especializados");
    }
}
