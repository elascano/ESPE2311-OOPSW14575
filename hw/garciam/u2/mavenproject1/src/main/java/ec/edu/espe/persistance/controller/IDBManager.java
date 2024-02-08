package ec.edu.espe.persistance.controller;

/**
 *
 * @author mateo    
 */
public interface IDBManager extends IPersistence {
    public abstract void connect (String URI);
    public abstract void closeConnection();
}
