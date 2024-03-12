package ec.edu.espe.SortApp.util;

import java.util.Iterator;
import javax.swing.text.Document;

/**
 *
 * @author EDWARICHSNAKE
 */
interface IPersistence {
      public <T> void create(String collection, T object);

    public <T> void update(String collection, T query, T object);
    
    public <T> void delete(String collection, T query);
    
    public <T> Iterator<T> read(String collection, T query);
    public <T> Iterator<T> readAll(String collection, Class<T> clazz);
    public <T> T readOne(String collection, Document query, Class<T> clazz);
}
