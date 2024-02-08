package ec.edu.espe.persistance.controller;

/**
 *
 * @author mateo
 */
public interface IFileManager extends IPersistence{
    public void createFile(String fileName);
    public void openFile(String fileName);
    public void closeFile(String fileName);

}
