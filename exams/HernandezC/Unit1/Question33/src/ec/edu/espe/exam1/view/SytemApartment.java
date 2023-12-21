package ec.edu.espe.exam1.view;

import ec.edu.espe.exam1.model.Apartment;
import ec.edu.espe.exam1.utils.UseJson;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carlos Hernandez
 */
public class SytemApartment {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        UseJson file = new UseJson();
        ArrayList<Apartment> apartments = file.readFile("Apartmentsdata.json");
        do {
            System.out.println("Apartments ");
            System.out.println("1.- Add an apartment");
            System.out.println("2.- Show all the apartments");
            System.out.println("3.- Show how many apartments exists ");
            System.out.println("4. Exit");
            option = scan.nextInt();
            scan.nextLine();
            switch (option) {
                case 1:
                    apartments.add(Apartment.addApartment());
                    file.writeFile("Apartmentsdata.json", apartments);
                    break;
                case 2:
                    System.out.println(apartments);
                    break;
                case 3:
                    int numberOfApartments=0;
                    for(Apartment currentApartment:apartments){
                        numberOfApartments+=1;
                    }
                    System.out.println("Number Of Aprtments: "+numberOfApartments);
                    System.out.println("Number of Apartments: "+apartments.size());
                    break;
                case 4:
                    break;
            }
        } while (option != 4);

    }

}
