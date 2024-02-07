

package utils;

/**
 *
 * @author JosuéG
 */
public class MongoDBManager {
    public void create(String data, String collection){
        //TODO create collection
        
    }
    
    public String read(String collection){
        // TODO retunr all the collection documents
        return "data from data base";
    }
     public String files(String search,String collection){
        // TODO retunr one document accordign to the search criteria
        return "data from data base";
    }
    public boolean update(String newData, String search, String collection){
        //TODO find the document a update
        //TODO update information of the document
        return true;
    }
    public boolean delete(String search, String collection){
        return true;
        //TODO
    }
    

}
