<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
=======

>>>>>>> 7ad623e1c914bfdcb885f888488936540dbfba3f
package ec.edu.espe.chickenfarm.utils;

/**
 *
 * @author mateo
 */
<<<<<<< HEAD

=======
>>>>>>> 7ad623e1c914bfdcb885f888488936540dbfba3f
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.chickenfarm.model.Chicken;
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
<<<<<<< HEAD
public class FileHandler {

    List<Chicken> chickens = new ArrayList<>();
=======
public class FileHandler<objectAdapater> {

    List<objectAdapater> chickens = new ArrayList<>();
>>>>>>> 7ad623e1c914bfdcb885f888488936540dbfba3f

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

<<<<<<< HEAD
    public static void saveCSVFile(Chicken chiken, String path) {
        try (FileWriter writer = new FileWriter(path, true)) {
            writer.write(chiken.CSVObjectFormat());
=======
    public void saveCSVFile(objectAdapater object0, String path) {
        try (FileWriter writer = new FileWriter(path, true)) {
            writer.write(object0.toString());
>>>>>>> 7ad623e1c914bfdcb885f888488936540dbfba3f
            System.out.println("[+]Data Saved Succesfully.");
        } catch (IOException e) {
            System.err.println("[-] Something went wrong: " + e.getMessage());
        }
    }

<<<<<<< HEAD
    public static void readJSONFile(String path) {
=======
    public void readJSONFile(String path) {
>>>>>>> 7ad623e1c914bfdcb885f888488936540dbfba3f
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
<<<<<<< HEAD
        Gson gson = new Gson();
        Chicken chicken = gson.fromJson(file, Chicken.class);
                System.out.println(chicken);

    }
    
        public static List<Chicken> readChickenList(String path) {
        List<Chicken> listaPersonas = new ArrayList<>();

        try (Reader reader = new FileReader(path)) {
            Type listType = new TypeToken<ArrayList<Chicken>>(){}.getType();
=======
                Type listType = new TypeToken<ArrayList<objectAdapater>>() {}.getType();        
        objectAdapater chicken = new Gson().fromJson(file, listType);
        System.out.println(chicken);

    }

    public List<objectAdapater> readChickenList(String path) {
        List<objectAdapater> listaPersonas = new ArrayList<>();

        try (Reader reader = new FileReader(path)) {
            Type listType = new TypeToken<ArrayList<objectAdapater>>() {
            }.getType();
>>>>>>> 7ad623e1c914bfdcb885f888488936540dbfba3f
            listaPersonas = new Gson().fromJson(reader, listType);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaPersonas;
    }

<<<<<<< HEAD
    public static Chicken updateJSONInfo(String path) {
=======
    public objectAdapater updateJSONInfo(String path) {
>>>>>>> 7ad623e1c914bfdcb885f888488936540dbfba3f
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
<<<<<<< HEAD
        return gson.fromJson(file, Chicken.class);
    }

    public static void saveJSONFile(ArrayList<Chicken> chikens, String path) {
=======
        Type listType = new TypeToken<ArrayList<objectAdapater>>() {}.getType();

        return gson.fromJson(file, listType);
    }

    public void saveJSONFile(ArrayList<objectAdapater> chikens, String path) {
>>>>>>> 7ad623e1c914bfdcb885f888488936540dbfba3f
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(path)) {
            writer.write(gson.toJson(chikens));
            System.out.println("[+]Data Saved Succesfully.");
        } catch (IOException e) {
            System.err.println("[-] Something went wrong: " + e.getMessage());
        }
    }
<<<<<<< HEAD
    
    

}

=======

}



>>>>>>> 7ad623e1c914bfdcb885f888488936540dbfba3f
