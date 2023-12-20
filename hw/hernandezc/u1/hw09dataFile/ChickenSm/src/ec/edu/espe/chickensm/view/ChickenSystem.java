package ec.edu.espe.chickensm.view;

import ec.edu.espe.chickensm.model.Chicken;
import ec.edu.espe.chickensm.model.Datee;
import ec.edu.espe.chickensm.utils.UseJson;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Carlos Hernandez
 */
public class ChickenSystem {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        UseJson file = new UseJson();
        ArrayList<Chicken> chickens = file.readFile("Chickensdata.json");

        do {
            System.out.println("CHICKEN FARM SIMULATOR ");
            System.out.println("1.- Add a chicken");
            System.out.println("2.- Show all the chickens");
            System.out.println("3.- Exit");
            option = scan.nextInt();
            scan.nextLine();

            switch (option) {
                case 1:
                    chickens.add(addChicken());
                    file.writeFile("Chickensdata.json", chickens);
                    System.out.println("array"+chickens);
                    break;
                case 2:
                    show(chickens);
                    break;
                case 3:
                    break;
            }
        } while (option != 3);

    }

    public static void show(ArrayList<Chicken> chickens) {
        int j = 1;
        for (Chicken currentChicken : chickens) {
            System.out.print("\nChicken [" + j + "]: " + currentChicken);
            j++;
        }
    }

    public static Chicken addChicken() {
        Datee birthdate = new Datee(0, 0, 0);

        System.out.println("Set a chicken ID");
        int id = scan.nextInt();
        scan.nextLine();

        System.out.println("Give the chicken a name");
        String name = scan.nextLine();

        System.out.println("Set a color for the chicken");
        String color = scan.nextLine();

        System.out.println("Insert the day the chicken was born");
        birthdate.setDay(scan.nextInt());
        scan.nextLine();

        System.out.println("Insert the month the chicken was born");
        birthdate.setMonth(scan.nextInt());
        scan.nextLine();

        System.out.println("Insert the year the chicken was born");
        birthdate.setYear(scan.nextInt());
        scan.nextLine();

        int age = calculateAge(birthdate.getDay(), birthdate.getMonth(), birthdate.getYear());

        System.out.println("Is the chicken molting? (True/False)");
        boolean isMolting = scan.nextBoolean();
        scan.nextLine();

        return new Chicken(id, name, color, birthdate, age, isMolting);
    }

    public static int calculateAge(int day, int month, int year) {
        Datee finalAge = new Datee(0, 0, 0);
        LocalDate presentDate = LocalDate.now();
        finalAge.setYear(presentDate.getYear() - year);
        finalAge.setMonth(presentDate.getMonthValue() - month);
        finalAge.setDay(presentDate.getDayOfMonth() - day);

        if (finalAge.getMonth() < 0) {
            finalAge.setYear(finalAge.getYear() - 1);
            finalAge.setMonth(12 + finalAge.getMonth());
        }

        if (finalAge.getDay() < 0) {
            finalAge.setMonth(finalAge.getMonth() - 1);
            finalAge.setDay(30 + finalAge.getDay());
        }
        return finalAge.getYear();
    }
}
