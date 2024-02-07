
package meetingdb.newpackage;

import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author Carlos Ñato, The Javas, DCC-ESPE
 */
public class Users {
    private String name;

    public Users(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Users{" + "name=" + name + '}';
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
        public static Users fromDocument(Document document) {
        String name = document.getString("username");
   
        return new Users(name);
        }
          public Document toDocument() {
        Document userDocument = new Document()
                .append("name", name != null ? name : "");

        return userDocument;
    }
       public static List<Users> createDummyUsers() {
        List<Users> dummyUsers = new ArrayList<>();
        dummyUsers.add(new Users("user1"));
        dummyUsers.add(new Users("user2"));
        dummyUsers.add(new Users("user3"));
        return dummyUsers;
    }    
       
       
       
        
        
    
    
}
