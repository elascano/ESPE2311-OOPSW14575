package ec.edu.espe.dino.model;

import java.util.Scanner;

/**
 *
 * @author RC_558
 */
public class Menu {
    int option;
        public int printMenu (){
            Scanner keyboard = new Scanner (System.in);
            System.out.println("-------------Menu------------------");
            System.out.println("1. Read Data");
            System.out.println("2. Exit");
            option = keyboard.nextInt();
            return option;            
        }            
}
