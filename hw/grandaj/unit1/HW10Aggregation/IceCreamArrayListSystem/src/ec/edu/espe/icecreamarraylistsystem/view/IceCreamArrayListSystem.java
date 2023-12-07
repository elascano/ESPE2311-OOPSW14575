
package ec.edu.espe.icecreamarraylistsystem.view;

import ec.edu.espe.icecreamarraylistsystem.model.Box;
import ec.edu.espe.icecreamarraylistsystem.model.IceCream;
import java.util.ArrayList;

/**
 *
 * @author WILLIAM
 */
public class IceCreamArrayListSystem {


    public static void main(String[] args) {
        ArrayList<IceCream> iceCreams = new ArrayList<>();
        Box box;
         iceCreams.add(new IceCream (145, "Sabores", "Many flavor", 0.31f));
         iceCreams.add(new IceCream(24, "Chicle", "chicle", 0.31f));
         iceCreams.add(new IceCream(54, "Cocholate", "cocholate", 0.31f));
         iceCreams.add(new IceCream(65, "Mora", "mora", 0.31f));
         iceCreams.add(new IceCream(96, "Coco", "coco", 0.31f));
         iceCreams.add(new IceCream(87, "Rompasas", "rompasas", 0.31f));
        
        box = new Box(56, "Surtida", 45, 13.95f, iceCreams);
        System.out.println("Box -->"+box);


    }
    
}
