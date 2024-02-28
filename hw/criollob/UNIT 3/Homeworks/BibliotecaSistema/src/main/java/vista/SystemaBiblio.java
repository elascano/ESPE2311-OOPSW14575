/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;
import Modelos.Cliente;
import Modelos.Libro;
import Modelos.Biblioteca;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class SystemaBiblio {
 public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        int opcion;

        // Menú interactivo
        do {
            System.out.println("Menú:");
            System.out.println("1. Prestar libro");
            System.out.println("2. Devolver libro");
            System.out.println("3. Registrar nuevo cliente");
            System.out.println("4. Mostrar libros disponibles");
            System.out.println("5. Mostrar clientes registrados");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de nextInt()

            switch (opcion) {
                case 1:
    // Solicitar información sobre el cliente y el libro a prestar
    System.out.print("Ingrese el nombre del cliente: ");
    String nombreCliente = scanner.nextLine();

    System.out.print("Ingrese el título del libro: ");
    String tituloLibro = scanner.nextLine();

    // Crear instancias de Cliente y Libro (asumiendo que tienes métodos para buscar o crear clientes y libros)
    Cliente cliente = buscarClientePorNombre(nombreCliente);
    Libro libro = buscarLibroPorTitulo(tituloLibro);

    // Llamar al método prestarLibro en la instancia de Biblioteca
    biblioteca.prestarLibro(cliente, libro);
    break;
        
                    
                    break;
                case 2:
                    // Lógica para devolver libro
                    break;
                case 3:
                    // Lógica para registrar nuevo cliente
                    break;
                case 4:
                    // Lógica para mostrar libros disponibles
                    break;
                case 5:
                    // Lógica para mostrar clientes registrados
                    break;
                case 6:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del 1 al 6.");
            }

        } while (opcion != 6);

        // Cerrar el Scanner al salir
        scanner.close();
    }
}