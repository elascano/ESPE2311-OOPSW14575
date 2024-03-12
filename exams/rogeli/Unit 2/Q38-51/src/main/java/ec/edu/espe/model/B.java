
package ec.edu.espe.model;

import java.util.ArrayList;

/**
 *
 * @author ilhan
 */
public class B extends A {   //1
     private ArrayList<B> b = new ArrayList<>();  

    @Override
    public String toString() {
        return "B{" + "b=" + b + '}';
    }
    
    //0.1
    
    /**
     * @return the b
     */
    public ArrayList<B> getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(ArrayList<B> b) {
        this.b = b;
    }

}
