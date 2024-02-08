package ec.edu.espe.question33.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import ec.edu.espe.question33.model.SoccerPlayer;

/**
 *
 * @author mateo
 */
public class FileHandler <T>{
        public void saveJSONFile(List<T> templateList, String path) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(path)) {
            writer.write(gson.toJson(templateList));
            System.out.println("[+]Data Saved Succesfully.");
        } catch (IOException e) {
            System.err.println("[-] Something went wrong: " + e.getMessage());
        }
    }
        
    public ArrayList<T> readJSONListSoccerPlayer(String path) {
        ArrayList<T> objectList = new ArrayList<>();

        try (Reader reader = new FileReader(path)) {
            Type listType = new TypeToken<ArrayList<SoccerPlayer>>() {}.getType();
            objectList = new Gson().fromJson(reader, listType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return objectList;
    }

    public void saveCSVFile(T adapter, String path) {
        try (FileWriter writer = new FileWriter(path, true)) {
            writer.write(adapter.toString());
            System.out.println("[+]Data Saved Succesfully.");
        } catch (IOException e) {
            System.err.println("[-] Something went wrong: " + e.getMessage());
        }
    }

}
