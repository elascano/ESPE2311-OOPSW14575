
package ec.espe.edu.designPattern.view;

import ec.espe.edu.designPattern.model.Button;
import ec.espe.edu.designPattern.model.GUIFactory;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class ClientApp {
    public static void main(String[] args) {
        GUIFactory aFactory = GUIFactory.getFactory();
        Button aButton = aFactory.createButton();
        aButton.caption = "Play";
        aButton.paint();
    }
}
