package ec.edu.espe.categories.view;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.categories.controller.CategoryControll;
import ec.edu.espe.categories.model.InfoCategory;
import ec.edu.espe.categories.utils.ConexionMongoDB;

import java.util.Scanner;
import org.bson.Document;

public class Categories {

    public static void main(String[] args) {
        // Verificar la conexión a MongoDB antes de realizar operaciones
        ConexionMongoDB conexion = ConexionMongoDB.obtenerInstancia();

        
            // Agregar un pequeño retardo para permitir que MongoDB se inicialice completamente
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            // Obtener la colección de categorías desde la conexión MongoDB
            MongoCollection<Document> categoriesCollection = conexion.getCategorias();

            // Crear instancias de ProductView y CategoryControll
            ProductView productView = new ProductView();
            CategoryControll categoryController = new CategoryControll(productView);

            // Establecer la colección de categorías en el controlador
            categoryController.setCategoriesCollection(categoriesCollection);
            System.out.println("Colección de categorías establecida en el controlador.");


            Scanner scanner = new Scanner(System.in);



            int choice;

            do {
                System.out.println("Menu:");
                System.out.println("1. Add a category");
                System.out.println("2. Show all categories");
                System.out.println("3. Update a category");
                System.out.println("4. Delete a category");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine();  // Consumir la nueva línea después de nextInt()

                switch (choice) {
                    case 1:
                        // Add a new category
                        InfoCategory newCategory = new CategoryView(scanner).inputCategoryData();
                        categoryController.addCategory(newCategory);
                        System.out.println("Category added successfully!");
                        break;
                    case 2:
                        // Show all categories
                        categoryController.showAllCategories();
                        break;
                    case 3:
                    // Update a category
                    System.out.println("Enter the ID of the category to update: ");
                    int categoryIdToUpdate = scanner.nextInt();
                    scanner.nextLine();  // Consumir la nueva línea después de nextInt()
                    InfoCategory updatedCategory = new CategoryView(scanner).inputCategoryData();
                    categoryController.updateCategory(categoryIdToUpdate, updatedCategory);
                    break;
                    case 4:
                    // Delete a category
                    System.out.println("Enter the ID of the category to delete: ");
                    int categoryIdToDelete = scanner.nextInt();
                    categoryController.deleteCategory(categoryIdToDelete);
                    break;    
                    
                    case 5:
                        System.out.println("Exiting program. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } while (choice != 5);

            scanner.close();

    }
}