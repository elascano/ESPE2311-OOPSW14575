package ec.edu.espe.foodandrollorder.model;

import com.google.gson.Gson;
import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import org.bson.Document;

public class Menu {

    private ArrayList<Plate> plateListTallarin;
    private ArrayList<Plate> plateListMariscos;


    @Override
    public String toString() {
        return "Menu{"
                + "Tallarin=" + plateListTallarin
                + "Mariscos=" + plateListMariscos
                + '}';
    }

    public Menu(ArrayList<Plate> plateListTallarin, ArrayList<Plate> plateListMariscos) {
        this.plateListTallarin = plateListTallarin;
        this.plateListMariscos = plateListMariscos;
    }

    public Menu() {
        this.plateListTallarin = new ArrayList<>();
        this.plateListMariscos = new ArrayList<>();
    }

    public void setMenuFromJson(String fileName) {
        Menu menu = readMenuFromJson(fileName);
        if (menu != null) {
            this.plateListTallarin = menu.getPlateListTallarin();
            this.plateListMariscos = menu.getPlateListMariscos();
        } else {
            System.out.println("Error reading JSON file or no content found.");
        }
    }

    public void displayFullMenu() {
        System.out.println("======== Menu of Tallarines ========");
        System.out.println("ID\tName\t\tDescription\t\tPrice\t\tAvailability\t\tPreparation Time");
        displayMenu(plateListTallarin);

        System.out.println("\n======== Menu of Mariscos ========");
        System.out.println("ID\tName\t\tDescription\t\tPrice\t\tAvailability\t\tPreparation Time");
        displayMenu(plateListMariscos);
    }

    private void displayHeader() {
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.printf("| %-3s | %-20s | %-40s | %-10s | %-15s | %-20s |\n",
                "ID", "Name", "Description", "Price", "Availability", "Preparation Time");
        System.out.println("---------------------------------------------------------------------------------------------");
    }

    private void displayMenu(ArrayList<Plate> plateList) {
        for (Plate plate : plateList) {
            System.out.printf("| %-3d | %-20s | %-40s | %-10.2f | %-15s | %-20s |\n",
                    plate.getId(), plate.getName(), plate.getDescription(), plate.getPrice(),
                    plate.getAvailability(), plate.getPreparationTime());
        }
        System.out.println("---------------------------------------------------------------------------------------------");
    }

    public void addPlateToListTallarin(Plate plate) {
        this.plateListTallarin.add(plate);
    }

    public void addPlateToListMariscos(Plate plate) {
        this.plateListMariscos.add(plate);
    }

    public Plate getPlateById(int plateId) {
        for (Plate plate : plateListTallarin) {
            if (plate.getId() == plateId) {
                return plate;
            }
        }

        for (Plate plate : plateListMariscos) {
            if (plate.getId() == plateId) {
                return plate;
            }
        }

        return null;
    }

    public boolean isEmpty() {
        return plateListTallarin.isEmpty() && plateListMariscos.isEmpty();
    }

    public Plate removePlateById(int plateId) {
        Plate removedPlate = removePlateFromList(plateId, plateListTallarin);
        if (removedPlate == null) {
            removedPlate = removePlateFromList(plateId, plateListMariscos);
        }
        return removedPlate;
    }

    private Plate removePlateFromList(int plateId, ArrayList<Plate> plateList) {
        Plate removedPlate = null;
        for (Plate plate : plateList) {
            if (plate.getId() == plateId) {
                removedPlate = plate;
                plateList.remove(plate);
                break;
            }
        }
        return removedPlate;
    }

    public void saveMenuAsJson(String fileName) {
        Gson gson = new Gson();
        String jsonMenu = gson.toJson(this);

        try (FileWriter fileWrite = new FileWriter(fileName)) {
            fileWrite.write(jsonMenu);
        } catch (IOException e) {
            System.out.println("Error saving the Json file " + e.getMessage());
        }

    }

    public Menu readMenuFromJson(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            StringBuilder jsonData = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                jsonData.append(line);
            }

