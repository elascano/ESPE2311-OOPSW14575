package ec.edu.espe.ivasystem.model;

/**
 *
 * @author Andrés Romero - DCCO
 */
public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double calculateIVA(){
        double iva = 0.12;
        return price * iva;
    }
    
    public double getTotalPrice(){
        return price + calculateIVA();
    }

    public void getInformation() {
        System.out.println("Product: " + name);
        System.out.format("Price: $%.2f\n", price);
        System.out.format("IVA: $%.2f\n", calculateIVA());
        System.out.format("Total price + IVA: $%.2f\n", getTotalPrice());
    }
    
}
