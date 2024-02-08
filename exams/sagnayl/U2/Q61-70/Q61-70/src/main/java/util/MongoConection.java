package util;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

/**
 *
 * @author Luis Sagnay
 */
public class MongoConection {
    private static MongoClient mongoClient;

    public static MongoClient conectToMongoDb() {
        if (mongoClient == null) {
            mongoClient = MongoClients.create("mongodb+srv://luis:luis2@cluster0.h5n9yna.mongodb.net/?retryWrites=true&w=majority");
            System.out.println("Conected with MongoBD");
        }
        return mongoClient;
    }
}
