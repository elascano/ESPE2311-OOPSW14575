package espe.edu.ec.Template.view;

import espe.edu.ec.Template.controller.Tea;
import espe.edu.ec.Template.controller.Coffee;

/**
 *
 * @author EDWARICHSNAKE
 */
public class BeverageTest {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        
        System.out.println("\nMaking tea...");
        tea.prepareRecipe();
        
        System.out.println("\nMaking coffee");
        coffee.prepareRecipe();
    }
}
