package ec.edu.espe.examoop.model;

import java.util.Scanner;

/**
 *
 * @author RC_558
 */
public class Vehicle {
    private int id;
    private String color;
    private String brand;
    
    public Vehicle(int id, String color, String brand) {
        this.id = id;
        this.color = color;
        this.brand = brand;
    }
    
    public void addNewVehicle() {
        
    }
    
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
