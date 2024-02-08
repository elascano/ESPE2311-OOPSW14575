
package ec.esp.edu.oopsw14575Exam2Theory.model;

import java.util.ArrayList;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class B extends A{
    
    private ArrayList <H> listH;

    public B(ArrayList<H> h, ArrayList<A> listA) {
        super(listA);
        this.listH = h;
    }

    /**
     * @return the listH
     */
    public ArrayList <H> getListH() {
        return listH;
    }

    /**
     * @param listH the listH to set
     */
    public void setListH(ArrayList <H> listH) {
        this.listH = listH;
    }

    @Override
    public String toString() {
        return "B{" + "listH=" + listH + '}';
    }

    

}
