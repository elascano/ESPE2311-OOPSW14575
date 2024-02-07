package ec.edu.espe.persistence.controller;

/**
 *
 * @author Luis Sagnay
 */
public interface DBManager extends Persistence{
    public abstract void connect (String URI);
    public abstract void closeConnection();
    
}
