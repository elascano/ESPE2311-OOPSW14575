package ec.edu.espe.Setup.model;

import ec.edu.espe.Setup.controller.Supervisor;

/**
 *
 * @author EDWARICHSNAKE
 */
public class Manager extends Supervisor{

    public Manager(String aName) {
        this();
        name = aName;
    }
    
    public Manager(){
        super();
        title = "Manager";
    }
    
    @Override
    public void stateName(){
        super.stateName();
    }    
   
}
