package ec.edu.espe.chickenfarm.model;

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

    List<Chicken> chickens = new ArrayList<>();

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

    public static int getLastId(String path) {
        int lastId = 0;
        try (BufferedReader _buffer = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = _buffer.readLine()) != null) {
                String[] data = line.split(",");
                lastId = Integer.parseInt(data[0]);
            }
        } catch (IOException e) {
            System.err.println("[-] Something went wrong: " + e.getMessage());
        }
        return (lastId + 1);
    }

    public static void saveCSVFile(Chicken chiken, String path) {
        try (FileWriter writer = new FileWriter(path, true)) {
            writer.write(chiken.CSVObjectFormat());
            System.out.println("[+]Data Saved Succesfully.");
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
        Chicken chicken = gson.fromJson(file, Chicken.class);
                System.out.println(chicken);

    }
    
        public static List<Chicken> readChickenList(String path) {
        List<Chicken> listaPersonas = new ArrayList<>();

        try (Reader reader = new FileReader(path)) {
            Type listType = new TypeToken<ArrayList<Chicken>>(){}.getType();
            listaPersonas = new Gson().fromJson(reader, listType);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaPersonas;
    }

    public static Chicken updateJSONInfo(String path) {
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
        return gson.fromJson(file, Chicken.class);
    }

    public static void saveJSONFile(ArrayList<Chicken> chikens, String path) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(path)) {
            writer.write(gson.toJson(chikens));
            System.out.println("[+]Data Saved Succesfully.");
        } catch (IOException e) {
            System.err.println("[-] Something went wrong: " + e.getMessage());
        }
    }
    
    

}
