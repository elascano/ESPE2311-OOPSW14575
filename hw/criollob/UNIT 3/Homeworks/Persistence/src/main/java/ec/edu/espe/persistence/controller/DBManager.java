/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.persistence.controller;

/**
 *
 * @author Usuario
 */
public abstract class DBManager implements Persistence{
    public abstract void connect(String URL);
    public abstract void closeConnection(String Connection);
    
        
    
}
