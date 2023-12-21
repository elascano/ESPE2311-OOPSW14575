package ec.edu.systemprofessor.view;

import com.google.gson.reflect.TypeToken;
import ec.edu.systemprofessor.model.Professor;
import ec.edu.systemprofessor.utils.FileHandler;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase principal para interactuar con profesores y almacenar su información.
 * 
 * @author Antonio Revilla
 */

public class ShowProfessor {
    
    private static final String FILE_PATH = "professor.json";  
    private static final int MAX_PROFESSORS = 4;  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Professor> professorList = new ArrayList<>();
        
        int option;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Create profressor ");
            System.out.println("2. Print all professor");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    if (professorList.size() < MAX_PROFESSORS) {
                        createProfessor(scanner, professorList);
                    } else {
                        System.out.println("You have already reached the maximum number of professors.");
                    }
                    break;
                case 2:
                    displayProfessors(professorList);
                    break;
                case 3:
                    System.out.println("Exit.");
                    break;
                default:
                    System.out.println("Option no valid.");
                    break;
            }
        } while (option != 3);

        scanner.close();
    }

    private static void createProfessor(Scanner scanner, List<Professor> professorList) {
        System.out.println("Enter the profesor details:");

        System.out.print("ID: ");
        int id = scanner.nextInt();

        System.out.print("Name: ");
        String name = scanner.next();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        Professor professor = new Professor(id, name, age, name);
        professorList.add(professor);

        Type professorListType = new TypeToken<List<Professor>>() {}.getType();
        FileHandler.writeFile(FILE_PATH, professorList);

        System.out.println("Successfully created professor.");
    }

    private static void displayProfessors(List<Professor> professorList) {
        System.out.println("\nList Professors:");
        for (Professor professor : professorList) {
            System.out.println(professor);
        }
    }
}



//public class ShowProfessor {
//    
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        List<Professor> professorList = new ArrayList<>();
//
//        for (int i = 1; i <= 4; i++) {
//            System.out.println("Enter the profesor details  " + i + ":");
//
//            System.out.print("ID: ");
//            int id = scanner.nextInt();
//
//            System.out.print("Name: ");
//            String name = scanner.next();
//
//            System.out.print("Age: ");
//            int age = scanner.nextInt();
//
//            Professor professor = new Professor(id, name, age);
//            professorList.add(professor);
//        }
//
//        Type professorListType = new TypeToken<List<Professor>>() {}.getType();
//
//        FileHandler.writeFile("professor.json", professorList);
//
//        System.out.println("Data saved successfully in JSON.");
//
//        for (Professor professor : professorList) {
//            System.out.println(professor);
//        }
//
//        scanner.close();
//    }
//}