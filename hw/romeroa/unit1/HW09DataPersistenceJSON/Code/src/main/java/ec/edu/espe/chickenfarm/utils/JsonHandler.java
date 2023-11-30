package ec.edu.espe.chickenfarm.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;

public class JsonHandler {

    private static Gson gson = new Gson();

    // Method to read JSON from a file and convert it into a Java object
    public static <T> T readFromJson(String filePath, Type typeOfT) throws IOException {
        try (FileReader reader = new FileReader(filePath)) {
            return gson.fromJson(reader, typeOfT);
        }
    }

    // Method to write a Java object to a file in JSON format
    public static <T> void writeToJson(String filePath, T object) throws IOException {
        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(object, writer);
        }
    }
}
