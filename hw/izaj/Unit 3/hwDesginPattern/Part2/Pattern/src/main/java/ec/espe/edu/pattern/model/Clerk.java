
package ec.espe.edu.pattern.model;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class Clerk extends Employee{

    public Clerk(String aName) {
        this();
        name=aName;
        
    }
    
    @Override
    public void stateName(){
        super.stateName();
    }

    public Clerk() {
        title = "Clerk";
    }
    
    
    
}
