package ec.edu.espe.Setup.model;

import ec.edu.espe.Setup.controller.Employee;

/**
 *
 * @author EDWARICHSNAKE
 */
public class Teller extends Employee{

    public Teller(String aName){
        this();
        name = aName;
    }
    
    @Override
    public void stateName(){
        super.stateName();
    }
    
    public Teller(){
        title = "Teller";
    }
}
