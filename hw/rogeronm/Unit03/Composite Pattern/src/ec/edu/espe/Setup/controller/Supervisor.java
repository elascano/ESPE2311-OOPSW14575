package ec.edu.espe.Setup.controller;

import java.util.Vector;

/**
 *
 * @author EDWARICHSNAKE
 */
public abstract class Supervisor extends Employee {

    protected Vector directReports = new Vector();

    @Override
    public void stateName() {
        super.stateName();
        if (directReports.size() > 0) {
            for (int i = 0; i < directReports.size(); ++i) {
                ((Employee) directReports.elementAt(i)).stateName();
            }
        }
    }
    
    public void add(Employee anEmployee){
        this.directReports.addElement(anEmployee);
    }
}   
