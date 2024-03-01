package ec.edu.espe.organivent.model;

import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.set;
import ec.edu.espe.organivent.utils.HandleInput;
import ec.edu.espe.organivent.utils.UseMongoDB;
import java.util.ArrayList;
import java.util.Scanner;
import org.bson.conversions.Bson;

/**
 *
 * @author Frederick Tipan, Gabriel Vivanco, Jefferson Yepez - Bit Coderz - DCCO ESPE
 */
public class Artist extends Person{
    
    public static MongoCollection<Artist> getFromDB(){
        Class classType = Artist.class;
        String collectionName = "Artist";
        
        MongoCollection<Artist> artistInDB = UseMongoDB.getFromCollection(collectionName, classType);
        
        return artistInDB;
    }
    
    
    private static void deleteInDB(int idToDelete){
        MongoCollection<Artist> artistInDB = Artist.getFromDB();
        
        Bson filter = eq("_id", idToDelete);
        artistInDB.deleteOne(filter);
    }
    
    public static void menu(){
        Scanner scanner = new Scanner(System.in, "ISO-8859-1");
        int option;
        do {
            System.out.println("---------- Artist Manager -----------");
            System.out.println("-------------------------------------");
            System.out.println("|    1.- See the current artists    |");
            System.out.println("|    2.- Add a new artist           |");
            System.out.println("|    3.- Modify an artist           |");
            System.out.println("|    4.- Delete an artist           |");
            System.out.println("|    5.- Return                     |");
            System.out.println("_____________________________________");
            System.out.println("Select an option (1-5): ");
            option = HandleInput.insertInteger();
            switch (option) {
                case 1:
                    seeArtists();
                    System.out.println("\nPress any button to return");
                    scanner.nextLine();
                    break;
                case 2:
                    addArtist();
                    System.out.println("\nDone! Press any button to return");
                    scanner.nextLine();
                    break;
                case 3:
                    modifyArtist();
                    System.out.println("\nDone! Press any button to return");
                    scanner.nextLine();
                    break;
                case 4:
                    deleteArtist();
                    System.out.println("\nDone! Press any button to return");
                    scanner.nextLine();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }while (option != 5);
    
    }
    
    private static void addArtist(){
        MongoCollection<Artist> artistInDB = Artist.getFromDB();
        
        ArrayList<Artist> artistList = new ArrayList<>();
        artistInDB.find().into(artistList);
        
        int asignId=artistList.size()+1;
        
        System.out.println("Enter the artist's name:");
        String name = HandleInput.insertRealName();
        System.out.println("Enter the artist's hiring cost:");
        float hiringCost = HandleInput.insertPrice();
        
        Artist generatedArtist = new Artist(asignId,name, hiringCost);
        
        artistInDB.insertOne(generatedArtist);
    }
    
    public static void seeArtists(){
        MongoCollection<Artist> artistInDB = Artist.getFromDB();
        ArrayList<Artist> artistList = new ArrayList<>();
        artistInDB.find().into(artistList);
        
        System.out.println("============== Artist List ==============");
        System.out.println(" ID |        Name          | Hiring Cost|");
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
         for(Artist currentArtist : artistList) {
            System.out.println(currentArtist);
        }
    }
    
    private static void deleteArtist(){        
        Artist artistToSearch = searchForArtist();
        int idToDelete = artistToSearch.getId();
        
        deleteInDB(idToDelete);
        
    }
    
    private static void modifyArtist(){
        Artist artistToChange = searchForArtist();
        int changeFromThisId = artistToChange.getId();
        
        MongoCollection<Artist> artistInDB = Artist.getFromDB();
        Bson filter = eq("_id", changeFromThisId);
        Bson updateField;
        
        int option;
        do {
            System.out.println("-------------------------------------");
            System.out.println("|  Artist id: " + artistToChange.getId());
            System.out.println("|  Artist name: " + artistToChange.getName());
            System.out.println("|  Artist hiring cost: $" + artistToChange.getWage());
            System.out.println("|    1.- Update name                |");
            System.out.println("|    2.- Update hiring cost         |");
            System.out.println("|    3.- Return                     |");
            System.out.println("-------------------------------------");
            System.out.println("Select an option (1-3): ");
            option = HandleInput.insertInteger();
            switch (option) {
                case 1:
                    System.out.println("Enter the artist's name:");
                    artistToChange.setName(HandleInput.insertRealName());
                    updateField = set("name", artistToChange.getName());
                    
                    artistInDB.updateOne(filter, updateField);
                    
                    break;
                case 2:
                    System.out.println("Enter the artist's hiring cost:");
                    artistToChange.setWage(HandleInput.insertPrice());
                    updateField = set("wage", artistToChange.getWage());
                    
                    artistInDB.updateOne(filter, updateField);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }while (option != 3);
    }
    
    public Artist(){}
    
    public static Artist searchForArtist(){
        MongoCollection<Artist> artistInDB = Artist.getFromDB();
        ArrayList<Artist> artistList = new ArrayList<>();
        artistInDB.find().into(artistList);
        
        Artist artist =null;
        String searchName;
        boolean passed=false;
        int sizeCount=0;
        
        do{
            sizeCount=0;
            System.out.println("Enter the artist's name:");
            searchName = HandleInput.insertNonBlankString().toLowerCase();
            
            for(Artist currentArtist : artistList) {
                if(currentArtist.getName().toLowerCase().contains(searchName)){
                    artist=currentArtist;
                    passed=true;
                    break;
                }
                sizeCount++;
            }
            
            if(sizeCount==artistList.size()){
                System.out.println("The artist: " + searchName + " was not found");
            }
        }while(passed==false);
        
        return artist;
    }

    @Override
    public String toString() {
        
        return String.format(" %-3s|%-20s |$ %-10.2f|",super.getId(), super.getName(), super.getWage());
    }

    public Artist(int id, String name, float wage) {
        super(id, name, wage);
    }
}
