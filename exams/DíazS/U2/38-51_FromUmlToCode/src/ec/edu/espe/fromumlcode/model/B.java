package ec.edu.espe.fromumlcode.model;

import java.util.ArrayList;

/**
 *
 * @author Stefany Díaz, HoneyBadgers, DCCO - ESPE
 */
public class B extends A {
    private ArrayList<G> gg;

    @Override
    public String toString() {
        return "B{" + "gg=" + gg + '}';
    }

    public B(ArrayList<G> gg, ArrayList<A> aa) {
        super(aa);
        this.gg = gg;
    }

    public B(ArrayList<A> aa) {
        super(aa);
    }

    /**
     * @return the gg
     */
    public ArrayList<G> getGg() {
        return gg;
    }

    /**
     * @param gg the gg to set
     */
    public void setGg(ArrayList<G> gg) {
        this.gg = gg;
    }

}
