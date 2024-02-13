
package ec.edu.espe.persistence.controller;

/**
 *
 * @author Olivier Paspuel
 */
public abstract class DBManager implements Persistence {
    public abstract Object connect(String URI);

    public abstract void closeConnection(String connection);
}
