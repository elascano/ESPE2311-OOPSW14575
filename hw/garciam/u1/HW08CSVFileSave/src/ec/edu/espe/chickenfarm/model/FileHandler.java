package ec.edu.espe.chickenfarm.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author mateo
 */
public class FileHandler {

    public static void printCSVFile(String path) {
        try (BufferedReader _buffer = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = _buffer.readLine()) != null) {
                String[] data = line.split(",");
                System.out.println("| id: " + data[0] + " |name: " + data[1]+ " |color: " + data[2]+ " |age: " + data[3]+ " |isMolting: " + data[4]+ " |bornOnDate: " + data[5] + "|");
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

}
