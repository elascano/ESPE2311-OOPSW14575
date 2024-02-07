
package util;

import java.util.ArrayList;
import java.util.Scanner;

public class RecibirDatos {
    private String nombre;
    private String tiempo;
    private String ritmo;
    public RecibirDatos(String nombre, String tiempo, String ritmo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.ritmo = ritmo;
    }

    @Override
    public String toString() {
        return "RecibirDatos{" + "nombre=" + nombre + ", tiempo=" + tiempo + ", ritmo=" + ritmo + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getRitmo() {
        return ritmo;
    }

    public void setRitmo(String ritmo) {
        this.ritmo = ritmo;
    }


    public RecibirDatos AñadirCanciones(ArrayList<RecibirDatos> datos){
        Scanner scan = new Scanner(System.in);
//        String name = "";
//        String tiempo = "";
//        String ritmo = "";
        System.out.println("Bienvenido a tu programa GUARDAR MUSICA");
        System.out.println("INGRESE EL NOMBRE DE LA CANCION");
        String nombre = scan.nextLine();
        System.out.println("INGRESE LA CANCION");
        String tiempo = scan.nextLine();
        System.out.println("INGRESE EL RITMO DE LA CANCION");
        String ritmo = scan.nextLine();
        return new RecibirDatos(nombre, tiempo, ritmo);
    }
    public void munuCanciones(ArrayList<RecibirDatos> datos){
      int opcion  = 0;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("HOLA ESCOJE UNA OPCION");
            System.out.println("1.Añadir una Musica");
            System.out.println("2.Mostrar mis Musicas");
            System.out.println("3.Salir");
            opcion = scan.nextInt();
            switch(opcion){
                case 1:
                    AñadirCanciones(datos);
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        
    }while(opcion != 3);
        
    }
    
    public  RecibirDatos mostrarCanciones(ArrayList<RecibirDatos> datos){
        
    }
}
