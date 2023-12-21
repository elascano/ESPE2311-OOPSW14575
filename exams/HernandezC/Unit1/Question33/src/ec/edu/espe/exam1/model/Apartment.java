
package ec.edu.espe.exam1.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Apartment {
    private int id;
    private int sizeInMeters;
    private String mainStreet;

    @Override
    public String toString() {
        return "id=" + getId() + ", sizeInMeters=" + getSizeInMeters() + ", mainStreet=" + getMainStreet() + "\n";
    }

    public Apartment(int id, int sizeInMeters, String mainStreet) {
        this.id = id;
        this.sizeInMeters = sizeInMeters;
        this.mainStreet = mainStreet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSizeInMeters() {
        return sizeInMeters;
    }

    public void setSizeInMeters(int sizeInMeters) {
        this.sizeInMeters = sizeInMeters;
    }

    public String getMainStreet() {
        return mainStreet;
    }

    public void setMainStreet(String mainStreet) {
        this.mainStreet = mainStreet;
    }
    public static Apartment addApartment(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the id of the apartments");
        int id=scan.nextInt();
        scan.nextLine();
        System.out.println("Type the size in m^2 of the apartment");
        int size=scan.nextInt();
        scan.nextLine();
        System.out.println("Type the mainStreet of the apartments");
        String mainStreet=scan.nextLine();
        
        return new Apartment(id, size, mainStreet);
    }
}
