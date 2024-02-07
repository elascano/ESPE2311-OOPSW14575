
package ec.edu.espe.Q38.model;

import java.util.List;

/**
 *
 * @author Jefferson Yepez, DCCO - ESPE, BitCoderz
 */
public class C extends A{
    private E[] e = new E[3];

    public C(List<A> listA) {
        super(listA);
    }

    public C() {
    }

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
