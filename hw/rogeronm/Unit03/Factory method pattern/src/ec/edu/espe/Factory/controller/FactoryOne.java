package ec.edu.espe.Factory.controller;

import ec.edu.espe.Factory.model.Connection;
import ec.edu.espe.Factory.model.MySqlConnection;
import ec.edu.espe.Factory.model.OracleConnection;

/**
 *
 * @author EDWARICHSNAKE
 */
public class FactoryOne extends Factory{

    @Override
    public Connection createConnection(String type) {
       if(type.equals("Oracle")){
           return new OracleConnection();
       }else{
           return new MySqlConnection();
       }
    }
}
