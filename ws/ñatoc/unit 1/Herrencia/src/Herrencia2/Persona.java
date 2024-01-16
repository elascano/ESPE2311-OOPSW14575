package Herrencia2;

/**
 *
 * @author Carlos Ñato, The Javas, DCC-ESPE
 */
public class Persona {
    //protected(modificador de acceso): quieres decir que los atributos se los puede acceder por po hijos 
    protected String name;
    private String apellido;
    private int edad;

    public Persona(String name, String apellido, int edad) {
        this.name = name;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
