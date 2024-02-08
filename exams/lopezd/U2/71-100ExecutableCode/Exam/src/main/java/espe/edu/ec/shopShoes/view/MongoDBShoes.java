package espe.edu.ec.shopShoes.view;
import espe.edu.ec.Shoes.controller.ConnectionMongoShoes;
import java.util.Scanner;
/**
 *
 * @author David Lopez,DCCO-ESPE
 */
public class MongoDBShoes {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int option;
        boolean exitMenu = false;
        try {
            while (!exitMenu) {
                printMenu();
                System.out.print("Enter the option:");
                option = sc.nextInt();

                switch (option) {
                    case 1 ->
                        ConnectionMongoShoes.insertShoes();
                    case 2 ->
                        ConnectionMongoShoes.findShoes();
                    case 3 ->
                        exitMenu = true;
                    default -> {
                        System.out.println("***Invalid option***\n");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Incorrect value");
        }
    }
    private static void printMenu() {
        System.out.println("*****Menu store of shoes*****");
        System.out.println("1. Insert new shoe purchase");
        System.out.println("2. Find the purchase order:");
        System.out.println("3. Exit");
        System.out.println("============================");
    }

}
