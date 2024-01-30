
package ec.espe.edu.persistence.controller;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public abstract class DBManager implements Persistence {
    
    public abstract void connect(String URI);
    public abstract void closeConnection(String connection);

}
