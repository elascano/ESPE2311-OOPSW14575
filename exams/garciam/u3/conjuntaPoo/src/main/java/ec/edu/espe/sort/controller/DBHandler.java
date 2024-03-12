
package ec.edu.espe.sort.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.bson.Document;

/**
 *
 * @author mateo
 */

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.utils.Constants;


public class DBHandler<T> extends FileHandler implements SimpleCrudOperation<T> {

    @Override
    public List<T> readJSONListGeneric(String collectionName, Class<T> classTarget) {
        MongoHandler.conectToDb();

        MongoDatabase database = MongoHandler.mongoClient.getDatabase(Constants.DATA_BASE);
        MongoCollection<Document> collection = database.getCollection(collectionName);

        List<Document> fullTable = collection.find().into(new ArrayList<>());
        List<T> customersFromDataBase = new ArrayList<>();

        for (Document doc : fullTable) {
            Type type = TypeToken.getParameterized(classTarget).getType();

            customersFromDataBase.add(new Gson().fromJson(doc.toJson(), type));
        }
        return customersFromDataBase;
    }

    @Override
    public void saveCollection(List<T> templateList, String collectionName) {
        MongoHandler.mongoClient.getDatabase(Constants.DATA_BASE).getCollection(collectionName).drop();

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        gson.toJson(templateList);
        List<Document> documents = templateList.stream().map(template -> Document.parse(gson.toJson(template))).collect(Collectors.toList());
        
        MongoHandler.mongoClient.getDatabase(Constants.DATA_BASE).getCollection(collectionName).insertMany(documents);
    }
    
    

    
}
