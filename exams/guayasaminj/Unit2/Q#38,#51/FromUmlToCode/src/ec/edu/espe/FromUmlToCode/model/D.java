

package ec.edu.espe.FromUmlToCode.model;

import java.util.ArrayList;

/**
 *
 * @author JosuéG
 */
public class D extends A{
   private E[] e;         
    private ArrayList<F> f;

    public D(E[] e, ArrayList<F> f, ArrayList<A> a) { 
        super(a);
        e = new E[5];
        this.e = e;
        this.f = f;
    }
    
    
    /**
     * @return the e
     */
    public E[] getE() {
        return e;
    }

    /**
     * @param e the es to set
     */
    public void setE(E[] e) {
        this.e = e;
    }

    /**
     * @return the f
     */
    public ArrayList<F> getF() {
        return f;
    }

    /**
     * @param f the f to set
     */
    public void setF(ArrayList<F> f) {
        this.f = f;
    }
}
