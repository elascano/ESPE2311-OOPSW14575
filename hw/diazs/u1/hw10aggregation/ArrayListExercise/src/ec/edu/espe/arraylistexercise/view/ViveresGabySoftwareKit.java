package ec.edu.espe.arraylistexercise.view;

import ec.edu.espe.arraylistexercise.model.Category;
import ec.edu.espe.arraylistexercise.model.Product;
import java.util.ArrayList;

/**
 *
 * @author Stefany Díaz, HoneyBadgers, DCCO - ESPE
 */
public class ViveresGabySoftwareKit {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        Category category;
        
        products.add(new Product(1, "Salt cracker", "Salticas", 0.4f));
        products.add(new Product(2, "Snack", "Doritos", 0.6f));
        products.add(new Product(3, "Soda", "Pepsi", 0.3f));
        
        category = new Category("Food products", "Eating and drinking products", products);
        System.out.println("Category --> " + category);
        
        
    }
}
