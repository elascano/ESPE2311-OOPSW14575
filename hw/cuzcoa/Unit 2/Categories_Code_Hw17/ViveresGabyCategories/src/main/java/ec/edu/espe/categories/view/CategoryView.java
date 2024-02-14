
package ec.edu.espe.categories.view;

import ec.edu.espe.categories.controller.CategoryControll;
import ec.edu.espe.categories.model.InfoCategory;
import ec.edu.espe.categories.model.Product;
import java.util.Scanner;

public class CategoryView {
    private Scanner scanner;

    public CategoryView(Scanner scanner) {
        this.scanner = scanner;
    }

    public InfoCategory inputCategoryData() {
        System.out.println("Enter the category name: ");
        String categoryName = scanner.nextLine();

        System.out.println("Enter the category description: ");
        String description = scanner.nextLine();

        ProductView productView = new ProductView(scanner);
        Product product = productView.inputProductData();

        return new InfoCategory(categoryName, description, product);
    }

    public void showCategoryDetails(InfoCategory category) {
        System.out.println("ID: " + category.getId());
        System.out.println("Name: " + category.getCategoryName());
        System.out.println("Description: " + category.getDescription());
        System.out.println("Product associated:");
        new ProductView().showProductDetails(category.getProduct());
    }
}