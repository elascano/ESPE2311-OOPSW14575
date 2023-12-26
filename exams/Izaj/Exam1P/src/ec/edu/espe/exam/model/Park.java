
package ec.edu.espe.exam.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Park {
    private int id;
    private String name;
    private String location;

    public Park(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    @Override
    public String toString() {
         return String.format("%-8d %-15s %-15s",
                getId(), getName(), getLocation());
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public static void addPark(ArrayList<Park> parks) {
            Scanner scan = new Scanner(System.in);
            int id = 0;
            String name = "";
            String location = "";

            System.out.println("Enter to id");
            id = scan.nextInt();
            System.out.println("Enter the name of park");
            scan.nextLine();
            name = scan.nextLine();
            System.out.println("Enter to location");
            location = scan.nextLine();

            Park newPark = new Park(id, name, location);
            parks.add(newPark);
    }
    
    public static void printNumberOfObjects(ArrayList<Park> parks) {
            System.out.println("Number of objects in the JSON: " + parks.size());
    }
        
        
    
}

