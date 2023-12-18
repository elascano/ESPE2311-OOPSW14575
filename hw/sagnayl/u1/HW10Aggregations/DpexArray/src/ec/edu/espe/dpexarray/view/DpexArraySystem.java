package ec.edu.espe.dpexarray.view;

import ec.edu.espe.dpexarray.model.PackageType;
import ec.edu.espe.dpexarray.model.Package;


/**
 *
 * @author Luis Sagnay
 */
public class DpexArraySystem {
    public static void main(String[] args) {
        PackageType packageTypes[] = new PackageType[3];
        Package packages;
        
        packageTypes[0] = new PackageType(1,"Mixto");
        packageTypes[1] = new PackageType(2,"Cne");
        packageTypes[2] = new PackageType(3,"Gender");
        
        packages = new Package(1,"Spain", "Barcelona", packageTypes);
        
        System.out.println("Package --> " +packages);
    }
    
}
