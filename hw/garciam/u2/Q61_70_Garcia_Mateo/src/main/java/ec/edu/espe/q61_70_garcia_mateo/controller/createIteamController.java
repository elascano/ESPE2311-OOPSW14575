package ec.edu.espe.q61_70_garcia_mateo.controller;

import ec.edu.espe.q61_70_garcia_mateo.model.*;
import javax.swing.JOptionPane;

/**
 *
 * @author mateo
 */
public class createIteamController {

    public void createNewItem(int id, String name, String type, int years) {
        SoccerPlayer soccerPlayer = new SoccerPlayer(id, name, type, years);
        DbHandler dbManager = new DbHandler();
        dbManager.insertItem(soccerPlayer, "item_collection");
        JOptionPane.showMessageDialog(null, "Item saved succesfully");
    }
}
