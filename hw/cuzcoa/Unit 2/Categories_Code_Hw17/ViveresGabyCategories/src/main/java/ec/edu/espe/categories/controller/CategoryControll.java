package ec.edu.espe.categories.controller;
import com.mongodb.client.MongoCollection;
import ec.edu.espe.categories.model.InfoCategory;
import ec.edu.espe.categories.view.CategoryView;
import ec.edu.espe.categories.view.ProductView;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

public class CategoryControll {
    private List<InfoCategory> categories;
    private ProductView products;
    private MongoCollection<Document> categoriesCollection;

    public CategoryControll(ProductView products) {
        this.categories = new ArrayList<>();
        this.products = products;
    }
    public CategoryControll(MongoCollection<Document> categoriesCollection) {
        this.categoriesCollection = categoriesCollection;
    }
    public void setCategoriesCollection(MongoCollection<Document> categoriesCollection) {
        // Este método se utilizará para establecer la colección de categorías
         this.categoriesCollection = categoriesCollection;
    }

    public void addCategory(InfoCategory category) {
        categories.add(category);
        if (categoriesCollection != null) {
        Document categoryDocument = new Document("categoryName", category.getCategoryName())
                .append("description", category.getDescription())
                .append("product", new Document("productName", category.getProduct().getProductName())
                        .append("price", category.getProduct().getPrice()));

        categoriesCollection.insertOne(categoryDocument);
        System.out.println("Category added successfully!");
    } else {
        System.out.println("Error: categoriesCollection is null.");
    }
    }

    public void showAllCategories() {
        for (InfoCategory category : categories) {
            showCategoryDetails(category);
            System.out.println("---------------------");
        }
    }

    public void updateCategory(int categoryId, InfoCategory updatedCategory) {
        for (InfoCategory category : categories) {
            if (category.getId() == categoryId) {
                category.setCategoryName(updatedCategory.getCategoryName());
                category.setDescription(updatedCategory.getDescription());
                category.setProduct(updatedCategory.getProduct());
                System.out.println("Category updated successfully!");
                return;
            }
        }
        System.out.println("Category not found.");
    }

    public void deleteCategory(int categoryId) {
        categories.removeIf(category -> category.getId() == categoryId);
        System.out.println("Category deleted successfully!");
    }

    public void showCategoryDetails(InfoCategory category) {
        System.out.println("ID: " + category.getId());
        System.out.println("Name: " + category.getCategoryName());
        System.out.println("Description: " + category.getDescription());
        System.out.println("Product associated:");
        products.showProductDetails(category.getProduct());
    }
}


