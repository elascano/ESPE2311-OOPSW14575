
package ec.espe.edu.designPattern.model;

/**
 *
 * @author Rony
 */
public class FactoryOne extends Factory{
    @Override
    public Connection createConnection(String type) { //Factory method if (type.equals("Oracle"))
        if (type.equals("Oracle"))
        return new OracleConnection();
    else
        return new MySqlConnection();
    }

}
