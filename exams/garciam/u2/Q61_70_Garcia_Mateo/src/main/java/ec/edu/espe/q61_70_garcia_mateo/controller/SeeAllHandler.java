
package ec.edu.espe.q61_70_garcia_mateo.controller;

import ec.edu.espe.q61_70_garcia_mateo.model.*;
import java.util.List;
/**
 *
 * @author mateo
 */
public class SeeAllHandler {    
    public List<SoccerPlayer> getAllItem(){
        return DbHandler.getAllCollection("item_collection");
    }
}
