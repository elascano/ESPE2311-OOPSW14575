/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Factory.model;

/**
 *
 * @author EDWARICHSNAKE
 */
public class MySqlConnection extends Connection {
    public MySqlConnection(){
        
    }
    
    @Override
    public String description(){
        return "MySQL";
    }
    
}
