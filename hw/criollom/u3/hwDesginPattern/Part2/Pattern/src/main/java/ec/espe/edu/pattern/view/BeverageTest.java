
package ec.espe.edu.pattern.view;

import ec.espe.edu.pattern.model.Coffee;
import ec.espe.edu.pattern.model.Tea;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class BeverageTest {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        System.out.println( "\nMaking tea ..."); 
        tea.prepareRecipe();
        System.out.println( "\nMaking coffee ..."); 
        coffee.prepareRecipe();
    }
}
