
/**
 *
 * @author Usuario
 */
class Dinosaurio {
    private String id;
    private String tipo;
    private String alimentacion;
    private String nombre;

    // Constructor
    public Dinosaurio(String id, String tipo, String alimentacion, String nombre) {
        this.id = id;
        this.tipo = tipo;
        this.alimentacion = alimentacion;
        this.nombre = nombre;
    }

    // Método toString para imprimir fácilmente
    @Override
    public String toString() {
        return "Dinosaurio{id='" + id + "', tipo='" + tipo + "', alimentacion='" + alimentacion + "', nombre='" + nombre + "'}";
    }
}