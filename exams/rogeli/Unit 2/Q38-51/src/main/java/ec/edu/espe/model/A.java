
package ec.edu.espe.model;

/**
 *
 * @author Ilhan
 */
public class A {
    private A[] a = new A[1];

    @Override
    public String toString() {
        return "A{" + "a=" + a + '}';
    }

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
