package ec.edu.espe.parent.view;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.parent.model.Sibling;


/**
 *
 * @author Stefany Díaz, HoneyBadgers, DCCO - ESPE
 */
public class SiblingSystem {
    public static void main(String[] args) {
        
    Sibling[] siblings = new Sibling[3];
    
    siblings[0] = new Sibling(1, "Alisson", 20, "Female", "alisson@gmail.com");
    siblings[1] = new Sibling(2, "Maykel", 14, "Male", "maykel@gmail.com");
    siblings[2] = new Sibling(3, "Francis", 6, "Male", "francis@gmail.com");
    
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    String json = gson.toJson(siblings);
    System.out.println(json);
    


 } 
}
