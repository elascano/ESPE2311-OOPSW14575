package ec.edu.espe.foodandrollorder.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ShoppingCart {

    private int carId;
    private int productId;

    private Date dateAdded;
    private Menu menuOfRestaurant;
    private ArrayList<Plate> platesInCart = new ArrayList<>();
    private ArrayList<CartItem> cartItems = new ArrayList<>();

    @Override
    public String toString() {
        return "ShoppingCart{" + "carId=" + carId + ", productId=" + productId + ", dateAdded=" + dateAdded + ", menuOfRestaurant=" + menuOfRestaurant + '}';
    }

    public ShoppingCart() {
    }

    public ShoppingCart(int carId, int productId, Date dateAdded, Menu menuOfRestaurant) {
        this.carId = carId;
        this.productId = productId;
        this.dateAdded = dateAdded;
        this.menuOfRestaurant = menuOfRestaurant;
    }

    public void addDishToCart() {
        ShowFullMenu();
        Scanner scanner = new Scanner(System.in);

        int plateId = 0;
        boolean validId = false;
        while (!validId) {
            try {
                System.out.println("Enter the ID of the dish to add the cart: : ");
                plateId = Integer.parseInt(scanner.nextLine());
                validId = true;
            } catch (NumberFormatException e) {
                System.out.println("Please enter only numbers for the dish ID.");
            }
        }

        Plate plateToAdd = getMenuOfRestaurant().getPlateById(plateId);
        if (plateToAdd != null) {

            platesInCart.add(plateToAdd);
            quantityOfDishes(plateToAdd);
            System.out.println("Dish added to the cart.");

        } else {
            System.out.println("Dish not found in the menu.");
        }
    }

    public void quantityOfDishes(Plate plateToAdd) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*============" + plateToAdd.getName() + "================*");
        System.out.println("Price: $" + plateToAdd.getPrice());
        System.out.println("Availavility: " + plateToAdd.getAvailability());
        System.out.println("Description: " + plateToAdd.getDescription());
        System.out.println("==================================================");
        System.out.println("Enter the quantity: ");
        int quantity = scanner.nextInt();
        double totalPriceOfDish = quantity * plateToAdd.getPrice();
        CartItem cartItem = new CartItem(plateToAdd, quantity, totalPriceOfDish);
        cartItems.add(cartItem);
    }

    public void ShowFullMenu() {
        if (menuOfRestaurant != null) {
            menuOfRestaurant.setMenuFromJson("menu.json");
            menuOfRestaurant.displayFullMenu();
        } else {
            System.out.println("Error: Menu not initialized.");
        }
    }

    public void viewCartDetails() {
        System.out.println("**==================Shopping Cart=====================**");
        if (cartItems.isEmpty()) {
            System.out.println("The cart is empty.");
        } else {
            System.out.println("Items in the cart:");
            for (CartItem cartItem : cartItems) {
                Plate plate = cartItem.getPlate();
                int quantity = cartItem.getQuantity();
                double totalPriceOfDish = cartItem.getTotalPriceOfDish();

                if (plate != null) {

                    System.out.printf("ID: %d, Name: %s, Quantity: %d, Total: $%.2f%n",
                            plate.getId(), plate.getName(), quantity, totalPriceOfDish);
                }
            }
            calculateTotalPrice();

        }
    }

    public void calculateTotalPrice() {
        double totalPrice = 0.0;

        for (CartItem carItem : cartItems) {

            double totalPriceOfDish = carItem.getTotalPriceOfDish();
            totalPrice += totalPriceOfDish;

        }

        System.out.printf("Total Price of items in the cart:$%.2f%n", totalPrice);
    }

    /**
     * @return the carId
     */
    public int getCarId() {
        return carId;
    }

    /**
     * @param carId the carId to set
     */
    public void setCarId(int carId) {
        this.carId = carId;
    }

    /**
     * @return the productId
     */
    public int getProductId() {
        return productId;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(int productId) {
        this.productId = productId;
    }

    /**
     * @return the dateAdded
     */
    public Date getDateAdded() {
        return dateAdded;
    }

    /**
     * @param dateAdded the dateAdded to set
     */
    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    /**
     * @return the menuOfRestaurant
     */
    public Menu getMenuOfRestaurant() {
        return menuOfRestaurant;
    }

    /**
     * @param menuOfRestaurant the menuOfRestaurant to set
     */
    public void setMenuOfRestaurant(Menu menuOfRestaurant) {
        this.menuOfRestaurant = menuOfRestaurant;
    }

}
