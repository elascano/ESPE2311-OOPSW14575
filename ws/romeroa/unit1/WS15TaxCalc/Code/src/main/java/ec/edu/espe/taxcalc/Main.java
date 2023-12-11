package ec.edu.espe.taxcalc;

import java.util.Scanner;

import ec.edu.espe.taxcalc.util.TaxCalculator;

/**
 * @author Andrés Romero, Luis Sagnay - DCCO - ESPE
 *
 */
public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.println("\n---- Welcome to the income taxes calculator ----\n");

        System.out.println("How much are you paid each month? (USD)");
        double monthlyIncome = scanner.nextDouble(); scanner.nextLine();

        System.out.println("Are you a public employee? (true/false)");
        boolean publicEmployee = scanner.nextLine().equals("true");
        
        double amount = TaxCalculator.CalculateTaxes(monthlyIncome, publicEmployee, 2023);
        System.out.println("\n-> You will pay $" + String.format("%.2f", amount) + " USD in taxes.\n");
    }
}
