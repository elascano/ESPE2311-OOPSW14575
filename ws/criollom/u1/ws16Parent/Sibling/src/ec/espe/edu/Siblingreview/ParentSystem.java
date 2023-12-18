package ec.espe.edu.Siblingreview;

import com.google.gson.Gson;
import ec.espe.edu.Siblingmodell.Parent;

public class ParentSystem {
    public static void main(String[] args) {
        String jsonString = "{\"id\":3,\"name\":\"Edison\",\"parents\":[{\"id\":1,\"name\":\"\"}, {\"id\":2,\"name\":\"Isabel\"}],\"isStudying\":false}";
        Gson gson = new Gson();
        Parent parent = gson.fromJson(jsonString, Parent.class);
        System.out.println(parent.toString());
    }
}
