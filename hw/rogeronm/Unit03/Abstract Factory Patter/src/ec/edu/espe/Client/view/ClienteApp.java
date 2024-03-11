package ec.edu.espe.Client.view;

import ec.edu.espe.Client.controller.GUIFactory;
import ec.edu.espe.Client.model.Button;
import ec.edu.espe.Client.model.Menu;

/**
 *
 * @author EDWARICHSNAKE
 */
public class ClienteApp {
    public static void main(String[] args) {
        GUIFactory aFactory = GUIFactory.getFactory();
        
        Button aButton = aFactory.createButton();
        aButton.caption = "--->Play";
        aButton.paint();
        
        
        Menu aMenu = aFactory.createMenu();
        aMenu.caption = "--->Play";
        aMenu.paint();
        
        
    }
}
