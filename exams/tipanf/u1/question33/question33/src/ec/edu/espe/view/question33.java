package ec.edu.espe.view;

import ec.edu.espe.model.Singer;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Frederick
 */
public class question33 {
    
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        ArrayList<Singer> singerList = Singer.getFromFile();
        int option;
        do {
            System.out.println("---------- Question 33 ------------");
            System.out.println("-----------------------------------");
            System.out.println("|    1.- Add 5 Singers            |");
            System.out.println("|    2.- Delete all the singers   |");
            System.out.println("|    3.- Exit                     |");
            System.out.println("___________________________________");
            System.out.println("Select an option (1-3): ");
            option = scan.nextInt();
             scan.nextLine();
            switch (option) {
                case 1:
                    Singer.addSingers(singerList);
                    System.out.println("\nPress any button to return");
                    scan.nextLine();
                    break;
                case 2:
                    Singer.deleteSingers(singerList);
                    System.out.println("\nDone! Press any button to return");
                    scan.nextLine();
                    break;
                            
                case 3:
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }while (option != 3);
        
    }
    
}
