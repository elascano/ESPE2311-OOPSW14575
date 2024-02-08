

package ec.edu.espe.FromUmlToCode.model;

import java.util.ArrayList;

/**
 *
 * @author JosuéG
 */
public class A {
  private ArrayList<A> a;    

    public A(ArrayList<A> a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "A{" + "a=" + a + '}';
    }
   
    /**
     * @return the a
     */
    public ArrayList<A> getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setAs(ArrayList<A> a) {
        this.a= a;
    }
    
}
