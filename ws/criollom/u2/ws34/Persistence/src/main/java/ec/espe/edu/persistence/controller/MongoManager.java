
package ec.espe.edu.persistence.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mongodb.client.MongoCollection;
import static java.lang.reflect.Array.get;
import java.util.ArrayList;
import org.bson.Document;


/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class MongoManager extends NoSQL{
    private String URI;
    private String DATABASE_NAME;
    private String COLLECTION_NAME;

    public MongoManager(String URI, String DATABASE_NAME, String COLLECTION_NAME) {
        this.URI = URI;
        this.DATABASE_NAME = DATABASE_NAME;
        this.COLLECTION_NAME = COLLECTION_NAME;
    }
    
    
    
    @Override
    public void connect(String URL) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void closeConnection(String connection) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean create(String data, String table) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Object> read(String filterKey, String filterValue, String table) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String readAll(String table) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(String filterKey, String filterValue, String newData, String table) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(String filterKey, String filterValue, String table) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean create(Object object) {
        MongoCollection<Document> collection = getNoSQLCollection(URI, DATABASE_NAME, COLLECTION_NAME);
        if(collection!=null){
            Gson gson = new GsonBuilder().create();
            String json=gson.toJson(object);
            Document personDocument = Document.parse(json);
            collection.insertOne(personDocument);
            System.out.println("Objeto registrado en la base de datos");
            return true;
            
        }else{
            System.out.println("No se pudo insertar el objeto a la base de datos");
            return false;
        }
        
    }
    



    public String getURI() {
        return URI;
    }

    /**
     * @param URI the URI to set
     */
    public void setURI(String URI) {
        this.URI = URI;
    }

    /**
     * @return the DATABASE_NAME
     */
    public String getDATABASE_NAME() {
        return DATABASE_NAME;
    }

    /**
     * @param DATABASE_NAME the DATABASE_NAME to set
     */
    public void setDATABASE_NAME(String DATABASE_NAME) {
        this.DATABASE_NAME = DATABASE_NAME;
    }

    /**
     * @return the COLLECTION_NAME
     */
    public String getCOLLECTION_NAME() {
        return COLLECTION_NAME;
    }

    /**
     * @param COLLECTION_NAME the COLLECTION_NAME to set
     */
    public void setCOLLECTION_NAME(String COLLECTION_NAME) {
        this.COLLECTION_NAME = COLLECTION_NAME;
    }


    
    
    
}
