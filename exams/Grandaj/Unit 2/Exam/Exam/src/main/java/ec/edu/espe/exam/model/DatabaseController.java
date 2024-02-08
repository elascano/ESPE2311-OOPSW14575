package ec.edu.espe.exam.model;

/**
 *
 * @author Juan Granda
 */
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author Juan Granda
 */
public class DatabaseController {

    String clientURL;
    String databaseName;
    MongoDatabase database;

    private static DatabaseController instance;

    private DatabaseController() {
        this.clientURL = "mongodb+srv://juangranda3424:papijuan@cluster0.yibiazg.mongodb.net/";
        this.databaseName = "Exam";
        this.database = DatabaseManager.connectToDatabase(clientURL, databaseName);
    }

    public synchronized static DatabaseController getInstance() {
        if (instance != null) {

        } else {
            instance = new DatabaseController();
        }

        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public MongoCollection changeCollection(String collectionName) {
        MongoCollection<Document> collection = DatabaseManager.connectToCollection(database, collectionName);
        return collection;
    }
}


