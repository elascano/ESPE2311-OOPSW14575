
package ec.edu.espe.exam.controller;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.exam.model.DatabaseManager;
import ec.edu.espe.exam.model.Mapeable;
import ec.edu.espe.exam.model.University;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Juan Granda
 */
public class CountryController implements Mapeable{
    DatabaseController database;
    MongoCollection collection;
    
    private static CountryController instance;
    
    public CountryController() {
        this.database = DatabaseController.getInstance();
        this.collection = DatabaseController.getInstance().changeCollection("University");
    }
    
    public synchronized static CountryController getInstance (){
        if (instance != null){
        
        } 
        else {
            instance = new CountryController();
        }
        
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
    
    public void save(University country){
        DatabaseManager.insertDocument(collection, country.getData());
    }
    
    public University obtain(int id){
        HashMap<Object,Object> countryMap = DatabaseManager.obtain(collection, id);
        String name = countryMap.get("name").toString();

        University country = new University(countryMap, id, name, id);
        return country;
    }
    
    public ArrayList<University> obtainAll(){
        ArrayList<HashMap<Object,Object>> countryMaps = DatabaseManager.obtainAll(collection);
        
        ArrayList<University> countrys = new ArrayList<>();
                
        for(HashMap<Object,Object> countryMap : countryMaps){
            int id = Integer.parseInt(countryMap.get("id").toString());
            String name = countryMap.get("name").toString();

            University country = new University(countryMap, id, name, id);
            
            if(country != null){
                countrys.add(country);
            }
        }
        return countrys;
    }

    @Override
    public HashMap<Object, Object> getData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
