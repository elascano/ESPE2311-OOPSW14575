package ec.edu.espe.Factory.model;

/**
 *
 * @author EDWARICHSNAKE
 */
public class OracleConnection extends Connection{
    public OracleConnection(){    
    }
    
    @Override
    public String description(){
        return "Oracle";
    }
}
