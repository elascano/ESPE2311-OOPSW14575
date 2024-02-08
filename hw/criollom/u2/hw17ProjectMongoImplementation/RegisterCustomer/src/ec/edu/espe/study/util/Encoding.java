package ec.edu.espe.study.util;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.study.model.Customer;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.slf4j.Logger;

public class Encoding {

    private static final String URI = "mongodb+srv://gabriel2004mat:1234@cluster0.dsm2nfg.mongodb.net/";
    private static final String DATABASE_NAME = "Far_DB";
    private static final String COLLECTION_NAME = "Customers";

    public static MongoCollection<Document> conexion() {
        try {
            MongoClient mongoClient = MongoClients.create(URI);
            MongoDatabase database = mongoClient.getDatabase(DATABASE_NAME);
            return database.getCollection(COLLECTION_NAME);
        } catch (MongoException e) {
            System.err.println(e.getCause());
            return null; 
        }
    }
    
    public static void printAll() {
        try {
            MongoClient mongoClient = MongoClients.create(URI);
            MongoDatabase database = mongoClient.getDatabase(DATABASE_NAME);
            MongoCollection<Document> collection = database.getCollection(COLLECTION_NAME);
            collection.find().forEach(doc -> System.out.println(doc.toJson()));
        } catch (MongoException e) {
            System.err.println(e.getCause());
        }
    }
    
    
    

    public static void crear(Customer customer) {
        try {
            MongoCollection<Document> collection = conexion();
            if (collection != null) {
                Document nuevoDocumento = new Document()
                        .append("nombre", customer.getCustomerName())
                        .append("email", customer.getEmail())
                        .append("phoneNumber", customer.getPhoneNumber())
                        .append("addres",customer.getAddres());

                collection.insertOne(nuevoDocumento);

                System.out.println("Cliente registrado insertado correctamente.");
            }
        } catch (MongoException e) {
            System.out.println("No se pudo registrar");
            System.err.println(e.getCause());
        }
    }
    
    
    public static void buscar(String name){
        try {
            MongoCollection<Document> collection = conexion();
            if(collection!=null){
                Document found =(Document) collection.find(new Document("nombre",name)).first();
                if(found!=null){
                    System.out.println("Usuario encontrado");
                    System.out.println("datos"+found.toJson());
                }else{
                    System.out.println("No se encontro usuario");
                }
                
            }
            
            
            
        } catch (MongoException e) {
            System.err.println(e.getCause());
        }
    }
    
    
    
    public static boolean confirm(String name){
        try {
            MongoCollection<Document> collection = conexion();
            if(collection!=null){
                Document found =(Document) collection.find(new Document("nombre",name)).first();
                if(found!=null){
                    System.out.println("Usuario encontrado");
                    return true;
                }else{
                    System.out.println("No se encontro usuario");
                    return false;
                }
                
            }
            
            
            
        } catch (MongoException e) {
            System.err.println(e.getCause());
            return false;
        }
        return false;
    }
    
    public static void cambiar(String addres, String name){
        try {
            MongoCollection<Document> collection = conexion();
            if(collection!=null){
                Document found =(Document) collection.find(new Document("nombre",name)).first();
                if(found!=null){
                    Bson updateValue = new Document("addres",addres);
                    Bson updateOperation = new Document("$set",updateValue);
                    collection.updateOne(found, updateOperation);
                    System.out.println("Cambio realizado");
                }else{
                    System.out.println("No se encontro usuario");
                }
                
            }
            
            
            
        } catch (MongoException e) {
            System.err.println(e.getCause());
        }
        
    }
    
    public static void eliminar(String name) {
    try {
        MongoCollection<Document> collection = conexion();
        if (collection != null) {
            Bson filtro = new Document("nombre", name);
            collection.deleteOne(filtro);
            System.out.println("Cliente eliminado correctamente.");
        }
    } catch (MongoException e) {
        System.out.println("No se pudo eliminar el cliente");
        System.err.println(e.getCause());
    }
}
    
    
}





