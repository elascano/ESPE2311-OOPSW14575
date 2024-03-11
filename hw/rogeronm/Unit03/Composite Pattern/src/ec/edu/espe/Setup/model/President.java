package ec.edu.espe.Setup.model;

import ec.edu.espe.Setup.controller.Supervisor;

/**
 *
 * @author EDWARICHSNAKE
 */
public class President extends Supervisor{
    private static President president = new President();
    
    private President(String aName){
        this();
        name = aName;
    }   
    
    private President(){
        super();
        title = "President";
    }
    
    @Override
    public void stateName(){
        super.stateName();
    }
    
    public static President getPresident(String aName){
        president.name = aName;
        return President.president;
    }
}
