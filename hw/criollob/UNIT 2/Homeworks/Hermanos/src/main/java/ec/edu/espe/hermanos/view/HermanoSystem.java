

package ec.edu.espe.hermanos.view;


import ec.edu.espe.hermanos.model.Hermano;


/**
 *
 * @author Sebastian
 */
public class HermanoSystem {
    public static void main(String[] args) {
        Hermano hermano1 = new Hermano("Juan", 25, "Ingeniero");
        Hermano hermano2 = new Hermano("Maria", 22, "Estudiante");
        Hermano hermano3 = new Hermano("Carlos", 30, "Doctor");

        System.out.println("Datos del primer hermano:");
        System.out.println(hermano1);

        System.out.println("Datos del segundo hermano:");
        System.out.println(hermano2);   

        System.out.println("Datos del tercer hermano:");
        System.out.println(hermano3);
    }
}
