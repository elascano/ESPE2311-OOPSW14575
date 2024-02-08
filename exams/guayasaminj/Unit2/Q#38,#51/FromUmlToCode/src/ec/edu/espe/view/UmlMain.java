

package ec.edu.espe.view;
import ec.edu.espe.FromUmlToCode.model.A;
import ec.edu.espe.FromUmlToCode.model.B;
import ec.edu.espe.FromUmlToCode.model.C;
import ec.edu.espe.FromUmlToCode.model.D;
import ec.edu.espe.FromUmlToCode.model.E;
import ec.edu.espe.FromUmlToCode.model.F;
import ec.edu.espe.FromUmlToCode.model.G;
import ec.edu.espe.FromUmlToCode.model.H;
import ec.edu.espe.FromUmlToCode.model.J;
import java.util.ArrayList;


/**
 *
 * @author JosuéG
 */
public class UmlMain {
    public static void main(String[] args) {
        System.out.println("Author: Josue Guayasamin");
        A a;    
        B b;    
        C c;    
        D d;   
        ArrayList<A> as = new ArrayList<>();   
        ArrayList<B> bs = new ArrayList<>();    
        C[] cs = new C[3];    
        D[] ds = new D[4];    
        
        
        ArrayList<E> ees = new ArrayList<>();   
        ArrayList<F> fs = new ArrayList<>();    
        ArrayList<G> gs = new ArrayList<>();    
        G g = new G();    
        J j = new J();    
        E[] es = new E[5];    
        H h = new G();    

        a = new A(as);    
        b = new B(gs, as);    
        c = new C(ees, as);    
        d = new D(es, fs, as);    
        
        bs.add(b);    
        bs.add(b);    

        for(int i = 0 ; i < cs.length ; i++){    
            cs[i] = c;
        }
        
        for(int i = 0 ; i < ds.length ; i++){   
            ds[i] = d;
        }
        
        
        System.out.println("bs -> " + bs);    
        System.out.println("cs ->");    
        for(int i = 0 ; i < cs.length ; i++){
            System.out.println("cs[" + i + "] -> " + cs[i]);
        }
        
        System.out.println("ds ->");   
        for(int i = 0 ; i < cs.length ; i++){
            System.out.println("ds[" + i + "] -> " + ds[i]);
        }     
    }
    }

