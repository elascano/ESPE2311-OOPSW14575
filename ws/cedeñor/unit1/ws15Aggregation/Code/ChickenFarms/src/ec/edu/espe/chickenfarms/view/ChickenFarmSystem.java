package ec.edu.espe.chickenfarms.view;

import ec.edu.espe.chickenfarms.model.Chicken;
import java.util.Date;

/*
@author Rony Cedeño,INTERBYTE,DCCO ESPE_14575
 */
public class ChickenFarmSystem {

    public static void main(String[] args) {

        int id = 1;
        String name = "Lucy";
        String color = "White & Brown";
        boolean isMolting = true;
        Date bornOnDate = new Date();

        Chicken chicken = new Chicken(id, name, color, id, isMolting, bornOnDate);
        System.out.println("Chicken ---> " + chicken);

        chicken.doStuff(5);

    }

}
