package ec.edu.espe.homework10;
import ec.edu.espe.homework.model.Country;
import ec.edu.espe.homework.model.ConsularOffice;
import ec.edu.espe.homework.model.Constituency;
import java.util.ArrayList;
/**
 *
 * @author Ilhan Rogel
 */
public class Homework10 {

    //PArt 2, with arraylist
    
    public static void main(String[] args) {

        String name = "Constituency Of Spain";
        
       // ConsularOffice consularOffices[] = new ConsularOffice[2];   When using arrays
        ArrayList<ConsularOffice> consularOffices = new ArrayList<>();
        Country country= new Country("Spain", 3500);

       // consularOffices[0]= new ConsularOffice("ConsulateSp1", "Calle Ejemplo, Avenida ficticia"); array
        //consularOffices[1]= new ConsularOffice("ConsulateSp2", "Example Street, Fictional Avenue"); array
        consularOffices.add(new ConsularOffice("ConsulateSp1", "Calle Ejemplo, Avenida ficticia"));
        consularOffices.add(new ConsularOffice("ConsulateSp2", "Example Street, Fictional Avenue"));
        Constituency constituency = new Constituency(name, country, consularOffices);
        System.out.println(constituency);

    }
}
