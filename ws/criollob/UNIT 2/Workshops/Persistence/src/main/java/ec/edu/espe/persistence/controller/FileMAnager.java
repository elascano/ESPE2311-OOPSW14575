
package ec.edu.espe.persistence.controller;

import java.io.File;

/**
 *
 * @author Sebastian
 */
public abstract class FileMAnager implements Persistence {
    File file;
    public boolean createFile(String table){
        return false;
        
    }
    public boolean OpenFile(String table){
        return false;
    }
     public boolean closeFile(String table){
        return false;
    }
}
