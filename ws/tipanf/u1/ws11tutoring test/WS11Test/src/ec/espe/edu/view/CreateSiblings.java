package ec.espe.edu.view;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.espe.edu.model.Parent;
import ec.espe.edu.model.Sibling;
import ec.espe.edu.utils.ManageJson;

/**
 *
 * @author Frederick - DCCO ESPE
 */
public class CreateSiblings {
    public static void main(String[] args){
        
        
        Parent parent = ManageJson.readFile("parents.json");
        
        System.out.println(parent);
        

        
    }
    
}
