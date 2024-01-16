package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Luis Sagnay
 */
public class Shark extends Fish{
    private String typeOfShark;
    
    public void killFishes(){
        System.out.println("The Shark is killing a fish");
    }

    public Shark(String typeOfShark, boolean itHasScales, String sping, int numberOfBones, int id, String scientificName, Date bornDate, int cageId) {
        super(itHasScales, sping, numberOfBones, id, scientificName, bornDate, cageId);
        this.typeOfShark = typeOfShark;
    }

    @Override
    public String toString() {
        return "Shark{" +super.toString() + "typeOfShark=" + getTypeOfShark() + '}';
    }

    /**
     * @return the typeOfShark
     */
    public String getTypeOfShark() {
        return typeOfShark;
    }

    /**
     * @param typeOfShark the typeOfShark to set
     */
    public void setTypeOfShark(String typeOfShark) {
        this.typeOfShark = typeOfShark;
    }
    
    
}
