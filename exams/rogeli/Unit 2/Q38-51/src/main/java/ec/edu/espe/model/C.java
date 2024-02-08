
package ec.edu.espe.model;


/**
 *
 * @author ilhan 
 */
public class C extends A{
    private E[] e = new E[3];

    @Override
    public String toString() {
        return "C{" + "e=" + e + '}';
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
