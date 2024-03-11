package ec.edu.espe.Setup.model;

import ec.edu.espe.Setup.controller.Employee;

/**
 *
 * @author EDWARICHSNAKE
 */
public class Clerk extends Employee{    
    public Clerk(String aName){
        this();
        name = aName;
    }
    
    @Override
    public void stateName(){
        super.stateName();
    }
    
    public Clerk(){
        title = "Clerk";
    }
}
