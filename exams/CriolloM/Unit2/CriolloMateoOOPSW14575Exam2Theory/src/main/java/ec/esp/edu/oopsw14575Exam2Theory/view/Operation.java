
package ec.esp.edu.oopsw14575Exam2Theory.view;

import ec.esp.edu.oopsw14575Exam2Theory.model.A;
import ec.esp.edu.oopsw14575Exam2Theory.model.B;
import ec.esp.edu.oopsw14575Exam2Theory.model.C;
import ec.esp.edu.oopsw14575Exam2Theory.model.D;
import ec.esp.edu.oopsw14575Exam2Theory.model.E;
import ec.esp.edu.oopsw14575Exam2Theory.model.F;
import ec.esp.edu.oopsw14575Exam2Theory.model.G;
import ec.esp.edu.oopsw14575Exam2Theory.model.H;
import ec.esp.edu.oopsw14575Exam2Theory.model.J;
import java.util.ArrayList;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class Operation {
    public static void main(String[] args) {
        ArrayList<A> listA = new ArrayList<>();
        
        A elementA = new A(listA);
        
        System.out.println("-->"+elementA.toString());
        ArrayList<H> h = null;
        
        B elementB = new B(h, listA);
        System.out.println("-->"+elementB.toString());
        
        C elementC = new C(listA);
        ArrayList<F> listF = new ArrayList<>();
        System.out.println("-->"+elementC.toString());
        
        D elementD  = new D(listF, listA);
        System.out.println("-->"+elementD.toString());
        
        E elementE = new E();
        System.out.println("-->"+elementE.toString());
        
        F elementF = new F();
        System.out.println("-->"+elementF.toString());
        
        G elementG = new G();
        System.out.println("-->"+elementG.toString());
        
        H elementH=null;
        System.out.println("-->"+elementH);
        
        J elementj = new J();
        System.out.println("-->"+elementj.toString());
    
    }
}