            Gson gson = new Gson();
            return gson.fromJson(jsonData.toString(), Menu.class);
        } catch (IOException e) {
            System.out.println("Error reading the Json file : " + e.getMessage());
            return null;
        }
    }

    public void createDishMongoDB() {
        Scanner scanner = new Scanner(System.in);
        String connectionString = "mongodb+srv://rony558:Diego_558@cluster0.8o2u5up.mongodb.net/";

        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            // Obtén la base de datos
            MongoDatabase database = mongoClient.getDatabase("FoodAndRollSystemDB");

            // Realiza operaciones en la base de datos
            MongoCollection<Document> dishesCollection = database.getCollection("Dishes");

            System.out.println("Enter id of plate: ");
            String id = scanner.nextLine();
            System.out.println("Enter the name of dish:");
            String name = scanner.nextLine();
            System.out.println("Enter the description of dish: ");
            String description = scanner.nextLine();
            System.out.println("Enter the availability (Yes or No");
            String availability = scanner.nextLine();
            System.out.println("Enter the preparation Time: ");
            String preparationTime = scanner.nextLine();
            System.out.println("Enter the price of dish: ");
            double price = scanner.nextDouble();

            Document newDish = new Document()
                    .append("id", id)
                    .append("name", name)
                    .append("description", description)
                    .append("price", price)
                    .append("availability", availability)
                    .append("preparationTime", preparationTime);

            dishesCollection.insertOne(newDish);
            System.out.println("Plato creado correctamente");
        }
    }

    public void deleteDishMongoDB() {
        Scanner scanner = new Scanner(System.in);
        String connectionString = "mongodb+srv://rony558:Diego_558@cluster0.8o2u5up.mongodb.net/";

        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            // Obtén la base de datos
            MongoDatabase database = mongoClient.getDatabase("FoodAndRollSystemDB");

            // Realiza operaciones en la base de datos
            MongoCollection<Document> dishesCollection = database.getCollection("Dishes");

            System.out.println("Enter the id of dish you want deleate: ");
            String dishId = scanner.nextLine();

            dishesCollection.deleteOne(
                    Filters.eq("id", dishId)
            );

            System.out.println("Plato eliminado correctamente.");
        }
    }

    public void updateDishMongoDB() {
        Scanner scanner = new Scanner(System.in);
        String connectionString = "mongodb+srv://rony558:Diego_558@cluster0.8o2u5up.mongodb.net/";

        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            // Obtén la base de datos
            MongoDatabase database = mongoClient.getDatabase("FoodAndRollSystemDB");

            // Realiza operaciones en la base de datos
            MongoCollection<Document> dishesCollection = database.getCollection("Dishes");

            System.out.println("Ingrese el id of dish you want to update: ");
            String dishId = scanner.nextLine();
            System.out.println("Enter the new price of dish");
            double newPrice = scanner.nextDouble();

            dishesCollection.updateOne(
                    Filters.eq("id", dishId),
                    Updates.set("price", newPrice)
            );

            System.out.println("Plato actualizado correctamente.");
        }
    }

    public void readMongoDBDataBaseAndDisplayTable() {
        String connectionString = "mongodb+srv://rony558:Diego_558@cluster0.8o2u5up.mongodb.net/";

        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            // Obtén la base de datos
            MongoDatabase database = mongoClient.getDatabase("FoodAndRollSystemDB");

            // Realiza operaciones en la base de datos
            MongoCollection<Document> dishesCollection = database.getCollection("Dishes");

            displayHeader();
            FindIterable<Document> result = dishesCollection.find();
            MongoCursor<Document> cursor = result.iterator();
            while (cursor.hasNext()) {
                Document dish = cursor.next();
                displayDishInTable(dish);
            }

        }
    }

    private void displayDishInTable(Document dish) {
        System.out.printf("| %-3s | %-20s | %-40s | %-10.2f | %-15s | %-20s |\n",
                dish.get("id"), dish.get("name"), dish.get("description"), dish.get("price"), dish.get("availability"), dish.get("preparationTime"));
    }

    public ArrayList<Plate> getPlateListTallarin() {
        return plateListTallarin;
    }

    public void setPlateListTallarin(ArrayList<Plate> plateListTallarin) {
        this.plateListTallarin = plateListTallarin;
    }

    public ArrayList<Plate> getPlateListMariscos() {
        return plateListMariscos;
    }

    public void setPlateListMariscos(ArrayList<Plate> plateListMariscos) {
        this.plateListMariscos = plateListMariscos;
    }

}
