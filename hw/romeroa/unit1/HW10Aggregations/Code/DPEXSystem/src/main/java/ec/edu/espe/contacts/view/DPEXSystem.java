package ec.edu.espe.contacts.view;

import java.util.ArrayList;
import java.util.Random;

import ec.edu.espe.contacts.model.Package;
import ec.edu.espe.contacts.model.User;

/**
 * @author Andrés Romero - DCCO - ESPE
 */

public class DPEXSystem {
    public static void main(String[] args) {
        // Exercise 1
        User[] users = new User[4]; 

        users[0] = new User(1, "sheylal", "@V7t$BRC*f", true, "Sheyla", "Lamar");
        users[1] = new User(2, "pablom", "K*dKGHp9$h", true, "Pablo", "Méndez");
        users[2] = new User(3, "carlas", "J#9ks%9iHD", false, "Carla", "Sarango");
        users[3] = new User(1, "rault", "ij26R7@ZjA", false, "Raúl", "Triviño");

        System.out.println("Exercise 1 - Fixed size array:");
        for (User user : users) {
            System.out.println("-> " + user);
        }

        // Exercise 2
        ArrayList<Package> packages = new ArrayList<>();
        final Random rand = new Random();
        final int nPackages = 5;
        final String[] countries = new String[3];
        countries[0] = "Peru";
        countries[1] = "United States";
        countries[2] = "Canada";
        final String[] statuses = new String[2];
        statuses[0] = "Pending";
        statuses[1] = "Arrived";

        for (int i = 0; i < nPackages; i++) {
            final String randomCountry = countries[rand.nextInt(countries.length)];
            final String randomStatus = statuses[rand.nextInt(statuses.length)];
            packages.add(new Package(i, randomCountry, randomStatus));
        }

        System.out.println("Exercise 2 - Dynamic size list:");
        for (Package packageElement : packages) {
            System.out.println("-> " + packageElement);
        }
    }
}
