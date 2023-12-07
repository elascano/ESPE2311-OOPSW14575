
package ec.edu.espe.icecreamsystem.view;

import ec.edu.espe.icecreamsystem.model.Box;
import ec.edu.espe.icecreamsystem.model.IceCream;

/**
 *
 * @author JuanGranda,Error 404,DCCO-ESPE
 */
public class IceCreamSystem {


    public static void main(String[] args) {
        
        IceCream[] iceCreams = new IceCream[6];
         iceCreams[0] = new IceCream(145, "Sabores", "Many flavor", 0.31f);
         iceCreams[1] = new IceCream(24, "Chicle", "chicle", 0.31f);
         iceCreams[2] = new IceCream(54, "Cocholate", "cocholate", 0.31f);
         iceCreams[3] = new IceCream(65, "Mora", "mora", 0.31f);
         iceCreams[4] = new IceCream(96, "Coco", "coco", 0.31f);
         iceCreams[5] = new IceCream(87, "Rompasas", "rompasas", 0.31f);
        
        Box box = new Box(56, "Surtida", 45, 13.95f, iceCreams);
        System.out.println("Box -->"+box);

    }
    
}
