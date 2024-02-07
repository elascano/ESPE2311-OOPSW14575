
package ec.edu.espe.Q38.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jefferson Yepez, DCCO - ESPE, BitCoderz
 */
public class B extends A{
    private ArrayList<B> b = new ArrayList<>();

    @Override
    public String toString() {
        return "B{" + "b=" + b + '}';
    }

    /**
     * @return the b
     */
    public ArrayList<B> getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(ArrayList<B> b) {
        this.b = b;
    }

    public B(List<A> listA) {
        super(listA);
    }

    public B() {
    }
    
}
