
package ec.espe.edu.designPattern.view;

import ec.espe.edu.designPattern.model.USTax;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class Calculator {
    public static void main(String[] args) {
        USTax tax = USTax.getInstance();
        System.out.println("tax-->"+tax.salesTotal());
    }
}
