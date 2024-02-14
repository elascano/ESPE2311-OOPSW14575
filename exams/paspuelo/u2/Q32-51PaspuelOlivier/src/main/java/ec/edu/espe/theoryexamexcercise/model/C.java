
package ec.edu.espe.theoryexamexcercise.model;

import java.util.ArrayList;

/**
 *
 * @author Antonio Revilla
 */
public class C extends A{
    ArrayList<E> es;

    public C(ArrayList<E> es, ArrayList<A> as) {
        super(as);
        this.es = es;
    }

    @Override
    public String toString() {
        return "C" + "is an aggregation of" + es + "extends ->" + super.toString();
    }

    
}
