package ec.edu.espe.q38.model;

import java.util.ArrayList;

/**
 *
 * @author Luis Sagnay
 */
public class E {
    private ArrayList<C> listC;
    private E[] listE = new E[5];

    public E(ArrayList<C> listC) {
        this.listC = listC;
    }

    @Override
    public String toString() {
        return "E{" + "listC=" + getListC() + ", listE=" + getListE() + '}';
    }

    /**
     * @return the listC
     */
    public ArrayList<C> getListC() {
        return listC;
    }

    /**
     * @param listC the listC to set
     */
    public void setListC(ArrayList<C> listC) {
        this.listC = listC;
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
