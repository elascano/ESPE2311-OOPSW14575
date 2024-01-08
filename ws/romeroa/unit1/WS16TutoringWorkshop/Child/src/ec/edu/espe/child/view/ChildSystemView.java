package ec.edu.espe.child.view;

import com.google.gson.Gson;
import ec.edu.espe.child.model.Child;

/**
 *
 * @author Andrés
 */
public class ChildSystemView {
    
    public static void main(String[] args) {
        String jsonString = "{\"id\":1,\"name\":\"Andrés\",\"schools\":[{\"id\":1,\"name\":\"Montufar\"},{\"id\":2,\"name\":\"JEMoreno\"}],\"isStuding\":false}";
        Gson gson = new Gson();
        Child children = gson.fromJson(jsonString, Child.class);
        System.out.println("Child --> " + children.toString());
    }
}
