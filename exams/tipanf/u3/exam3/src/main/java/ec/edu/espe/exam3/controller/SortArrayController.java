
package ec.edu.espe.exam3.controller;

import ec.edu.espe.exam3.model.SortArray;
import ec.edu.espe.exam3.utils.ManageJson;
import org.bson.Document;

/**
 *
 * @author Fréderick Tipán
 */
public class SortArrayController extends DatabaseController {

    private String collectionName = "arrayFrederick";
    private Class classType = SortArray.class;
    
    public void create(SortArray sortArray) {
        this.getFromCollection(collectionName);
        
        Document doc = Document.parse(ManageJson.passObjectToJson(sortArray));
        this.coll.insertOne(doc);
    }
}
