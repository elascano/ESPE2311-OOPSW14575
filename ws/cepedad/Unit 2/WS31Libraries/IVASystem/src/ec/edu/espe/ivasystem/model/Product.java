package ec.edu.espe.ivasystem.model;

/**
 *
 * @author David
 */
public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double calculateIva(){
        double iva = 0.12;
        return price * iva;
    }
    
    public double getTotalPrice(){
        return price + calculateIva();
    }

    public void getInformation() {
        System.out.println("Product: " + name);
        System.out.println("Price: $" + price);
        System.out.println("IVA: $" + calculateIva());
        System.out.println("Total price with IVA: $" + getTotalPrice());
    }
    
}
