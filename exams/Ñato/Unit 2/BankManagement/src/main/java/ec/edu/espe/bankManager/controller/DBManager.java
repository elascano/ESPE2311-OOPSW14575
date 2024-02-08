
package ec.edu.espe.bankManager.controller;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.List;
import javax.swing.JOptionPane;
import org.bson.Document;


/**
 *
 * @author Carlos Ñato, The Javas, DCC-ESPE
 */
public class DBManager {
    public static MongoClient createConexion(){
    MongoClient mongoClient = null;
    MongoClientURI uri = new MongoClientURI("mongodb+srv://carlos:carloscarlos@cluster0.2u4ccea.mongodb.net/");
    try {
    mongoClient = new MongoClient(uri);   
    
    List<String> NameDataBase = mongoClient.getDatabaseNames();
    
    JOptionPane.showMessageDialog(null, "Successfully connected to Mongo, the list of available databases are: "+ NameDataBase.toString());
     }catch(MongoException e){    
            JOptionPane.showMessageDialog(null, "Error connecting to Mongo, error :" + e);
    
} return mongoClient;
}

public static MongoCollection<Document> getCollection(MongoClient mongoClient){
        MongoDatabase dataBase = mongoClient.getDatabase("DailyDevDB");
        return dataBase.getCollection("Loan");    

}
    
}
