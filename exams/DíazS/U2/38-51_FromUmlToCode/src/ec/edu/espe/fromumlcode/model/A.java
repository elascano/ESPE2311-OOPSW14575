package ec.edu.espe.fromumlcode.model;

import java.util.ArrayList;

/**
 *
 * @author Stefany Díaz, HoneyBadgers, DCCO - ESPE
 */
public class A {
    private ArrayList<A> aa;

    @Override
    public String toString() {
        return "A{" + "aa=" + aa + '}';
    }

    public A(ArrayList<A> aa) {
        this.aa = aa;
    }

    /**
     * @return the aa
     */
    public ArrayList<A> getAa() {
        return aa;
    }

    /**
     * @param aa the aa to set
     */
    public void setAa(ArrayList<A> aa) {
        this.aa = aa;
    }

}
