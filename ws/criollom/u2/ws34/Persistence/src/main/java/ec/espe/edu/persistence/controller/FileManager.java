
package ec.espe.edu.persistence.controller;

import java.io.File;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public abstract class FileManager implements Persistence{
    File file;
    
    public boolean createFile(String table){
        
        return false;
    }
    
    public boolean openFile(String table){
        
        return false;
    }
    
    public boolean closeFile(String table){
        
        return false;
    }
}
