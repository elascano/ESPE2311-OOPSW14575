package ec.edu.espe.Setup.controller;

/**
 *
 * @author EDWARICHSNAKE
 */
public abstract class Employee {
    public String name = "Not assigned yet";
    public String title = "Not assigned yet";
    
    public void stateName(){
        System.out.println(title+" "+name);
    }
}
