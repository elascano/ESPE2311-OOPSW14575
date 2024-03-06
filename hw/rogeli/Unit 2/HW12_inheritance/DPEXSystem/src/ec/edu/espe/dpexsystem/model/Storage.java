package ec.edu.espe.dpexsystem.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NullPointerException
 */
public class Storage {

    private ArrayList<Package> packages = new ArrayList<>();
    
    
    public void addPackage(Package packages){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the package ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the package status: ");
        String status = scanner.nextLine();
        System.out.print("Enter the weight of the package: ");
        float weight = scanner.nextFloat();
    }
    
    public void removePackage(Package packages){
        
    }
    
    public Package[] getPackage(){
        
        return null;
        
    }
}
