package ec.edu.espe.chickenfarm.view;

import java.io.BufferedReader;

import ec.edu.espe.chickenfarm.model.*;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import ec.edu.espe.chickenfarm.utils.FileHandler;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class ChickenFarmSystem {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Poop poop = new Poop();
        Egg egg = new Egg(1);

        List<Chicken> chickens = new ArrayList<>();
        List<Chicken> chickensReader = new ArrayList<>();

        FileHandler fileHanlder = new FileHandler();

        int toUseId = 0;
        toUseId = fileHanlder.getLastId("./chickens.csv");

        int opt = 0;
        System.out.println("*************************\n| Chicken Farm Simulator|\n*************************");
        do {
            System.out.print("*****Chose an option***** \n \t 1) Add a chicken \n\t 2) See all chickens \n\t 3) Exit\nOption: ");
            opt = in.nextInt();
            switch (opt) {
                case 1:
                    chickens.clear();
                    chickens = fileHanlder.readChickenList("./chickens.json");
                    int idToUse = (chickens.get(chickens.size()-1).getId() +1);
                    chickens.add(generateChickenByUserData(idToUse));
                    fileHanlder.saveJSONFile((ArrayList<Chicken>) chickens, "./chickens.json");

                    //fileHanlder.saveCSVFile(chikenToAdd, "./chickens.csv");
                    //OnSucces
                    toUseId++;
                    break;
                case 2:
                    chickens = fileHanlder.readChickenList("./chickens.json");
                    fileHanlder.printCSVFile("./chickens.csv");
                    chickensReader = fileHanlder.readChickenList("./chickens.json");
                    System.out.println(chickensReader);
                    for (Chicken chickenToPrint : chickensReader) {
                        chickenToPrint.prettierPrint(chickenToPrint);
                    }
                    break;
                    
                default:
                    System.out.println("[-] Invalid Choosed Option");
            }
        } while (opt != 3);
    }

    public static Chicken generateChickenByUserData(int id) {
        Scanner in = new Scanner(System.in);
        System.out.print("name: ");
        String name = in.nextLine();
        System.out.print("Color: ");
        String color = in.nextLine();
        System.out.print("Born on Date (yyyy-mm-dd): ");
        String bornOnDate = in.nextLine();
        System.out.print("Chicken is molting?: ");
        boolean isMolting = in.nextBoolean();
        return new Chicken(id, name, color, isMolting, bornOnDate);
    }
}
