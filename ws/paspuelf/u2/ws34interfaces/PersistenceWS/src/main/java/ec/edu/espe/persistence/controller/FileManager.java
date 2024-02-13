package ec.edu.espe.persistence.controller;

/**
 *
 * @author Olivier Paspuel
 */
public abstract class FileManager implements Persistence {

    public boolean createFile(String fileName) {
        return false;
    }

    public boolean openFile(String fileName) {
        return false;
    }

    public boolean closeFile(String fileName) {
        return false;
    }

}
