package ec.edu.espe.q38.model;

import java.util.ArrayList;

/**
 *
 * @author Luis Sagnay
 */
public class B extends A{
    private ArrayList<B> listB = new ArrayList<>();

    public B(A atributeA, ArrayList<A> ArrayListA) {
        super(atributeA, ArrayListA);
    }

    @Override
    public String toString() {
        return "B{" +super.toString() + "b=" + listB + '}';
    }

    @Override
    public void methodA() {
        super.methodA();
        System.out.println("Method B");
    }

    /**
     * @return the b
     */
    public ArrayList<B> getB() {
        return listB;
    }

    /**
     * @param b the b to set
     */
    public void setB(ArrayList<B> b) {
        this.listB = b;
    }

}
