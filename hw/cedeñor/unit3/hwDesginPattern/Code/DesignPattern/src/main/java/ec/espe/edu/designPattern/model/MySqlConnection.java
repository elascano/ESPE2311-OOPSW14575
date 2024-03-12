
package ec.espe.edu.designPattern.model;

/**
 *
 * @author Rony
 */
public class MySqlConnection extends Connection{

    public MySqlConnection() {
    }
    
    @Override
    public String description(){
        return "MySQL";
    }
}
