package ec.edu.espe.persistence.controller;

/**
 *
 * @author Luis Sagnay
 */
public interface Persistence {
    public boolean create(Object data, String table);
    public boolean create(String data, String table);
    
    //public ArrayList<Object> read(String filterKey, String filerValue, String table)
    public String read(String filterKey, String filterValue, String table);
    //public String readAll(String table);
    
    public boolean update(String filterKey, String filterValue,String newData, String table);
    
    public boolean delete(String filterKey, String filterValue, String table);
    
}
