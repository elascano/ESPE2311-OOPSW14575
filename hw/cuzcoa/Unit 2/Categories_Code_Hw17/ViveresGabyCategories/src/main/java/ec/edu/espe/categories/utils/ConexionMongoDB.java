package ec.edu.espe.categories.utils;

import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import org.bson.Document;

public class ConexionMongoDB {
    private static ConexionMongoDB instancia;
    private MongoClient mongo;
    private MongoDatabase db;
    private MongoCollection<Document> categories;
    public static ConexionMongoDB obtenerInstancia() {
        if (instancia == null) {
            instancia = new ConexionMongoDB();
        }
        return instancia;
    }
    public MongoCollection<Document> getCategorias() {
        return categories;
    }

    private ConexionMongoDB() {
        String servidor = "localhost";
        int puerto = 27017;

      
            mongo = new MongoClient(servidor, puerto);
            db = mongo.getDatabase("ViveresGabyCategories");
            categories = db.getCollection("Categories");
            System.out.println("Conexión a MongoDB establecida correctamente.");
        
    }

    

    public boolean estaConectado() {
        // Verificar si la conexión está establecida
        return (mongo != null && db != null && categories != null);
    }

 
    private static MongoCollection<Document> obtenerColeccion() {
        return instancia.categories;  // Devuelve la colección previamente inicializada
    }
}
    
