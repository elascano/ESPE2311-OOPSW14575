package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Carlos Ñato, The Javas, DCC-ESPE
 */
public class Canary extends Bird {

    private String color;

    public Canary(String color, int beak, String habitat, int size, int id, String cientificName, Date bornDate, int cageId) {
        super(beak, habitat, color, size, id, cientificName, bornDate, cageId);
        this.color = color;
    }

    @Override
    public void hunt() {
        System.out.println("canary is hunting");
    } ;
        @Override
    public void feed() {
        System.out.println("canary is eating worms");

    };  
    
    public void hunt(int prey) {
        System.out.println("canary has hunted " + prey + "times in the day");
    }
    ;
    public void sing() {
        System.out.println("canary is singing");
    }



    @Override
    public String toString() {
        return "Canary{" + super.toString() + "color=" + color + '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
