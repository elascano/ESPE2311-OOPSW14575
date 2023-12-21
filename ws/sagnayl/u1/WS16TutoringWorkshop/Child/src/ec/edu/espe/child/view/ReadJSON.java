package ec.edu.espe.child.view;

import com.google.gson.Gson;
import ec.edu.espe.child.model.Child;

/**
 *
 * @author Luis Sagnay
 */
public class ReadJSON {
     public static void main(String[] args) {
        String jsonString = "{\"id\":1,\"name\":\"Edison\",\"schools\":[{\"id\":1,\"name\":\"Montufar\"},{\"id\":2,\"name\":\"JEMoreno\"}],\"isStuding\":true}";
        Gson gson = new Gson();
        Child child = gson.fromJson(jsonString, Child.class);
        System.out.println("Parent --> " + child.toString());
    }
}
