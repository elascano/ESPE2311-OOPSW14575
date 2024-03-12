
package ec.espe.edu.pattern.model;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class Manager extends Supervisor {

    public Manager(String aName) {
        this();
        name = aName;
    }
    
    public Manager(){
        super();
        title="Manager";
    }
    
    @Override
    public void stateName(){
        super.stateName();
    }
}
