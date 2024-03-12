
package ec.espe.edu.designPattern.model;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public abstract class Factory {
    
    public Factory() {}
    
        public abstract Connection createConnection(String type);

}   