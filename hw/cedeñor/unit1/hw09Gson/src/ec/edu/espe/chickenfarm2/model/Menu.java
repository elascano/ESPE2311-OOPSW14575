
package ec.edu.espe.chickenfarm2.model;


import java.util.Scanner;

public class Menu {
    int option;
    public int printMenu(){
        Scanner readOption = new Scanner(System.in);
        System.out.println("<----------MENU---------->");
        System.out.println("1. Add Chicken in Coop\n");     
        System.out.println("2. Save Gson\n");
        System.out.println("3. Exit\n");
        option = readOption.nextInt();
        return option;
    }
}
