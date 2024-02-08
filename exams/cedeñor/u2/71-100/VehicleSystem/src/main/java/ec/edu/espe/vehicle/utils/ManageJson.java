package ec.edu.espe.vehicle.utils;

import com.google.gson.Gson;
import com.google.gson.internal.Primitives;
import com.google.gson.reflect.TypeToken;
import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Projections.excludeId;
import static com.mongodb.client.model.Projections.fields;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author RC_558
 */
public class ManageJson {
        public static <T> T passJsonToObject(Document doc, Class classType){
        String jsonData = doc.toJson();
        Gson gson = new Gson();
        
        T object = (T) gson.fromJson(jsonData, TypeToken.get(classType));
        return (T) Primitives.wrap(classType).cast(object);
    }
    
    public static <T> ArrayList<T> passCollectionToList(MongoCollection coll, Class classType){
        ArrayList<T> objectList = new ArrayList<>();
        T objectInDB;
        
        List<Document> docList;
        docList = (List<Document>) coll.find().projection(fields(excludeId())).into(new ArrayList<>());
        
        for (Document currentDoc : docList) {
            objectInDB = passJsonToObject(currentDoc, classType);
            objectList.add(objectInDB);
        }
        
        return objectList;
}
}