package ec.edu.espe.chickenFarm.utilities;
import ec.edu.espe.chickenfFarm.model.Chicken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.time.LocalDate;

/**
 *
 * @author Antonio Revilla
 */

public class FilesJson {

    private static final String JSON_FILE_PATH = "chickens.json";

public static void saveChickensToJSON(ArrayList<Chicken> chickenList) {
    try (Writer writer = new FileWriter(JSON_FILE_PATH)) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
                .create();

        String json = gson.toJson(chickenList);

        json = json.replaceAll("[\\r\\n\\t ]", "");

        writer.write(json);
        System.out.println("Chickens saved to JSON successfully.");
    } catch (IOException e) {
        System.err.println("Error while saving chickens to JSON: " + e.getMessage());
    }
}


    public static ArrayList<Chicken> loadChickensFromJSON() {
        ArrayList<Chicken> loadedChickens = new ArrayList<>();

        try (Reader reader = new FileReader(JSON_FILE_PATH)) {
            if (reader.ready()) {
                Gson gson = new Gson();
                Type chickenListType = new TypeToken<ArrayList<Chicken>>(){}.getType();
                loadedChickens = gson.fromJson(reader, chickenListType);
                System.out.println("Chickens loaded from JSON successfully.");
            } else {
                System.out.println("Error: The JSON file is empty.");
            }
        } catch (IOException e) {
            System.err.println("Error while loading chickens from JSON: " + e.getMessage());
        }

        return loadedChickens;
    }
}
