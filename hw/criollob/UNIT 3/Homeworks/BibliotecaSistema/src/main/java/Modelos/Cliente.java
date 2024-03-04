
package Modelos;

/**
 *
 * @author Usuario
 */
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private List<Libro> librosPrestados;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.librosPrestados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void prestarLibro(Libro libro) {
        librosPrestados.add(libro);
        System.out.println("Libro prestado a " + nombre);
    }

    public boolean tieneLibroPrestado(Libro libro) {
        return librosPrestados.contains(libro);
    }

    public void devolverLibro(Libro libro) {
        librosPrestados.remove(libro);
        System.out.println("Libro devuelto por " + nombre);
    }
}
