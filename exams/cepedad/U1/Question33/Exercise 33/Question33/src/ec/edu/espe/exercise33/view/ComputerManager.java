package ec.edu.espe.exercise33.view;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.exercise33.model.Computer;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 *
 * @author David
 */
public class ComputerManager {

    private static final String JSON_FILE_PATH = "computers.json";

    public static void main(String[] args) {
        ArrayList<Computer> computers = new ArrayList<>();
        computers.add(new Computer(1, "HP", "Black"));
        computers.add(new Computer(2, "MAC", "White"));
        computers.add(new Computer(3, "DELL", "Black"));
        computers.add(new Computer(4, "HP", "Black"));
        computers.add(new Computer(5, "Lenovo", "Black"));

        saveToJson(computers);

        int totalObjects = countObjects();
        System.out.println("Total number of computers: " + totalObjects);
    }

    private static void saveToJson(ArrayList<Computer> computers) {
        try (Writer writer = new FileWriter(JSON_FILE_PATH)) {
            Gson gson = new Gson();
            gson.toJson(computers, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int countObjects() {
        try (Reader reader = new FileReader(JSON_FILE_PATH)) {
            Gson gson = new Gson();

            Type listType = new TypeToken<ArrayList<Computer>>() {
            }.getType();
            ArrayList<Computer> computers = gson.fromJson(reader, listType);

            return computers.size();
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
