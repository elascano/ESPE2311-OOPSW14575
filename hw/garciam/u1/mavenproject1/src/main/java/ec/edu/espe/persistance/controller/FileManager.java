package ec.edu.espe.persistance.controller;

import java.io.File;

/**
 *
 * @author mateo
 */
public abstract class FileManager implements IPersistence {

    File file;

    public boolean createFile(String table) {
        return false;
    }

    public boolean openFile(String path) {
        return true;
    }

    public boolean closeFile(String path) {
        return true;
    }
}
