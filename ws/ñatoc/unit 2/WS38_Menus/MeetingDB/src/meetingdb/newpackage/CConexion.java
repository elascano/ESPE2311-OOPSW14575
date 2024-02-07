package meetingdb.newpackage;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoException;
import com.mongodb.client.MongoDatabase;
import java.util.List;
import javax.swing.JOptionPane;
import org.bson.Document;
import com.mongodb.client.MongoCollection;


/**
 *
 * @author Carlos Ñato, The Javas, DCC-ESPE
 */
public class CConexion {
public static MongoClient createConexion(){
    MongoClient mongoClient = null;
    MongoClientURI uri = new MongoClientURI("mongodb+srv://carlos:carloscarlos@cluster0.2u4ccea.mongodb.net/");
    try {
    mongoClient = new MongoClient(uri);   
    
    List<String> NameDataBase = mongoClient.getDatabaseNames();
    
    JOptionPane.showMessageDialog(null, "Se concetó correctamente a Mongo, la lista de base de datos disponibles son: "+ NameDataBase.toString());
     }catch(MongoException e){    
            JOptionPane.showMessageDialog(null, "Error en la concección a Mongo, error :" + e);
    
} return mongoClient;
}

public static MongoCollection<Document> getCollection(MongoClient mongoClient){
        MongoDatabase dataBase = mongoClient.getDatabase("DailyDevDB");
        
        return dataBase.getCollection("Meeting");    

}
public static MongoCollection<Document> getUsersCollection(MongoClient mongoClient){
        MongoDatabase dataBase = mongoClient.getDatabase("DailyDevDB");
        return dataBase.getCollection("Users");    

}

}
