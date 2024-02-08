
package ec.esp.edu.oopsw14575Exam2Theory.model;

import java.util.ArrayList;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class A {
    
    private ArrayList<A> listA;

    public A(ArrayList<A> listA) {
        this.listA = listA;
    }

    /**
     * @return the listA
     */
    public ArrayList<A> getListA() {
        return listA;
    }

    /**
     * @param listA the listA to set
     */
    public void setListA(ArrayList<A> listA) {
        this.listA = listA;
    }

    public Object getList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "A{" + "listA=" + listA + '}';
    }
    
    
    
}
