
package ec.edu.espe.view;

import ec.edu.espe.model.Chicken;
import ec.edu.espe.model.Egg;
import ec.edu.espe.model.Poop;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author mateo
 */
public class ChickenFarmSystem {

    public static void main(String[] args) {
    // Crear un arreglo de 5 pollos
    Chicken chickens[] = new Chicken[5];

    // Crear instancias de otras clases
    Poop poop = new Poop();
    Egg egg = new Egg();

    // Utilizar un bucle para ingresar datos para cada pollo
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < 5; i++) {
        System.out.println("Ingrese los datos para el pollo " + (i + 1) + ":");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea pendiente

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Color: ");
        String color = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.print("¿Is Molting? (true/false): ");
        boolean isVaccinated = scanner.nextBoolean();

        // Crear el objeto Chicken con los datos ingresados
        chickens[i] = new Chicken(id, name, color, age, isVaccinated);
    }

    // Imprimir información
    System.out.println("Hello Chickens from the simulator");
    System.out.println("My name is --> Mateo Iza");
    System.out.println("Poop -->" + poop);
    System.out.println("Egg -->" + egg);

    // En el método main de ChickenFarmSystem
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("chickens_data.csv"))) {
        // Escribir la cabecera del archivo CSV
        writer.write("ID,Name,Color,BirthYear,IsMolting,AgeInYears\n");

        // Escribir los datos de cada pollo en el archivo CSV
        for (Chicken chicken : chickens) {
            writer.write(chicken.getId() + "," + chicken.getName() + "," + chicken.getColor() + ","+ chicken.getAge() + "," + chicken.isIsMolting() + "," + chicken.calculateAge() + "\n");
        }

        System.out.println("Datos de pollos guardados en chickens_data.csv");
    } catch (IOException e) {
        System.out.println("Error al escribir en el archivo CSV: " + e.getMessage());
    }
}



}