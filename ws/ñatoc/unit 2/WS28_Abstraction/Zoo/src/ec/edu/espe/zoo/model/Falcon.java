
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Carlos Ñato, The Javas, DCC-ESPE
 */
public class Falcon extends Bird{

    public Falcon(int beak, String habitat, String spine, int size, int id, String cientificName, Date bornDate, int cageId) {
        super(beak, habitat, spine, size, id, cientificName, bornDate, cageId);
    }
      @Override
    public void feed(){
    };  
    
    
}
