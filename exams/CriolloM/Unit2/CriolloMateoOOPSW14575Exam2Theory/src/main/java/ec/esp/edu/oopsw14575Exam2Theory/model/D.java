
package ec.esp.edu.oopsw14575Exam2Theory.model;

import java.util.ArrayList;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class D extends A{

    private ArrayList <F> listF;
    private E[] listE;

    
    public D(ArrayList<F> listF, ArrayList<A> listA) {
        super(listA);
        listF.set(5, listF.get(5));
    }

    
    

}
