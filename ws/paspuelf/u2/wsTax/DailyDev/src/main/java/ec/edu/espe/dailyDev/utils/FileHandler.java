package ec.edu.espe.dailyDev.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Team Number: 4 - CodingNinjas  
 */

public class FileHandler {

    public static <T> ArrayList<T> readFile(String fileAdress, Type type) {

        File theFile = new File(fileAdress);
        ArrayList<T> objectList = new ArrayList<>();

        if (theFile.exists()) {

            try (FileReader fileReader = new FileReader(fileAdress)) {
                Gson gson = new GsonBuilder().setPrettyPrinting().create();

                objectList = gson.fromJson(fileReader, type);
            } catch (FileNotFoundException e) {
                System.err.println("Error in creating the File Reader Object");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } else {
            writeFile(fileAdress, objectList);
        }
        return objectList;
    }

    public static <T> void writeFile(String fileAdress, ArrayList<T> objectList) {

        try (FileWriter fileWriter = new FileWriter(fileAdress)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(objectList, fileWriter);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
