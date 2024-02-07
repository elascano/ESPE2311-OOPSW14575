package ec.edu.espe.foodandrollorder.model;

public class CartItem {

    private Plate plate;
    private int quantity;
    private double totalPriceOfDish;

    @Override
    public String toString() {
        return "CartItem{" + "plate=" + getPlate() + ", quantity=" + getQuantity() + ", total: " + getTotalPriceOfDish()+ '}';
    }

    public CartItem(Plate plate, int quantity, double totalPriceOfDish) {
        this.plate = plate;
        this.quantity = quantity;
        this.totalPriceOfDish = totalPriceOfDish;
    }

    /**
     * @return the plate
     */
    public Plate getPlate() {
        return plate;
    }

    /**
     * @param plate the plate to set
     */
    public void setPlate(Plate plate) {
        this.plate = plate;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the totalPriceOfDish
     */
    public double getTotalPriceOfDish() {
        return totalPriceOfDish;
    }

    /**
     * @param totalPriceOfDish the totalPriceOfDish to set
     */
    public void setTotalPriceOfDish(int totalPriceOfDish) {
        this.totalPriceOfDish = totalPriceOfDish;
    }

}
