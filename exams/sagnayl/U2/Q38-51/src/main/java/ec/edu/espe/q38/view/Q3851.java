package ec.edu.espe.q38.view;

import ec.edu.espe.q38.model.A;
import ec.edu.espe.q38.model.B;
import ec.edu.espe.q38.model.C;
import ec.edu.espe.q38.model.D;
import ec.edu.espe.q38.model.E;
import ec.edu.espe.q38.model.F;
import ec.edu.espe.q38.model.G;
import ec.edu.espe.q38.model.J;
import java.util.ArrayList;


/**
 *
 * @author Luis Sagnay
 */
public class Q3851 {

    public static void main(String[] args) {
        A a = new A(null, new ArrayList<>());
        B b = new B(a, new ArrayList<>());
        C c = new C(a, new ArrayList<>());
        D d = new D(new ArrayList<>(), a, new ArrayList<>());
        E e = new E(new ArrayList<>());
        F f = new F();
        G g = new G();
        J j = new J();

        a.methodA();
        System.out.println(a);

        b.methodA();
        System.out.println(b);

        c.methodA();
        System.out.println(c);

        d.methodA();
        System.out.println(d);

        System.out.println(e);

        g.methodH();

        System.out.println(j);
    }
}
