
package ec.espe.edu.designPattern.model;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class MySqlConnection extends Connection{

    public MySqlConnection() {
    }
    
    @Override
    public String description(){
        return "MySQL";
    }
}
