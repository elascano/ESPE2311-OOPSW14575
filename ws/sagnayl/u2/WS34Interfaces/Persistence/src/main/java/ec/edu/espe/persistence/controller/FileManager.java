package ec.edu.espe.persistence.controller;

import java.io.File;

/**
 *
 * @author Luis Sagnay
 */
public abstract class FileManager implements Persistence{
    File file;
    
    public boolean createFile(String fileName){
        return false;
    }
    
    public boolean openFile(String fileName){
        return true;
    }
    
    public boolean closeFile(String fileName){
        return true;
    }
}
