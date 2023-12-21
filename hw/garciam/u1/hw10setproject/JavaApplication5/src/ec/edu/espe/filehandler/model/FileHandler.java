
package ec.edu.espe.filehandler.model;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mateo
 */
public class FileHandler {

    List<Object> chickens = new ArrayList<>();

    public static void printCSVFile(String path) {
        try (BufferedReader _buffer = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = _buffer.readLine()) != null) {
                String[] data = line.split(",");
                System.out.println("| id: " + data[0] + " |name: " + data[1] + " |color: " + data[2] + " |age: " + data[3] + " |isMolting: " + data[4] + " |bornOnDate: " + data[5] + "|");
            }
        } catch (IOException e) {
            System.err.println("[-] Something went wrong: " + e.getMessage());
        }
    }



    public static void readJSONFile(String path) {
        String file = "";

        try (BufferedReader _buffer = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = _buffer.readLine()) != null) {
                file += line;
            }
            _buffer.close();
        } catch (IOException e) {
            System.err.println("[-] Something went wrong: " + e.getMessage());
        }
        System.out.println(file);
        Gson gson = new Gson();
        Object objectElement = gson.fromJson(file, Object.class);
                System.out.println(objectElement);

    }
    
        public static List<Object> readList(String path) {
        List<Object> listaPersonas = new ArrayList<>();

        try (Reader reader = new FileReader(path)) {
            Type listType = new TypeToken<ArrayList<Object>>(){}.getType();
            listaPersonas = new Gson().fromJson(reader, listType);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaPersonas;
    }

    public static Object updateJSONInfo(String path) {
        String file = "";

        try (BufferedReader _buffer = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = _buffer.readLine()) != null) {
                file += line;
            }
            _buffer.close();
        } catch (IOException e) {
            System.err.println("[-] Something went wrong: " + e.getMessage());
        }
        System.out.println(file);
        Gson gson = new Gson();
        return gson.fromJson(file, Object.class);
    }

    public static void saveJSONFile(ArrayList<Object> objectArray, String path) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(path)) {
            writer.write(gson.toJson(objectArray));
            System.out.println("[+]Data Saved Succesfully.");
        } catch (IOException e) {
            System.err.println("[-] Something went wrong: " + e.getMessage());
        }
    }
    
    

}

