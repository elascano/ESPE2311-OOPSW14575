package ec.edu.espe.shoes.view;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/**
/**
 *
 * @author David Lopez
 */
public class ShoesSystem {

    
    public static void main(String[] args) {
        System.out.println("Enter data of the shoes");
        
        
    }
    private static final Scanner scanner = new Scanner(System.in);
     public static void showLandingPage() throws Exception {
        int option;

        System.out.println("ShoesSystem");
        System.out.println("Select one option please\n");
        System.out.println("1. Login to an existing account\n2. Create a new account");

        do {
            option = scanner.nextInt();
            scanner.nextLine(); 
        } while (option != 1 && option != 2);

        for (int i = 0; i < 50; i++) {
            System.out.print("\n\n\n");
        }

        switch (option) {
            case 1 ->
                showInsert();
            case 2 ->
                showPrint();
            default ->
                throw new AssertionError();
        }
    }
    public static <T> void writeFile(String fileAdress, ArrayList<T> objectList) {

        try (FileWriter fileWriter = new FileWriter(fileAdress)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(objectList, fileWriter);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static void showInsert() throws Exception {
        User user = null;
        int option;

        do {
            System.out.println("Select your user type:\n");
            System.out.println("1. Developer\n2. Administrator");
            System.out.println("3. Back to top");
            option = scanner.nextInt();
            scanner.nextLine(); // Consume la nueva línea pendiente después de nextInt

            if (option == 3) {
                try {
                    showLandingPage();
                } catch (Exception e) {
                    System.err.println("Error displaying Landing Page: " + e.getMessage());
                }
                return; // Salir del método showLogin si el usuario decide regresar al menú principal
            }
        }
        }
}