package ec.edu.espe.fromumlcode.model;

import java.util.ArrayList;

/**
 *
 * @author Stefany Díaz, HoneyBadgers, DCCO - ESPE
 */
public class C extends A{
    private ArrayList<E> ee;

    @Override
    public String toString() {
        return "C{" + "ee=" + ee + '}';
    }

    public C(ArrayList<E> ee, ArrayList<A> aa) {
        super(aa);
        this.ee = ee;
    }

    public C(ArrayList<A> aa) {
        super(aa);
    }

    /**
     * @return the ee
     */
    public ArrayList<E> getEe() {
        return ee;
    }

    /**
     * @param ee the ee to set
     */
    public void setEe(ArrayList<E> ee) {
        this.ee = ee;
    }
    

}
