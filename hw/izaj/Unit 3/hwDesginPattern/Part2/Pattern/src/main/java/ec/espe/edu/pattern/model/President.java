
package ec.espe.edu.pattern.model;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class President extends Supervisor{
    private static President president = new President();

    public President(String aName) {
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
