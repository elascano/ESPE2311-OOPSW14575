
package ec.edu.espe.persistence.controller;

import java.util.ArrayList;

/**
 *
 * @author Sebastian
 */
public interface Persistence {
    //public Object create(Object data);
    public Object create(String data,String table);
    //public ArrayList<Object> read(String filterKey,String filerValue,String table);
    public String read(String filterKey,String filerValue,String table);
    //public ArrayList<Object> readAll(String table);
    public String readAll(String table);
    public boolean update(String filterKey,String filerValue,String newData,String table );
    public boolean delete(String filterKey,String filerValue,String newData,String table);
    
}
