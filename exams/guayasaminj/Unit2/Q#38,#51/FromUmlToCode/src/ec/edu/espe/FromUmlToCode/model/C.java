

package ec.edu.espe.FromUmlToCode.model;

import java.util.ArrayList;

/**
 *
 * @author JosuéG
 */
public class C extends A {
  private ArrayList<E> e;    

    public C(ArrayList<E> e, ArrayList<A> a) {    
        super(a);
        this.e = e;
    }

    @Override
    public String toString() {
        return "C{" + "e=" + e + '}';
    }
    
    /**
     * @return the e
     */
    public ArrayList<E> getE() {
        return e;
    }

    /**
     * @param e the es to set
     */
    public void setE(ArrayList<E> e) {
        this.e = e;
    }
}
