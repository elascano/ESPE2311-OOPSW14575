package ec.edu.espe.proyectchickenfarm.view;

import ec.edu.espe.proyectchickenfarm.model.Chicken;
import ec.edu.espe.proyectchickenfarm.model.Egg;
import ec.edu.espe.proyectchickenfarm.model.Poop;
import java.util.Scanner;

/*
@author Rony Cedeño,INTERBYTE,DCCO ESPE_14575
 */
public class ChickenFarmSystem {

    public static void main(String[] args) {

        Chicken vector[] = new Chicken[2];
        Scanner scanner = new Scanner(System.in);

        Poop poop = new Poop(15, "Robin", "Brown", 1, true);
        Egg egg = new Egg(15);
        Chicken chicken = new Chicken(1, "Lucy", "White&Black", 2, true);
        Chicken chicken2 = new Chicken(2, "Alisson", "Black", 1, false);

        vector[0] = chicken;
        vector[1] = chicken2;

        //Workshop in class
        System.out.println("Hello Chickens from the simulator");
        System.out.println("My name is --> Rony Cedeño");
        System.out.println("Poop" + poop);
        System.out.println("Egg" + egg);
        System.out.println("Chicken 1 -->" + chicken);
        System.out.println("Chicken 2 -->" + chicken2);
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Chicken #" + (i + 1) + vector[i]);
        }

        //Excersice 3: 
        for (int i = 0; i < vector.length; i++) {

            ageCalculate();
            System.out.println("Please enter the ID of the chicken#" + (i + 1) + ":");
            int chickenid = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter the name of the chicken#" + (i + 1) + ":");
            String chickenname = scanner.nextLine();

            System.out.println("Enter the color of the chicken#" + (i + 1) + ":");
            String chickencolor = scanner.nextLine();

            System.out.println("Enter the age of the chicken#" + (i + 1) + ":");
            int chickenage = scanner.nextInt();

            System.out.println("Is the chicken#" + (i + 1) + " moolting? (true/false): ");
            boolean chickenisMolting = scanner.nextBoolean();

            Chicken otherChickens = new Chicken(chickenid, chickenname, chickencolor, chickenage, chickenisMolting);
            vector[i] = otherChickens;
        }

        //Worshop#2 in class
        chicken.setId(9);
        System.out.println("New chicken id -->" + chicken.getId());
        System.out.println("chicken -->" + chicken);
    }

    public static void ageCalculate() {

        System.out.println("-----------CURRENT DATE-----------------------");
        System.out.println("Enter current day: ");
        Scanner scanner = new Scanner(System.in);
        int currentDay = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the current month: ");
        int currentMonth = scanner.nextInt();

        System.out.println("Enter the current year: ");
        int currentYear = scanner.nextInt();

        System.out.println("--------DATE OF BIRTH OF THE CHICKEN----------");
        System.out.println("Enter the day of birth of the chicken: ");
        int dayOfBirth = scanner.nextInt();

        System.out.println("Enter the month of birth the chicken: ");
        int monthOfBirth = scanner.nextInt();

        System.out.println("Enter the year of birth the chicken: ");
        int yearOfBirth = scanner.nextInt();

        if (currentMonth >= monthOfBirth || currentDay >= dayOfBirth) {
            int years = currentYear - yearOfBirth;
            int months = currentMonth - monthOfBirth;
            int days = currentDay - dayOfBirth;

            if (months != 0 || years != 0) {
                System.out.println("The chicken´s age is: " + years + " years, " + months + " months, " + days + " days");
            } else {
                if (months != 0) {
                    System.out.println("The chicken´s age is: " + years + " years, and  " + months + " months");
                } else {
                    if (days != 0) {
                        System.out.println("The chicken´s age is: " + years + " years, and " + days + "days");
                    }
                }
            }
        }
    }

}
