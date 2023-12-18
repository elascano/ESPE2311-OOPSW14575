package ec.edu.espe.chickenfarm.utility;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.chickenfarm.model.Chicken;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jefferson David Yepez Moran, Bit Coderz, DCCO -ESPE
 */
public class Utility {

    public void writeFileJson(String nameFile,ArrayList<Chicken> chickens){         
          try{
              FileWriter fileWriter = new FileWriter(nameFile);
              Gson gson = new GsonBuilder().setPrettyPrinting().create();
              gson.toJson(chickens,fileWriter);
              fileWriter.close();
          }catch(IOException e){
              throw new RuntimeException(e);
          }
    }

    public ArrayList<Chicken> readFileJson(String nameFile){
        ArrayList<Chicken> chickensList = null;
        try{
              FileReader fileReader = new FileReader(nameFile);
              Type type = new TypeToken<ArrayList<Chicken>>(){}.getType();
              Gson gson = new GsonBuilder().setPrettyPrinting().create();
              
              chickensList =gson.fromJson(fileReader, type);
              fileReader.close();
              
          }catch(FileNotFoundException e){
              System.err.println("Error in creating the File Reader Object");
          }catch(IOException e){
              throw new RuntimeException(e);
          }
        return chickensList;
    }
    
    public void displayElementsFile(ArrayList<Chicken> chickens){
        int i =1;
        
        for(Chicken currentChicken : chickens) {
            System.out.print("\nChicken [" + i + "]: " + currentChicken);
            i++;
        }
    }

    public void printCSVFile(String path) {
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
    
    public void saveCSVFile(Chicken chiken, String path) {
        try (FileWriter writer = new FileWriter(path, true)) {
            writer.write(chiken.CSVObjectFormat());
            System.out.println("[+]Data Saved Succesfully.");
        } catch (IOException e) {
            System.err.println("[-] Something went wrong: " + e.getMessage());
        }
    }

    public int calculateYears(int dayBirth, int monthBirth, int yearBirth) {
        LocalDate curretnDate = LocalDate.now();
        int currentDay = curretnDate.getDayOfMonth();
        int currentMonth = curretnDate.getMonthValue();
        int currentYear = curretnDate.getYear();

        int daysDifference = currentDay - dayBirth;
        int monthsDifference = currentMonth - monthBirth;
        int YearsDifference = currentYear - yearBirth;

        if (daysDifference < 0) {
            monthsDifference--;
            daysDifference += 30;
        }
        if (monthsDifference < 0) {
            YearsDifference--;
            monthsDifference += 12;
        }

        return YearsDifference;
    }
    
    

}
