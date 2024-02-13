package ec.edu.espe.persistence.controller;

/* 
 * @author Olivier Paspuel
 */
public abstract class NoSQLHandler extends DBManager {

    @Override
    public abstract Object connect(String URI);

    public abstract Object connectToCollection(String databaseName, String collectionName);

//    @Override
//    public MongoClient connect(String URI) {
//        MongoClient mongoClient = MongoClients.create(URI);
//        return mongoClient;
//    }
//
//    public MongoCollection<Document> connectToCollection(String databaseName, String collectionName) {
//        MongoClient mongoClient = connect("mongodb+srv://olivier:olivier@cluster0.gguuezt.mongodb.net/?retryWrites=true&w=majority");
//        MongoDatabase db = mongoClient.getDatabase(databaseName);
//        MongoCollection<Document> collection = db.getCollection(collectionName);
//        return collection;
//    }
}
