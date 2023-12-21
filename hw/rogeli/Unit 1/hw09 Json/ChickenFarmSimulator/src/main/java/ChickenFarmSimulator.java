
import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;
import java.time.LocalDate;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;
/**
 *
 * @author Ilhan Rogel
 *
 * */

public class ChickenFarmSimulator {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Egg egg = new Egg();
        Poop poop =new Poop();
        int option;
        Chicken[] chicken = new Chicken[5];
        System.out.println("Hello chickens from the simulator"); 
        System.out.println("My name is -->Ilhan Rogel");
        int i=0;
        while(true){
        System.out.println("What do you want to do? ");
        System.out.println("1. Create new chicken. ");
        System.out.println("2. Print Chickens");
        System.out.println("3. Make a .json file with current Chickens");
        System.out.println("4. Make a .csv file with current Chickens");
        System.out.println("5. Exit");
        System.out.println("6. Read Chickens from JSON file");
        
        option =input.nextInt();
        switch (option){
            case 1:
            {
                boolean confirm;
                do{
                    chicken[i] = ChickenInput.createChicken(input);
                    System.out.println("Chicken #" + (i + 1) + " " + chicken[i]);
                    System.out.println("Do you want to create another chicken? [true/false]");
                    confirm = input.nextBoolean();
                        if(confirm == true && i<4){
                            i++;
                            System.out.println("------------");
                            System.out.println("New chicken");
                        }
                }while (confirm == true && i<5);
                break;
            }
            
            case 2:
            {
                  printChicken(chicken);
                  break;
            }
            
            case 3:
            {
                JsonWriter.writeJson(chicken, "chickens.json");
                break;
            }
            
            case 4:
            {
                CsvWriter.writeCsv(chicken, "chickens.csv");
                    break;
            }
            
            case 5:
            {
            System.out.println("Goodbye :-D");
                    System.exit(0);
                    break;     
            }
            case 6:
            {
            chicken = JsonReader.readJson("chickens.json");
            System.out.println("Chickens loaded from the JSON file.");
                break;
            }
                default:
                    System.out.println("Invalid option. Please choose a valid option.");     
            }
        }
}       

public class ChickenInput {
    public static Chicken createChicken(Scanner input) {
        int id;
        String name;
        String color;
        int birthday;
        int birthmonth;
        int birthyear;
        int age;
        boolean isMolting;


        System.out.println("Chicken id: ");
        id = input.nextInt();
        input.nextLine();

        System.out.println("Give the chicken a name: ");
        name = input.nextLine();

        System.out.println("What's the chicken color? ");
        color = input.nextLine();

        System.out.println("What day was it born on? ");
        birthday = input.nextInt();
        input.nextLine();
        
        System.out.println("What month was it born on? ");
        birthmonth = input.nextInt();
        input.nextLine();
        
        System.out.println("What year was it born on? ");
        birthyear = input.nextInt();
        input.nextLine();
        
        age = AgeCalculator.Age(birthday, birthmonth, birthyear);
        
        System.out.println("Is the chicken molting? (true/false) ");
        isMolting = input.nextBoolean();
        input.nextLine();

        return new Chicken(id, name, color, birthday,birthmonth,birthyear, age, isMolting);
    }
}


public class AgeCalculator{
    public static int Age (int birthday,int birthmonth,int birthyear){
    LocalDate rightNow =LocalDate.now();
        int today = rightNow.getDayOfMonth();
        int thismonth = rightNow.getMonthValue();
        int thisyear = rightNow.getYear();
        
        int ageInDays,ageInMonths, ageInYears;
            ageInDays = today - birthday;
            ageInMonths = thismonth - birthmonth;
            ageInYears = thisyear - birthyear;
        
            if (ageInDays < 0) {
            ageInMonths--; 
            ageInDays += rightNow.lengthOfMonth(); 
        }

        if (ageInMonths < 0) {
            ageInYears--;  
            ageInMonths += 12;  
        }
        return ageInYears;
    }
}
    
public static void printChicken(Chicken[] chickens) {
    System.out.println("Your current chickens are:");
    for (Chicken c : chickens) {
        if (c != null) {
            System.out.println(c);
        }
    }
}

public class CsvWriter {
    public static void writeCsv(Chicken[] chickens, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {

            writer.append("ID,Name,Color,Birthday,Birthmonth,Birthyear,Age,IsMolting\n");

            for (Chicken chicken : chickens) {
                if (chicken != null) {
                writer.append(chicken.getId() + ",");
                writer.append(chicken.getName() + ",");
                writer.append(chicken.getColor() + ",");
                writer.append(chicken.getDay() + ",");
                writer.append(chicken.getMonth() + ",");
                writer.append(chicken.getYear() + ",");
                writer.append(chicken.getAge() + ",");
                writer.append(chicken.isMolting() + "\n");
                }
            }

            System.out.println(".csv file succesfully created! Your file is: " + filename);

        } catch (IOException e) {
        }
    }
}

public class JsonWriter {
public static void writeJson(Chicken[] chickens, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            Gson gson = new Gson();

            String json = gson.toJson(chickens);

            writer.write(json);

            System.out.println(".json file created successfully! Your file is: " + filename);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class JsonReader {
    public static Chicken[] readJson(String filename) {
        try (FileReader reader = new FileReader(filename)) {
            JsonParser jsonParser = new JsonParser();
            JsonArray jsonArray = jsonParser.parse(reader).getAsJsonArray();

            Gson gson = new Gson();
            Chicken[] chickens = new Chicken[jsonArray.size()];

            for (int i = 0; i < jsonArray.size(); i++) {
                JsonElement jsonElement = jsonArray.get(i);
                chickens[i] = gson.fromJson(jsonElement, Chicken.class);
            }

            return chickens;
        }
        catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
}




/*public static void readInput(){
    //read input from keyboard
}
*/

