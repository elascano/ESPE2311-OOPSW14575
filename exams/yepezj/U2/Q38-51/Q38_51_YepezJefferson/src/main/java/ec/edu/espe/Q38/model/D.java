
package ec.edu.espe.Q38.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jefferson Yepez, DCCO - ESPE, BitCoderz
 */
public class D extends A{
    private ArrayList<F> listF;
    private E[] e = new E[4];
    
    public D(){
        listF = new ArrayList<>();
    }

    public D(ArrayList<F> listF, List<A> listA) {
        super(listA);
        this.listF = listF;
    }

    public D(ArrayList<F> listF) {
        this.listF = listF;
    }

    @Override
    public String toString() {
        return "D{" + "listF=" + listF + ", e=" + e + '}';
    }

    /**
     * @return the listF
     */
    public ArrayList<F> getListF() {
        return listF;
    }

    /**
     * @param listF the listF to set
     */
    public void setListF(ArrayList<F> listF) {
        this.listF = listF;
    }

    /**
     * @return the e
     */
    public E[] getE() {
        return e;
    }

    /**
     * @param e the e to set
     */
    public void setE(E[] e) {
        this.e = e;
    }
    
}
