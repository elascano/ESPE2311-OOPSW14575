
package ec.espe.edu.pattern.model;

/**
 *
 * @author Rony
 */
public abstract class Employee {
    String name = "not assigned yet";
    String title = "not assigned yet";
    
    public  void stateName(){
        System.out.println(title+" "+name);
    }
}
