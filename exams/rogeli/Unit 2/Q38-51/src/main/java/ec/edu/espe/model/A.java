
package ec.edu.espe.model;

/**
 *
 * @author Ilhan
 */
public class A {       //0.5
    private A[] a = new A[1];    //0.2

    @Override
    public String toString() {
        return "A{" + "a=" + a + '}';
    }

    //0.1
    
    /**
     * @return the a
     */
    public A[] getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(A[] a) {
        this.a = a;
    }


   
}
