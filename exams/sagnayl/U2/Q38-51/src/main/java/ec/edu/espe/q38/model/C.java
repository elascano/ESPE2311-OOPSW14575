package ec.edu.espe.q38.model;

import java.util.ArrayList;

/**
 *
 * @author Luis Sagnay
 */
public class C extends A{
    private E[] listE = new E[3];

    public C(A atributeA, ArrayList<A> ArrayListA) {
        super(atributeA, ArrayListA);
    }

    @Override
    public String toString() {
        return "C{" +super.toString() + "listE=" + getListE() + '}';
    }

    @Override
    public void methodA() {
        super.methodA();
        System.out.println("Method C");
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
