
package utils;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author Alex Cuzco, HoneyBadgers, DCCO-ESPE
 */


public class ConexionMongoDB {
    private static ConexionMongoDB instancia;
    private MongoClient mongo;
    private MongoDatabase db;
    private MongoCollection<Document> contacts;
    public static ConexionMongoDB obtenerInstancia() {
        if (instancia == null) {
            instancia = new ConexionMongoDB();
        }
        return instancia;
    }
    public MongoCollection<Document> getCategorias() {
        return contacts;
    }

    private ConexionMongoDB() {
        String servidor = "localhost";
        int puerto = 27017;

      
            mongo = new MongoClient(servidor, puerto);
            db = mongo.getDatabase("ContactsInfo");
            contacts = db.getCollection("Contacts");
            System.out.println("Conexión a MongoDB establecida correctamente.");
        
    }

    

    public boolean estaConectado() {
        // Verificar si la conexión está establecida
        return (mongo != null && db != null && contacts != null);
    }

 
    private static MongoCollection<Document> obtenerColeccion() {
        return instancia.contacts;  // Devuelve la colección previamente inicializada
    }
}
    
