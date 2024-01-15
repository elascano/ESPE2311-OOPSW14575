
package Herrencia2;

/**
 *
 * @author Carlos Ñato, The Javas, DCC-ESPE
 */
public class Estudiante extends Persona{
    private int DNI;
    private float notaFinal;
    
    // constructor

    public Estudiante(String name, String apellido,int edad, int DNI, float notaFinal) {
        super(name, apellido, edad);
        this.DNI = DNI;
        this.notaFinal = notaFinal;
    }
    
    public void mostrarDato(){
        System.out.println("Nombre: " + name +"\nApellido: "+ getApellido() + "\nedad: " + getEdad() + "\nCodigo Estufiante: " + DNI + "\nNota final: " + notaFinal );
 
    } 

    public int getDNI() {
        return DNI;
    }

    public float getNotaFinal() {
        return notaFinal;
    }

    public String getName() {
        return name;
    }
    
    
    
    
}
