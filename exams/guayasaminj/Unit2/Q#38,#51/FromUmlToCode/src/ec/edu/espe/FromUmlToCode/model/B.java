

package ec.edu.espe.FromUmlToCode.model;

import java.util.ArrayList;

/**
 *
 * @author JosuéG
 */
public class B extends A{
    
private ArrayList<G> g;    

    public B(ArrayList<G> g, ArrayList<A> a) {    
        super(a);
        this.g = g;
    }
    
    public void r(){
        g = new ArrayList<G>();
    }
    
    /**
     * @return the g
     */
    public ArrayList<G> getG() {
        return g;
    }

    /**
     * @param g the gs to set
     */
    public void setG(ArrayList<G> g) {
        this.g = g;
    }
    
    
    
    
    
}
