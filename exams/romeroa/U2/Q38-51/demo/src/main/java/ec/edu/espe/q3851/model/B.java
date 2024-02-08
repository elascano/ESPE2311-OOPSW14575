package ec.edu.espe.q3851.model;

import java.util.ArrayList;

public class B extends A {
    @Override
    public String toString() {
        return "B [h=" + h + "]";
    }

    private ArrayList<G> h;

    public B(ArrayList<G> h) {
        this.h = h;
    }

    public ArrayList<G> getH() {
        return h;
    }

    public void setH(ArrayList<G> h) {
        this.h = h;
    }
}
