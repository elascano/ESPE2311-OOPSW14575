
package ec.edu.espe.model;


/**
 *
 * @author ilhan 
 */
public class C extends A{        //1
    private E[] e = new E[3];    //0.3

    @Override
    public String toString() {
        return "C{" + "e=" + e + '}';
    }

    
    //0.1
    
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
