
package ec.espe.edu.pattern.model;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public abstract class Employee {
    String name = "not assigned yet";
    String title = "not assigned yet";
    
    public  void stateName(){
        System.out.println(title+" "+name);
    }
}
