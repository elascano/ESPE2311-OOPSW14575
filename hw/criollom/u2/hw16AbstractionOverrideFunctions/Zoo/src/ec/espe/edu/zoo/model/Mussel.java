
package ec.espe.edu.zoo.model;

import java.util.Date;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class Mussel extends Mollusk {
    private int shellSize;
    private String shellType;

    public Mussel(int shellSize, String shellType, boolean shell, String locomotion, String symmetry, int quantityOfLimbs, String feedType, String habitad, String reproduction, int id, String ciemtificName, Date bornOnDate, int cageId) {
        super(shell, locomotion, symmetry, quantityOfLimbs, feedType, habitad, reproduction, id, ciemtificName, bornOnDate, cageId);
        this.shellSize = shellSize;
        this.shellType = shellType;
    }

    @Override
    public String toString() {
        return "Mussel{" +super.toString()+ "shellSize=" + getShellSize() + ", shellType=" + getShellType() + '}';
    }
    
    
    
    public void storeSolarEnergy(){
        
    }
    
    public void repairTissue(){
        
    }

    /**
     * @return the shellSize
     */
    public int getShellSize() {
        return shellSize;
    }

    /**
     * @param shellSize the shellSize to set
     */
    public void setShellSize(int shellSize) {
        this.shellSize = shellSize;
    }

    /**
     * @return the shellType
     */
    public String getShellType() {
        return shellType;
    }

    /**
     * @param shellType the shellType to set
     */
    public void setShellType(String shellType) {
        this.shellType = shellType;
    }

    @Override
    public void breathe() {
        System.out.println("The mussel breathes through gills and mantle cavity");
    }
    
}
