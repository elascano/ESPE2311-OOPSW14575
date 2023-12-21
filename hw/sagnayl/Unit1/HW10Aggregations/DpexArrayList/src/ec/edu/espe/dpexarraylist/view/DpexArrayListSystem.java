package ec.edu.espe.dpexarraylist.view;

import ec.edu.espe.dpexarraylist.model.Shipping;
import ec.edu.espe.dpexarraylist.model.Package;
import java.util.ArrayList;

/**
 *
 * @author Luis Sagnay
 */
public class DpexArrayListSystem {
    public static void main(String[] args) {
        ArrayList<Package> packages = new ArrayList<>();
        Shipping shipping;
        
        packages.add(new Package(1, "Spain", "Barcelona"));
        packages.add(new Package(2, "Italy", "Roma"));
        
        shipping = new Shipping("15/10/2023", "11/11/2023", packages);
       
        System.out.println("Shipping --> " +shipping);
    }
}
