package ec.edu.espe.q3851.model;

import java.util.ArrayList;
import java.util.Arrays;

public class D extends A {
    @Override
    public String toString() {
        return "D [d=" + Arrays.toString(d) + ", f=" + f + "]";
    }

    private E[] d = new E[5];
    private ArrayList<F> f;

    public D(E[] d, ArrayList<F> f) {
        this.d = d;
        this.f = f;
    }

    public E[] getD() {
        return d;
    }

    public void setD(E[] d) {
        this.d = d;
    }

    public ArrayList<F> getF() {
        return f;
    }

    public void setF(ArrayList<F> f) {
        this.f = f;
    }
}
