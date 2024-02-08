package ec.edu.espe.fromumlcode.model;

import java.util.ArrayList;

/**
 *
 * @author Stefany Díaz, HoneyBadgers, DCCO - ESPE
 */
public class D extends A{
    private E[] es;         
    private ArrayList<F> ff;

    @Override
    public String toString() {
        return "D{" + "es=" + es + ", ff=" + ff + '}';
    }

    public D(E[] es, ArrayList<F> ff, ArrayList<A> aa) {
        super(aa);
        this.es = es;
        this.ff = ff;
    }

    public D(ArrayList<A> aa) {
        super(aa);
    }

    /**
     * @return the es
     */
    public E[] getEs() {
        return es;
    }

    /**
     * @param es the es to set
     */
    public void setEs(E[] es) {
        this.es = es;
    }

    /**
     * @return the ff
     */
    public ArrayList<F> getFf() {
        return ff;
    }

    /**
     * @param ff the ff to set
     */
    public void setFf(ArrayList<F> ff) {
        this.ff = ff;
    }

}
