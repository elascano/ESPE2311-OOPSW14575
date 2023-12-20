
package ec.edu.espe.chickenfarm2.view;

import java.util.ArrayList;
import ec.edu.espe.chickenfarm2.model.Menu;
import ec.edu.espe.chickenfarm2.controller.Save;
import ec.edu.espe.chickenfarm2.model.Chicken;
import ec.edu.espe.chickenfarm2.model.Coop;
import ec.edu.espe.chickenfarm2.model.RegisterChicken;

public class ChickenFarm {
    public static void main(String[] args){
        Chicken chicken;
        ArrayList<Chicken> chickens1 = new ArrayList<>();
        ArrayList<Chicken> chickens2 = new ArrayList<>();
        Menu printMenu = new Menu();
        RegisterChicken registerChicken = new RegisterChicken();
        Save saveData = new Save();
        
        boolean exit = true;
        while(exit == true){
            int option = printMenu.printMenu();
            switch (option){
                case 1:
                    System.out.println("-----Coop-----");
                    chicken = registerChicken.registerChicken();
                    chickens1.add(chicken);
                    break;
                case 2:
                    Coop coop = new Coop(1, chickens1);
                    saveData.saveInfo(coop);
                    //Coop coop2 = new Coop(2, chickens2);
                    //saveData.saveInfo(coop1, coop2);
                    break;
                default:
                    exit = false;
                    break;
            }
        }
    }
}
