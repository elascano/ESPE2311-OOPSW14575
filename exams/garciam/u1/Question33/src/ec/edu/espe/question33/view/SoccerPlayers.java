package ec.edu.espe.question33.view;

import ec.edu.espe.question33.model.SoccerPlayer;
import ec.edu.espe.question33.utils.*;
import ec.edu.espe.question33.utils.Validator;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class SoccerPlayers {

    public static void main(String[] args) {
        Validator validator = new Validator();

        Scanner in = new Scanner(System.in);
        FileHandler<SoccerPlayer> fileHandler = new FileHandler<>();

      
        int opt = 0;
        do {
            System.out.println("***Soccer Player Menu***");
            System.out.println("1) Add new Soccer player");
            System.out.println("2) Print all soccer players");
            System.out.println("3) Exit");
            opt = validator.validateIntInput("Select an option: ");

            switch (opt) {
                case 1:
                    createNewSoccerPlayer();
                    break;
                case 2:
                    printAllSoccerPlayers();
                    break;
                case 3:
                    System.out.println("Have a nice day!");
                    break;
                default:
                    System.out.print("Invalid input, try again");
                    break;
            }
        } while (opt != 3);

    }

    public static void createNewSoccerPlayer() {
        Validator validator = new Validator();
        System.out.println("New Soccer player");
        String name = validator.noValidation("name: ");
        boolean isPro = validator.getYNOption("Is a pro Soccer player?(y/n):");
        int age = validator.validateIntInput("age: ");
        SoccerPlayer soccerPlayer = new SoccerPlayer(name,isPro,age);
        soccerPlayer.addNewSoccerPlayer(soccerPlayer);
        System.out.println("Added: " + soccerPlayer.toString());
    }

    public static void printAllSoccerPlayers() {
        SoccerPlayer soccerPlayer = new SoccerPlayer("",false,0);
        soccerPlayer.getSoccerPlayerDataBase().forEach(x -> {
            System.out.println(x.toString());
        });
    }
}
