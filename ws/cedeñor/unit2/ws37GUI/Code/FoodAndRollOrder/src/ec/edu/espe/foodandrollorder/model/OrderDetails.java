package ec.edu.espe.foodandrollorder.model;

/**
 *
 * @author RC_558
 */
public class OrderDetails {
    
    int id;
    int quantity;
    double  totalPriceOfDish;
    Plate plate;
    
    
    @Override
    public String toString() {
        return "OrderDetails{" + "id=" + plate.getId() + ", quantity=" + getQuantity() + ", totalPriceOfDish=" + getTotalPriceOfDish() + '}';
    }

    public OrderDetails(int id, int quantity, double totalPriceOfDish) {
        this.id = id;
        this.quantity = quantity;
        this.totalPriceOfDish = totalPriceOfDish;
    }
        
        
    public String toCSVCarDetails() {
        CartItem carItem = new CartItem(plate, quantity, totalPriceOfDish);
        Plate plate = null;
        return String.format("ID: %d, Name: %s, Quantity: %d, Total: $%.2f%n",
                plate.getId(), plate.getName(), getQuantity(), getTotalPriceOfDish());
    }


    public Plate getPlate() {
        return plate;
    }

    public void setPlate(Plate plate) {
        this.plate = plate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPriceOfDish() {
        return totalPriceOfDish;
    }

    public void setTotalPriceOfDish(double totalPriceOfDish) {
        this.totalPriceOfDish = totalPriceOfDish;
    }
    
    
}
