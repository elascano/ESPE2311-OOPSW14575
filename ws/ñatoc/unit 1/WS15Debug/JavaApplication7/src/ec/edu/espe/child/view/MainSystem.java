package ec.edu.espe.child.view;


import com.google.gson.Gson;
import ec.edu.espe.child.model.Child;

/**
 *
 * @author Carlos Ñato, The Javas, DCC-ESPE
 */
public class MainSystem {


    public static void main(String[] args) {
      Gson gson = new Gson();
      
      String childJson = "{ \"id\": 1, \"name\": \"Edison\", \"schools\": [ { \"id\": 1, \"name\": \"Montufar\" }, { \"id\": 12, name\": \"JEMoreno\" } ], \"isStuding\": true }";
      Child childObject = gson.fromJson(childJson, Child.class);
      System.out.println("Child object---->" + childObject);     
              

    }
    
}
