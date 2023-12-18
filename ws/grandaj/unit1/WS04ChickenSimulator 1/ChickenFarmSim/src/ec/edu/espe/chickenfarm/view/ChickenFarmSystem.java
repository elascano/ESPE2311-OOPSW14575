package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Calendar;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;
import java.util.ArrayList;

/**
 *
 * @author JuanGranda,Error 404,DCCO-ESPE
 */
public class ChickenFarmSystem {

    public static void main(String[] args) {
        int number;
        List<Chicken> chickens = new ArrayList<>();
        Scanner enter = new Scanner(System.in);

        Poop poop = new Poop();
        Egg egg = new Egg();
        Chicken chicken = new Chicken(1, "Lucy", "White&Black", 2, true);

        System.out.println("Hello Chickens from the Simulator");
        System.out.println("My name is --> Juan Granda");
        System.out.println("poop --> " + poop);
        System.out.println("egg --> " + egg);
        System.out.println("chicken -->" + chicken);
        System.out.println("HELLO WELCOME");
        System.out.println("Enter the number of chickens (1 to 5): ");
        number = enter.nextInt();
        if (number <= 5) {
            for (int i = 0; i < number; i++) {
                System.out.println("Chicken[" + (i + 1) + "]");
                Chicken newChicken = addChickens();
                chickens.add(newChicken);
                addDate();
            }
        } else {
            System.out.println("Sorry, number of chicken overdid it...");
        }
        addMenu(chickens);
    }

    public static void addMenu(List<Chicken> chickens) {
        int opcion ;
        boolean salir = false;
        Scanner enter = new Scanner(System.in);

        while (!salir) {
            System.out.println("WELCOME THE MENU");
            System.out.println("1.-Enter chickens");
            System.out.println("2.-Print chickens");
            System.out.println("3.-Save chickens to .csv");
            System.out.println("4.-Save chickens to .json");
            System.out.println("5.-Salir");
            opcion = enter.nextInt();
            switch (opcion) {
                case 1:
                    Chicken newChicken = addChickens();
                    chickens.add(newChicken);
                    addDate ();

                    break;
                case 2:
                    printChickens(chickens);

                    break;
                case 3:
                    saveChickensToCSV(chickens);

                    break;
                case 4:
                    break;
                case 5:
                    salir = true;
                    break;
            }

        }

    }

    public static Chicken addChickens() {
        Scanner enter = new Scanner(System.in);
        int id;
        String name;
        String color;
        int age;
        boolean isMolting;

        System.out.println("Enter the id: ");
        id = enter.nextInt();

        enter.nextLine();
        System.out.println("Enter the name: ");
        name = enter.nextLine();
        System.out.println("Enter the color: ");
        color = enter.nextLine();
        System.out.println("Enter the age: ");
        age = enter.nextInt();
        System.out.println("Enter (True/False) is the chicken Molting? ");
        isMolting = enter.nextBoolean();
        Chicken chicken2 = new Chicken(id, name, color, age, isMolting);
        System.out.println("Chicken-->" + chicken2);
        return chicken2;
    }

    public static void addDate() {
        try {
            Calendar currentDate = Calendar.getInstance();
            int dayCurrent = currentDate.get(Calendar.DAY_OF_MONTH);
            int monthCurrent = currentDate.get(Calendar.MONTH);
            int yearCurrent = currentDate.get(Calendar.YEAR);
            int day, month, year;
            int resultDay, resultYear, resultMonth;
            Scanner enter = new Scanner(System.in);

            System.out.println("--WELCOME ENTER THE DATE--");
            System.out.println("Enter the day: ");
            day = enter.nextInt();
            if (day < 0 | day > 31) {
                throw new Exception("There was a mistake...");
            }
            System.out.println("Enter the month: ");
            month = enter.nextInt();
            if (month < 0 | month > 12) {
                throw new Exception("There was a mistake....");
            }
            System.out.println("Enter the year:");
            year = enter.nextInt();
            if (year < 0) {
                throw new Exception("There was a mistake...");
            }
            resultDay = Math.abs(day - dayCurrent);
            resultMonth = Math.abs(month - monthCurrent);
            resultYear = Math.abs(year - yearCurrent);
            System.out.println("Year: " + resultYear + "  Month: " + resultMonth + " Day: " + resultDay);
        } catch (Exception ex) {
            System.out.println("There was a mistake..." + ex.toString());
        }

    }
    

    public static void printChickens(List<Chicken> chickens) {
        for (Chicken chicken : chickens) {
            System.out.println(chicken);
        }
    }

    public static void saveChickensToCSV(List<Chicken> chickens) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("chickens.csv"))) {
            writer.write("ID,Name,Color,Age,IsMolting\n");

            for (Chicken chicken : chickens) {
                writer.write(chicken.toCSVString() + "\n");
            }
            System.out.println("CSV file has been created successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
