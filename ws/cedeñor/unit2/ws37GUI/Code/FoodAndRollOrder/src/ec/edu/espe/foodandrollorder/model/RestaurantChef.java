package ec.edu.espe.foodandrollorder.model;

import java.awt.Menu;
import java.util.Date;

public class RestaurantChef extends User {
    
    private String chefName;

    @Override
    public String toString() {
        return "RestaurantChef{" + "chefName=" + getChefName() + '}';
    }
               
    public RestaurantChef(String chefName, String userId, String password, String loginStatus, Date registerDate) {
        super(userId, password, loginStatus, registerDate);
        this.chefName = chefName;
    }
    
    public Menu checkPendingOrders () {
        Menu menu = new Menu();
        return menu;
    }
    
    /**
     * @return the chefName
     */
    public String getChefName() {
        return chefName;
    }

    /**
     * @param chefName the chefName to set
     */
    public void setChefName(String chefName) {
        this.chefName = chefName;
    }

  
    
}
