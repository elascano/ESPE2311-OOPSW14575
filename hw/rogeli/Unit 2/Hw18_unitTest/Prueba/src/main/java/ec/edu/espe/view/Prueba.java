package ec.edu.espe.view;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        try (MongoClient mongoClient = MongoClients.create("mongodb+srv://Ilhan_R:Programacion123@cluster0.lb7qwrn.mongodb.net/")) {
            MongoDatabase myDataBase = mongoClient.getDatabase("DPEXSystem");
            MongoCollection<Document> myCollection = myDataBase.getCollection("Packages");
            Scanner scanner = new Scanner(System.in);
            int option;

            do {
                System.out.println("\n----- MONGODB Implementation -----");
                System.out.println("1. Add Package");
                System.out.println("2. Read Package");
                System.out.println("3. Update Package");
                System.out.println("4. Delete Package");
                System.out.println("0. Exit");
                System.out.print("Select an option: ");
                option = scanner.nextInt();

                switch (option) {
                    case 1:
                        addPackage(myCollection);
                        break;
                    case 2:
                        readPackage(myCollection);
                        break;
                    case 3:
                        updatePackage(myCollection);
                        break;
                    case 4:
                        deletePackage(myCollection);
                        break;
                    case 0:
                        System.out.println("Exiting the program. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid option. Please select a valid option.");
                        break;
                }

            } while (option != 0);
        }
    }

    private static void addPackage(MongoCollection<Document> collection) {
        Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the ID:");
    int id = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Enter the last name:");
    String lastName = scanner.nextLine();

    System.out.println("Enter the first name:");
    String firstName = scanner.nextLine();

    System.out.println("Enter the Cellphone Number:");
    String cellphoneNumber = scanner.nextLine();

    System.out.println("Enter the Contact:");
    String contact = scanner.nextLine();

    Date birthDate = new Date();
    
    System.out.println("Enter a hobby:");
    String hobby = scanner.nextLine();
    
    System.out.println("Enter the type:");
    String type = scanner.nextLine();

    System.out.println("Enter the gender:");
    String gender = scanner.nextLine();

    System.out.println("Enter the Comments:");
    String comments = scanner.nextLine();

     
    System.out.println("Enter the years of friendship:");
    int yearsOfFriendship = scanner.nextInt();
    scanner.nextLine();

    

    Document document = new Document("id", id)
            .append("lastName", lastName)
            .append("firstName", firstName)
            .append("cellphoneNumber", cellphoneNumber)
            .append("contact", contact)
            .append("type", type)
            .append("birthDate", birthDate)
            .append("hobbies", Arrays.asList(hobby))
            .append("gender", gender)
            .append("comments", comments)
            .append("yearsOfFriendship", yearsOfFriendship);
            

    collection.insertOne(document);
    System.out.println("Data added successfully.");
}

    private static void readPackage(MongoCollection<Document> collection) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Package Id you want to read:");
        int packageId = scanner.nextInt();

        Document searchDocument = new Document("packageId", packageId);

        Document foundDocument = collection.find(searchDocument).first();

        if (foundDocument != null) {
            System.out.println("The package you are looking for is:");
            System.out.println(foundDocument.toJson());
        } else {
            System.out.println("No package found with the specified Package Id.");
        }
    }

    private static void updatePackage(MongoCollection<Document> collection) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Package Id of the package you want to update:");
        int packageId = scanner.nextInt();

        Document filter = new Document("packageId", packageId);

        Document foundPackage = collection.find(filter).first();

        if (foundPackage != null) {
            System.out.println("Current package information:");
            System.out.println(foundPackage.toJson());

            System.out.println("Enter the new country name:");
            String newCountryName = scanner.next();

            System.out.println("Enter the new Ecuadorian population:");
            int newEcuadorianPopulation = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter the new consular office name:");
            String newOfficeName = scanner.nextLine();

            System.out.println("Enter the new consular office address:");
            String newAddress = scanner.nextLine();

            Document updatedDocument = new Document("country.name", newCountryName)
                    .append("country.ecuadorianPopulation", newEcuadorianPopulation)
                    .append("country.consularOffice.officeName", newOfficeName)
                    .append("country.consularOffice.address", newAddress);

            collection.updateOne(filter, new Document("$set", updatedDocument));

            System.out.println("Package updated successfully.");
        } else {
            System.out.println("No package found with the specified Package Id.");
        }
    }

    private static void deletePackage(MongoCollection<Document> collection) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Package Id of the package you want to delete:");
        int packageId = scanner.nextInt();

        Document filter = new Document("packageId", packageId);

        Document foundPackage = collection.find(filter).first();

        if (foundPackage != null) {
            System.out.println("Package information to delete:");
            System.out.println(foundPackage.toJson());

            System.out.println("Are you sure you want to delete this package? (Y/N)");
            String confirmation = scanner.next().toUpperCase();

            if (confirmation.equals("Y")) {
                collection.deleteOne(filter);
                System.out.println("Package deleted successfully.");
            } else {
                System.out.println("Deletion operation canceled.");
            }
        } else {
            System.out.println("No package found with the specified Package Id.");
        }
    }
}