package ec.edu.espe.agregationexercise.view;

import ec.edu.espe.agregationexercise.model.Category;
import ec.edu.espe.agregationexercise.model.Product;

/**
 *
 * @author Stefany Díaz, HoneyBadgers, DCCO - ESPE
 */
public class ViveresGabySoftwareKit {
    public static void main(String[] args) {
        
        Product[] products = new Product[3];
        
        products[0] = new Product(1, "Shampoo", "Savital", 2.5f);
        products[1] = new Product(2, "Toothpaste", "Colgate", 2.3f);
        products[2] = new Product(3, "Body soap", "Jolly", 1.0f);

        Category category = new Category("Personal hygiene products", "Body and facial care", products);
        
        
        System.out.println("Category --> " + category);
        
    }
    
}
