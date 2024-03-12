
package ec.espe.edu.pattern.model;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class Teller extends Employee{

    public Teller(String aName) {
        this();
        name=aName;
        
    }

    @Override
    public void stateName(){
        super.stateName();
    }
    public Teller() {
        title="Teller";
    }
    
    

}
