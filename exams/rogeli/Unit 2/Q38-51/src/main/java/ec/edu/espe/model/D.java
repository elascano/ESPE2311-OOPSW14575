

package ec.edu.espe.model;

import java.util.ArrayList;

/**
 *
 * @author ilhan R
 */
public class D extends A{       //1
    private ArrayList<F> listF;    //0.9  
    private E[] e = new E[4];     //0.5
    
    //0.1
    
    public D(){
        listF = new ArrayList<>();
    }

    public D(ArrayList<F> listF) {
        this.listF = listF;
    }

    @Override
    public String toString() {
        return "D{" + "listF=" + listF + ", e=" +'{' + e + '}';
    }

    //0.1
    
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
