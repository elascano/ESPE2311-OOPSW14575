package ec.edu.espe.chickenfarm.utility;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

/**
 *
 * @author Jefferson David Yepez Moran, Bit Coderz, DCCO -ESPE
 */
public class Utility {

    public static void saveChickenToCSV(Chicken chicken) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("chickens.csv", true))) {
            writer.write(chicken.getId() + ";"
                    + chicken.getName() + ";"
                    + chicken.getColor() + ";"
                    + chicken.getAge() + ";"
                    + chicken.getIsMolting() + ";"
                    + chicken.getBornOnDay() + ";"
                    + chicken.getBornOnMonth() + ";"
                    + chicken.getBornOnYear() + "\n");
            System.out.println("Chicken added to chickens.csv");
        } catch (IOException e) {
            System.out.println("Error adding the chicken to the CSV file.");
        }
    }

    public static void displayChickens() {
        String csvFileName = "chickens.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(csvFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(";");

                Chicken chicken = new Chicken(
                        Integer.parseInt(fields[0]),
                        fields[1],
                        fields[2],
                        Integer.parseInt(fields[3]),
                        Boolean.parseBoolean(fields[4]),
                        Integer.parseInt(fields[5]),
                        Integer.parseInt(fields[6]),
                        Integer.parseInt(fields[7])
                );
                System.out.println(chicken);
            }
        } catch (IOException e) {
            System.out.println("Error reading CSV file: " + e.getMessage());
        }
    }

    public static int calculateYears(int dayBirth, int monthBirth, int yearBirth) {
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
