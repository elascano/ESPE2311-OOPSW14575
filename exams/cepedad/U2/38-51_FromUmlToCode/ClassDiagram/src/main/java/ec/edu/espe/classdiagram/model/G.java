package ec.edu.espe.classdiagram.model;

import ec.edu.espe.classdiagram.view.H;

/**
 *
 * @author David
 */
public class G extends H{
    
    @Override
    public void useJ(J j) {
         System.out.println(j+" is used");
    }
}
