

package ec.edu.espe.model;

import java.util.ArrayList;

/**
 *
 * @author Ilhan r
 */
public class E {   //1
    
    //-1
    
private ArrayList<E> arrayListEC = new ArrayList<>();
    private E[] e = new E[5];

    public E() {
    }

    @Override
    public String toString() {
        return "E{" + "arrayListEC=" + arrayListEC + ", e=" + e + '}';
    }

    /**
     * @return the arrayListEC
     */
    public ArrayList<E> getArrayListEC() {
        return arrayListEC;
    }

    /**
     * @param arrayListEC the arrayListEC to set
     */
    public void setArrayListEC(ArrayList<E> arrayListEC) {
        this.arrayListEC = arrayListEC;
    }

    /**
     * @return the e
     */
    public E[] getE() {
        return e;
    }

    /**
     * @param e the e to set
     */
    public void setE(E[] e) {
        this.e = e;
    }
}
