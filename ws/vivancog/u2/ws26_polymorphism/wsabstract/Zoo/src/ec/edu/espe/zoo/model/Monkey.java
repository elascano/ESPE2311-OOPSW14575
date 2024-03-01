package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Monkey extends Mammal{
    private String color;
    
    
    
    public void isClimbing(float height){
        System.out.println("monkey is "+ height+"ft up");
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    public Monkey(String color, int numberOfMammaryGlands, int id, String scientificName, Date bornDate, int cageId, String spine, int numberOfBones) {
        super(numberOfMammaryGlands, id, scientificName, bornDate, cageId, spine, numberOfBones);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Monkey{"+ super.toString() + "color=" + color + '}';
    }
    
    @Override
    public void isClimbing() {
        System.out.println("mokey is climbing");
    }

    @Override
    public void feed() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void vocalization() {
        System.out.println("The monkey shout");
    }
}
