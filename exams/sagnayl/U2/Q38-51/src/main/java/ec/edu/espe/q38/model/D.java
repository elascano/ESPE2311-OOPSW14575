package ec.edu.espe.q38.model;

import java.util.ArrayList;

/**
 *
 * @author Luis Sagnay
 */
public class D extends A{
    private ArrayList<F> listF;
    private E[] listE = new E[4];

    public D(ArrayList<F> listF, A atributeA, ArrayList<A> ArrayListA) {
        super(atributeA, ArrayListA);
        this.listF = listF;
    }

    @Override
    public String toString() {
        return "D{" + "listF=" + getListF() + ", listE=" + getListE() + '}';
    }

    @Override
    public void methodA() {
        super.methodA();
        System.out.println("Method D");
    }

    /**
     * @return the listF
     */
    public ArrayList<F> getListF() {
        return listF;
    }

    /**
     * @param listF the listF to set
     */
    public void setListF(ArrayList<F> listF) {
        this.listF = listF;
    }

    /**
     * @return the listE
     */
    public E[] getListE() {
        return listE;
    }

    /**
     * @param listE the listE to set
     */
    public void setListE(E[] listE) {
        this.listE = listE;
    }
    
}
