package ec.edu.espe.dinosaursys.utils;

import java.util.Scanner;

public class MessageBox {
    public static void printMessage(String message) {
        int messageLength = message.length();
        String border = "";
        for(int i=0; i<messageLength+4; i++) {
            border += "*";
        }
        String emptyLine = "*";
        for(int i=0; i<messageLength+2; i++) {
            emptyLine += " ";
        }
        emptyLine += "*";

        System.out.println(border);
        System.out.println(emptyLine);
        
        System.out.println("* " + message + " *");
        System.out.println(emptyLine);
        System.out.println(border);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Press enter to continue...");
        scanner.nextLine();
    }
}
