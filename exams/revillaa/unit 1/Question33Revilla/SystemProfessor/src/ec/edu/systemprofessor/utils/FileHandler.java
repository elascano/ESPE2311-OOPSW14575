package ec.edu.systemprofessor.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author revil
 */

public class FileHandler {

    public static <T> List<T> readFile(String filePath, Type type) {
        File file = new File(filePath);
        List<T> objectList = new ArrayList<>();

        if (file.exists()) {
            try (FileReader fileReader = new FileReader(filePath)) {
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                objectList = gson.fromJson(fileReader, type);
            } catch (FileNotFoundException e) {
                System.err.println("Error: File not found.");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return objectList;
    }

    public static <T> void writeFile(String filePath, List<T> objectList) {
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(objectList, fileWriter);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
}