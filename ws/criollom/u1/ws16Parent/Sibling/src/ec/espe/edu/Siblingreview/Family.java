
package ec.espe.edu.Siblingreview;

import ec.espe.edu.Siblingmodell.Sibling;
import java.util.ArrayList;
import com.google.gson.Gson;
import ec.espe.edu.Siblingmodell.Parent;

/**
 *
 * @author MateoCriollo
 */
public class Family {
    public static void main(String[] args) {
        ArrayList <Sibling> siblings=new ArrayList<>();
        
        Sibling sibling1 = new Sibling("Marcos", 25,"Criollo","Sangolqui");
        Sibling sibling2 = new Sibling("Alan",14, "Llumiquinga","Quito");
        Sibling sibling3 = new Sibling("Marcos",46,"Oscullo","Selva Alegre");
        siblings.add(sibling1);
        siblings.add(sibling2);
        siblings.add(sibling3);
        
        Gson gson = new Gson();
        String json = gson.toJson(siblings);
        System.out.println(json);
    }
}
