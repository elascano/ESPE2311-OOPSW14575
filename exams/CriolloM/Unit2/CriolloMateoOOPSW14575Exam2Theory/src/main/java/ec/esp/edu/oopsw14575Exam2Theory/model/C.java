
package ec.esp.edu.oopsw14575Exam2Theory.model;

import java.util.ArrayList;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class C extends A{

    private ArrayList<E> listE;

    public C(ArrayList<A> listA) {
        super(listA);
        this.listE = listE;
    }

    /**
     * @return the listE
     */
    public ArrayList<E> getListE() {
        return listE;
    }

    /**
     * @param listE the listE to set
     */
    public void setListE(ArrayList<E> listE) {
        this.listE = listE;
    }

    @Override
    public String toString() {
        return "C{" + "listE=" + listE + '}';
    }
    
    

}
