package ec.edu.espe.q38.model;

import java.util.ArrayList;

/**
 *
 * @author Luis Sagnay
 */
public class A {
    private A atributeA;
    private ArrayList<A> listA;

    public A(A atributeA, ArrayList<A> ArrayListA) {
        this.atributeA = atributeA;
        this.listA = ArrayListA;
    }

    @Override
    public String toString() {
        return "A{" + "atributeA=" + getAtributeA() + ", ArrayListA=" + getArrayListA() + '}';
    }
    
    public void methodA(){
        System.out.println("Method A");
    }

    /**
     * @return the atributeA
     */
    public A getAtributeA() {
        return atributeA;
    }

    /**
     * @param atributeA the atributeA to set
     */
    public void setAtributeA(A atributeA) {
        this.atributeA = atributeA;
    }

    /**
     * @return the ArrayListA
     */
    public ArrayList<A> getArrayListA() {
        return listA;
    }

    /**
     * @param ArrayListA the ArrayListA to set
     */
    public void setArrayListA(ArrayList<A> ArrayListA) {
        this.listA = ArrayListA;
    }

}
