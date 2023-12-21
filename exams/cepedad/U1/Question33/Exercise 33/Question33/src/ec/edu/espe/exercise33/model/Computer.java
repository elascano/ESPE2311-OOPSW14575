package ec.edu.espe.exercise33.model;

/**
 *
 * @author David
 */
public class Computer {

    private int computerId;
    private String computerBrand;
    private String computerColor;

    public Computer(int id, String brand, String color) {
        this.computerId = id;
        this.computerBrand = brand;
        this.computerColor = color;
    }

    @Override
    public String toString() {
        return "Computer{" + "id=" + computerId + ", brand=" + computerBrand + ", color=" + computerColor + '}';
    }

    /**
     * @return the computerId
     */
    public int getComputerId() {
        return computerId;
    }

    /**
     * @param computerId the computerId to set
     */
    public void setComputerId(int computerId) {
        this.computerId = computerId;
    }

    /**
     * @return the computerBrand
     */
    public String getComputerBrand() {
        return computerBrand;
    }

    /**
     * @param computerBrand the computerBrand to set
     */
    public void setComputerBrand(String computerBrand) {
        this.computerBrand = computerBrand;
    }

    /**
     * @return the computerColor
     */
    public String getComputerColor() {
        return computerColor;
    }

    /**
     * @param computerColor the computerColor to set
     */
    public void setComputerColor(String computerColor) {
        this.computerColor = computerColor;
    }

}
