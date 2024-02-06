package ec.edu.espe.country.view;

import ec.edu.espe.country.model.Country;
import ec.edu.espe.country.util.ConectionMongoDB;

import java.util.Scanner;

/**
 * 
 * @author Luis Sagnay
 */
public class Dpex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add Country");
            System.out.println("2. Edit Country");
            System.out.println("3. Delete Country");
            System.out.println("4. List Countries");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    Country country = getCountryDetails();
                    ConectionMongoDB.registerCountry(country);
                    System.out.println("Country registed successfully!");
                    break;
                case 2:
                    Country editedCountry = getCountryDetails();
                    ConectionMongoDB.editCountry(editedCountry);
                    System.out.println("Country edited successfully!");
                    break;
                case 3:
                    System.out.println("Enter the name of the Country to delete:");
                    String countryNameToDelete = scanner.next();
                    ConectionMongoDB.deleteCountry(countryNameToDelete);
                    System.out.println("Country deleted successfully!");
                    break;
                case 4:
                    ConectionMongoDB.listCountries().forEach(System.out::println);
                    break;
                case 5:
                    System.out.println("Exiting DPEX System. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
    }

    private static Country getCountryDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Country Name");
        String name = scanner.nextLine();

        System.out.println("Ecuadorian Population");
        int ecuadorianPopulation = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Consular Office");
        String consularOffice = scanner.nextLine();

        return new Country(name, ecuadorianPopulation, consularOffice);
    }
}