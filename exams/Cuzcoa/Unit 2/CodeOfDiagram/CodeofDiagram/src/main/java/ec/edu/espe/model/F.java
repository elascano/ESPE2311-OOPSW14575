
package ec.edu.espe.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alex Cuzco, HoneyBadgers, DCCO-ESPE
 */
public class F {
    private List<D> relationD;

    public F() {
        this.relationD = new ArrayList<>();
    }

    public void agregarRelacionD(D d) {
        relationD.add(d);
    }
   
}
