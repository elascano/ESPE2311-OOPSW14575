package espe.edu.ec.zooabstraction.model;

import java.util.Date;

/**
 *
 * @author RC_558
 */
public abstract class Vertebrate extends Animal {

    public Vertebrate(String id, String scientificName, Date bornOnDate, int cageId) {
        super(id, scientificName, bornOnDate, cageId);
    }

    @Override
    public String toString() {
        return "Vertebrate{" + super.toString()+ '}';
    }

}
