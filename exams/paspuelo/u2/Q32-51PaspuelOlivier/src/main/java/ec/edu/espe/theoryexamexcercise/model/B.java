
package ec.edu.espe.theoryexamexcercise.model;

import java.util.ArrayList;

/**
 *
 * @author Antonio Revilla
 */

public class B extends A{
    public void r(){
        
    }

    public B(ArrayList<A> as) {
        super(as);
    }
    
    @Override
    public String toString() {
        return "B" + "extends ->" + super.toString();
    }
    
    
}
