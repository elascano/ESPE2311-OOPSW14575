package ec.edu.espe.Factory.view;

import ec.edu.espe.Factory.controller.Factory;
import ec.edu.espe.Factory.controller.FactoryOne;
import ec.edu.espe.Factory.model.Connection;
/**
 *
 * @author EDWARICHSNAKE
 */
public class Client {
    public static void main(String[] args) {
        Factory factory;
        factory = new FactoryOne();
        
        Connection connection = factory.createConnection("Oracle");
        System.out.println("You're connecting with " + connection.description());           
    
    }
}
