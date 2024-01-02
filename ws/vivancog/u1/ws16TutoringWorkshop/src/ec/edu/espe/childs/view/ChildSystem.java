package ec.edu.espe.childs.view;

import com.google.gson.Gson;
import ec.edu.espe.childs.model.Child;

/**
 *
 * @author Gabriel Vivanco
 */
public class ChildSystem {
    private static final Gson gson = new Gson();
    
    public static void main(String[] args){
        String childJSON = "{\"id\":1,\"name\":\"Edison\",\"schools\":[{\"School\":{\"id\":1,\"name\":\"Montufar\"}},{\"School\":{\"id\":2,\"name\":\"JEMoreno\"}}],\"isStuding\":true}";
        Child child = gson.fromJson(childJSON, Child.class);
        System.out.println("object---> " + child.toString() + "");
    }
}
