package ec.edu.espe.parentsystem.view;

import com.google.gson.Gson;
import ec.edu.espe.parentsystem.model.Parent;

 
/**
 *
 * @author JuanGranda,Error 404,DCCO-ESPE
 */
public class ParentSystem {


    public static void main(String[] args) {
        Gson gson = new Gson();
        
        String parentsJson = "{\"id\" : 1, \"name\" : \"Edison\", \"parents\" : [{\"id\" : 1 , \"name\" : \"\"}, {\"id\" : 2, \"name\" : \"Isabel\"}], \"isStuding\" : false\r\n\r\n}"; 
        Parent parentObject = gson.fromJson(parentsJson, Parent.class);
        System.out.println("ParentObject-> " + parentObject);
        
        
    }
    
}
