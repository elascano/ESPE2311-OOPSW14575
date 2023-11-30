import java.util.Scanner;
import java.util.Calendar;

class Chicken {
    String name;
    private int yearOfBirth;

    public Chicken(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public int calculateAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - this.yearOfBirth;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Age: " + this.calculateAge() + " years";
    }
}

public class ChickenFarmSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Chicken[] chickens = new Chicken[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the name of chicken " + (i + 1) + ":");
            String name = scanner.nextLine();

            System.out.println("Enter the year of birth of chicken " + (i + 1) + ":");
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // consume the newline of the birth year

            chickens[i] = new Chicken(name, yearOfBirth);
        }

        System.out.println("\nChicken: " + chickens[0].name + ", Details: " + chickens[0].toString());
        System.out.println("List of chickens:");

        for (int i = 0; i < 5; i++) {
            System.out.println(chickens[i].toString());
        }
    }
}