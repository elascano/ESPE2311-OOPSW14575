
package ec.espe.edu.zoo.model;

import java.util.Date;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class ElephantEarSponge extends Poriferous {
    private String color;
    private String shape;
    private boolean waterFlowPrevention;

    public ElephantEarSponge(String color, String shape, boolean waterFlowPrevention, int numberOfPore, String symmetry, int quantityOfLimbs, String feedType, String habitad, String reproduction, int id, String ciemtificName, Date bornOnDate, int cageId) {
        super(numberOfPore, symmetry, quantityOfLimbs, feedType, habitad, reproduction, id, ciemtificName, bornOnDate, cageId);
        this.color = color;
        this.shape = shape;
        this.waterFlowPrevention = waterFlowPrevention;
    }

    @Override
    public String toString() {
        return "ElephantEarSponge{" +super.toString()+ "color=" + getColor() + ", shape=" + getShape() + ", waterFlowPrevention=" + isWaterFlowPrevention() + '}';
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the shape
     */
    public String getShape() {
        return shape;
    }

    /**
     * @param shape the shape to set
     */
    public void setShape(String shape) {
        this.shape = shape;
    }

    /**
     * @return the waterFlowPrevention
     */
    public boolean isWaterFlowPrevention() {
        return waterFlowPrevention;
    }

    /**
     * @param waterFlowPrevention the waterFlowPrevention to set
     */
    public void setWaterFlowPrevention(boolean waterFlowPrevention) {
        this.waterFlowPrevention = waterFlowPrevention;
    }
    
    public void changeColor(){
        
    }
    
    public void grow(){
        
    }
}
