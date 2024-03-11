package ec.edu.espe.dpexsystem.model;

import java.util.Scanner;

/**
 *
 * @author NullPointerException
 */
public class Country {
    private String name;
    private int ecuadorianPopulation;
    
    Scanner scanner = new Scanner(System.in);

    public Country(String name, int ecuadorianPopulation) {
        this.name = name;
        this.ecuadorianPopulation = ecuadorianPopulation;
    }
    
    public int getEcuadorianPopulation(){
        System.out.print("Enter the Ecuadorian population of the country: ");
        int ecuadorianPopulation = scanner.nextInt();
        return ecuadorianPopulation;
    }
}
