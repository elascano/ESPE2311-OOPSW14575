package utils;

import java.util.ArrayList;
import javax.swing.text.Document;

/**
 *
 * @author David
 */
public abstract class DataPersistence {
    public abstract void insert(String collectionName, String json);
    public abstract ArrayList read(String collectionName);
    public abstract Document find(String collectionName,String keyName,String fieldValue);
    public abstract boolean update(String collectionName, String fieldNameToSearch, String valueToSearch,
        String fieldNameToUpdate, String valueToUpdate);
}
