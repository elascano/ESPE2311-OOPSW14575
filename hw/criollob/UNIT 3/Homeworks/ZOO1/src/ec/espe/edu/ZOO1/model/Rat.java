/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.ZOO1.model;

/**
 *
 * @author Usuario
 */
import java.util.Date;

public class Rata extends Animal {
    private String color;
    private boolean colaLarga;

    public Rata(int id, String scientificName, Date bornDate, int cageId, String name, int age, String gender, String color, boolean colaLarga) {
        super(id, scientificName, bornDate, cageId, name, age, gender);
        this.color = color;
        this.colaLarga = colaLarga;
    }

    public void roer() {
        System.out.println(getName() + " está royendo algo");
    }

    @Override
    public void comer() {
        System.out.println(getName() + " está comiendo y roendo");
    }

    // Getters y setters para los atributos específicos de Rata

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean tieneColaLarga() {
        return colaLarga;
    }

    public void setColaLarga(boolean colaLarga) {
        this.colaLarga = colaLarga;
    }
}
