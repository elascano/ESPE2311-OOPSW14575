package ec.edu.espe.q3851.view;

import java.util.ArrayList;

import ec.edu.espe.q3851.model.A;
import ec.edu.espe.q3851.model.B;
import ec.edu.espe.q3851.model.C;
import ec.edu.espe.q3851.model.D;
import ec.edu.espe.q3851.model.E;
import ec.edu.espe.q3851.model.F;
import ec.edu.espe.q3851.model.G;
import ec.edu.espe.q3851.model.H;

/**
 * @author Andrés Romero - DCCO
 */
public class Q3851 {
    public static void main(String[] args) {
        final A otherA = new A();
        final A a = new A(otherA);

        ArrayList<G> gs = new ArrayList<G>();
        gs.add(new G());
        final B b = new B(gs);

        ArrayList<E> es = new ArrayList<E>();
        es.add(new E());
        es.add(new E());
        final C c = new C(es);

        ArrayList<F> fs = new ArrayList<F>();
        fs.add(new F());
        E[] es2 = new E[5];
        es2[0] = new E();
        final D d = new D(es2, fs);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
