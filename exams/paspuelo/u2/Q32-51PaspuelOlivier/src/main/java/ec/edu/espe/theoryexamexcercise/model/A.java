package ec.edu.espe.theoryexamexcercise.model;

import java.util.ArrayList;

/**
 *
 * @author Antonio Revilla
 */

public class A {
    ArrayList<A> as;

    @Override
    public String toString() {
        return "A" + "composed by" + as + '}';
    }

    
    
    public A(ArrayList<A> as) {
        this.as = as;
    }
    
    
}
