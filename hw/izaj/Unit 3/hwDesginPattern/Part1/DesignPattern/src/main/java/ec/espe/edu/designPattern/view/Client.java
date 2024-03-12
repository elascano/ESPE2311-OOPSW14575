
package ec.espe.edu.designPattern.view;

import ec.espe.edu.designPattern.model.Connection;
import ec.espe.edu.designPattern.model.Factory;
import ec.espe.edu.designPattern.model.FactoryOne;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class Client {
    public static void main(String[] args) {
        Factory factory;
        factory = new FactoryOne();
        Connection connection = factory.createConnection("Oracle"); //Factory method
        System.out.println("You are connecting with " + connection.description());
    }
}
