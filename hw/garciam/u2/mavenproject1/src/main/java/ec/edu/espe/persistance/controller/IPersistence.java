package ec.edu.espe.persistance.controller;

import java.util.ArrayList;

/**
 *
 * @author mateo
 */
public interface IPersistence {
   public boolean create(Object data, String table);
   public boolean create(String data, String table);
   
   //public ArrayList<Object>read(String filterKey, String filterValue, String table);
   public String read(String filterKey, String filterValue, String table);
   //public String readAll(String table);
   
   public ArrayList<Object>readAll(String filterKey);
   
   public boolean update(String filterKey, String filterValue,String newData, String table);
   public boolean delete(String filterKey, String filterValue, String table);
   
   
   
}
