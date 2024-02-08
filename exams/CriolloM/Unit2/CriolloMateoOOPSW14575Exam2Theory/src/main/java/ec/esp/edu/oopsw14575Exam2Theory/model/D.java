
package ec.esp.edu.oopsw14575Exam2Theory.model;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class D extends A{

    private ArrayList <F> listF;
    private E[] listE;

    
    public D(ArrayList<F> listF, ArrayList<A> listA) {
        super(listA);
        this.listF=listF;
    }

    public Object getListF() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "D{" + "listF=" + listF + ", listE=" + Arrays.toString(listE) + '}';
    }

    
    

}
