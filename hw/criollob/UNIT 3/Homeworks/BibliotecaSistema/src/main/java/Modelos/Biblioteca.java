
package Modelos;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> librosDisponibles;
    private List<Cliente> clientesRegistrados;

    public Biblioteca() {
        librosDisponibles = new ArrayList<>();
        clientesRegistrados = new ArrayList<>();
    }

    public void prestarLibro(Cliente cliente, Libro libro) {
        if (librosDisponibles.contains(libro)) {
            librosDisponibles.remove(libro);
            cliente.prestarLibro(libro);
            System.out.println("Libro prestado con éxito a " + cliente.getNombre());
        } else {
            System.out.println("El libro no está disponible para préstamo.");
        }
    }

    public void devolverLibro(Cliente cliente, Libro libro) {
        if (cliente.tieneLibroPrestado(libro)) {
            librosDisponibles.add(libro);
            cliente.devolverLibro(libro);
            System.out.println("Libro devuelto con éxito por " + cliente.getNombre());
        } else {
            System.out.println("El cliente no tiene este libro prestado.");
        }
    }

    public void registrarCliente(Cliente cliente) {
        clientesRegistrados.add(cliente);
        System.out.println("Cliente registrado: " + cliente.getNombre());
    }

    public void mostrarLibrosDisponibles() {
        System.out.println("Libros disponibles:");
        for (Libro libro : librosDisponibles) {
            System.out.println(libro.getTitulo() + " - " + libro.getAutor());
        }
    }

    public void mostrarClientesRegistrados() {
        System.out.println("Clientes registrados:");
        for (Cliente cliente : clientesRegistrados) {
            System.out.println(cliente.getNombre() + " - Libros prestados: " + cliente.getLibrosPrestados());
        }
    }
}
