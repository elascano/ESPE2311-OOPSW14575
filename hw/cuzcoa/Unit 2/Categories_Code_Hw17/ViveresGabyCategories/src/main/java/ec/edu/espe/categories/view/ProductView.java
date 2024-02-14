package ec.edu.espe.categories.view;

import ec.edu.espe.categories.model.Product;
import java.util.Scanner;

public class ProductView {
    private Scanner scanner;

    public ProductView(Scanner scanner) {
        this.scanner = scanner;
    }
    public ProductView() {
        // Constructor sin argumentos
    }
    public Product inputProductData() {
        System.out.println("Enter the product name: ");
        String productName = scanner.nextLine();

        System.out.println("Enter the product price: ");
        double productPrice = scanner.nextDouble();
        scanner.nextLine();  // Consumir la nueva línea después de nextDouble()

        return new Product(productName, productPrice);
    }

    public void showProductDetails(Product product) {
        System.out.println("Name: " + product.getProductName());
        System.out.println("Price: $" + product.getPrice());
    }
}

