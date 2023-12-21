package ec.edu.espe.sportsExam.model;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.List;

/**
 *
 * @author Stefany Díaz
 */
public class JsonFile<T> {
    private final String fileName;
    private final Gson gson;

    public JsonFile(String fileName) {
        this.fileName = fileName + ".json";
        this.gson = new Gson();
    }

    public void write(List<T> data) {
        try (Writer writer = new FileWriter(fileName)) {
            gson.toJson(data, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<T> read() {
        List<T> data = null;
        Type type = new TypeToken<List<T>>(){}.getType();

        try (Reader reader = new FileReader(fileName)) {
            data = gson.fromJson(reader, type);
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }

    public void deleteAllSaved() {
        try {
            new FileWriter(fileName, false).close(); 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   
    
}
