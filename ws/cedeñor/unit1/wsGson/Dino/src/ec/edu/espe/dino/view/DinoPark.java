
package ec.edu.espe.dino.view;

import ec.edu.espe.dino.controller.Read;
import ec.edu.espe.dino.model.Dino;
import ec.edu.espe.dino.model.JurassicPark;
import ec.edu.espe.dino.model.Menu;
import java.util.ArrayList;

/**
 *
 * @author Rony Cedeño, INTERBYTE, DCCO-ESPE
 */
public class DinoPark {
    public static void main(String[] args){
   Dino dinos;
   ArrayList<Dino> dinos1 = new ArrayList<> (); 
   Menu printMenu = new Menu ();
   Read readData = new Read ();
   
   boolean exit = true;
   while(exit == true){
        int option = printMenu.printMenu();
        switch(option){
            case 1 : 
                System.out.println("-----------Jurassic Park-------------");
                 Dino dino1 = new Dino (12,"Robin","Green",3);
                 Dino dino2 = new Dino(13,"Raul","Blue",2);
                 Dino dino3 = new Dino(14,"Mario","Black",4);
                 dinos1.add(dino1);
                 dinos1.add(dino2);
                 dinos1.add(dino3);
                 JurassicPark park = new JurassicPark (1,dinos1);
                 readData.readInfo(park);
                 break;
            default :
                exit = false;
                break;
                
        }
    }
   
    
    }
}
