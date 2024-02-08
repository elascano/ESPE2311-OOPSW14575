<<<<<<< HEAD

package ec.edu.espe.OOPExam.view;

import ec.edu.espe.OOPExam.model.Student;
import java.util.Scanner;

/**
 *
 * @author IMG_NUC
 */
public class College {

    public static void main(String[] args) {

        System.out.println("\nDo you want to delete all the objects created?\n");
        System.out.println("1. Create students\n2.Delete all students\n3.Quit\n");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        
        switch (option) {
            case 1 -> Student.createStudents();
            case 2 -> Student.deleteAllStudents();
            case 3 -> System.out.println("bye");
            default -> throw new AssertionError();
        }
    
    }
}
=======

package ec.edu.espe.OOPExam.view;

import ec.edu.espe.OOPExam.model.Student;
import java.util.Scanner;

/**
 *
 * @author IMG_NUC
 */
public class College {

    public static void main(String[] args) {

        System.out.println("\nDo you want to delete all the objects created?\n");
        System.out.println("1. Create students\n2.Delete all students\n3.Quit\n");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        
        switch (option) {
            case 1 -> Student.createStudents();
            case 2 -> Student.deleteAllStudents();
            case 3 -> System.out.println("bye");
            default -> throw new AssertionError();
        }
    
    }
}
>>>>>>> 3105831e9d4737ff3c9dddc8cf7c841ad97c3452
