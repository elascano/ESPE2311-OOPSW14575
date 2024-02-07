package ec.edu.espe.q3851.model;

import java.util.ArrayList;

public class C extends A {
    @Override
    public String toString() {
        return "C [e=" + e + "]";
    }

    public C(ArrayList<E> e) {
        this.e = e;
    }

    private ArrayList<E> e;

    public ArrayList<E> getE() {
        return e;
    }

    public void setE(ArrayList<E> e) {
        this.e = e;
    } 
}
