
package ec.espe.edu.persistence.controller;

import java.util.ArrayList;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */

public interface Persistence  {
//    public Object create(Object data);
    public boolean create(String data, String table );
    public boolean create(Object object );
    public ArrayList<Object> read(String filterKey , String filterValue, String table);
//    public String read(String filterKey , String filterValue, String table);
    public String readAll(String table);
//    public ArrayList<Object> readAl(String name);    
    
    
    public boolean update(String filterKey , String filterValue,String newData, String table);
    
    public boolean delete(String filterKey , String filterValue, String table);
}
