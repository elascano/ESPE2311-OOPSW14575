package ec.edu.espe.Setup.view;

import ec.edu.espe.Setup.controller.Client;
import ec.edu.espe.Setup.model.Clerk;
import ec.edu.espe.Setup.model.Manager;
import ec.edu.espe.Setup.model.President;
import ec.edu.espe.Setup.model.Teller;

/**
 *
 * @author EDWARICHSNAKE
 */
public class SetUp {
    public static void main(String[] args) {
        
        //Able´s organization
        Teller lonny = new Teller("Lonny");
        Clerk cal = new Clerk("Cal");
        Manager able = new Manager("Able");
        able.add(lonny);
        able.add(cal);
        
        //Becky´s organization
        Teller juanita = new Teller("Juanita");
        Teller tina= new Teller("Tina");
        Teller thelma = new Teller("Thelma");
        Manager becky = new Manager("Becky");
        becky.add(juanita);
        becky.add(tina);
        becky.add(thelma);
        
        //president´s direct reports
        
        President pete = President.getPresident("Pete");
        pete.add(able);
        pete.add(becky);
        
        //initial client
        Client.employee = pete;
        Client.doClientTask();
                
    }
}
