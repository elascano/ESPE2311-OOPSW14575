
package ec.espe.edu.designPattern.model;

/**
 *
 * @author Rony
 */
public abstract class Factory {
    
    public Factory() {}
    
        public abstract Connection createConnection(String type);

}   