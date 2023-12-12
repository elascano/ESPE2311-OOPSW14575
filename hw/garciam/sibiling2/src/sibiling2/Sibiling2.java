package sibiling2;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mateo
 */
public class Sibiling2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gson gson = new Gson();
        
        Sibling[] sibilings = new Sibling[3];
        
        sibilings[0] = new Sibling("1728912070", "emi@exd.com", "Emily", "Monjas");
        sibilings[1] = new Sibling("1002173662", "mateo@exd.com", "Mateo", "Quitumbe");
        sibilings[2] = new Sibling("1709975674", "diego@exd.com", "Diego", "Sangolqui");

        String json1 = gson.toJson(sibilings);

        System.out.println(json1);
    }

}
