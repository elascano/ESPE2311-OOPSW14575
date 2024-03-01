package ec.edu.espe.fromumlcode.view;

import ec.edu.espe.fromumlcode.model.A;
import ec.edu.espe.fromumlcode.model.B;
import ec.edu.espe.fromumlcode.model.C;
import ec.edu.espe.fromumlcode.model.D;
import ec.edu.espe.fromumlcode.model.E;
import ec.edu.espe.fromumlcode.model.F;
import ec.edu.espe.fromumlcode.model.G;
import ec.edu.espe.fromumlcode.model.H;
import ec.edu.espe.fromumlcode.model.J;
import java.util.ArrayList;

/**
 *
 * @author Stefany Díaz, HoneyBadgers, DCCO - ESPE
 */
public class FromUmlToCodeMain {

    public static void main(String[] args) {
        A a;    
        B b;    
        C c;    
        D d; 
        E e;
        ArrayList<A> as = new ArrayList<>();   
        ArrayList<B> bs = new ArrayList<>();    
        C[] cs = new C[3];    
        D[] ds = new D[4];   
        
        System.out.println("Class A" + A.class);
        System.out.println("Class B" + B.class);
        System.out.println("Class C" + C.class);
        System.out.println("Class D" + D.class);
        System.out.println("Class E" + E.class);




    }
   
}
