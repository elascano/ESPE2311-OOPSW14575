package ec.edu.espe.child.view;

import com.google.gson.Gson;
import ec.edu.espe.child.model.Child;
import ec.edu.espe.child.model.Schools;
import java.util.List;

public class RegistrationChildSystem {
    public static void main(String[] args) {
        
        Gson gson = new Gson();
        String jsonString = "{\"id\": 1, \"name\": \"Edison\", \"schools\": [ { \"id\": 1, \"name\": \"Montufar\" }, { \"id\": 2, \"name\": \"JEMoreno\" } ], \"isStuding\": true }";

        System.out.println("Json : " + jsonString);

        Child child = gson.fromJson(jsonString, Child.class);

        System.out.println("\nChild ----> " + child);

        
        List<Schools> schoolsList = child.getSchools();
        
        
    }
}