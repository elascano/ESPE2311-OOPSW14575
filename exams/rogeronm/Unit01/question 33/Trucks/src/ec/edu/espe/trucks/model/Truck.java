/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.trucks.model;

/**
 *
 * @author mate-
 */
public class Truck {
    private int id;
    private String modelTruck;
    private int wheelsNumber;

    public Truck(int id, String modelTruck, int wheelsNumber) {
        this.id = id;
        this.modelTruck = modelTruck;
        this.wheelsNumber = wheelsNumber;
    }

    @Override
    public String toString() {
        return "Trucks{" + "id=" + id + ", modelTruck=" + modelTruck + ", wheelsNumber=" + wheelsNumber + '}';
    }
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the modelTruck
     */
    public String getModelTruck() {
        return modelTruck;
    }

    /**
     * @param modelTruck the modelTruck to set
     */
    public void setModelTruck(String modelTruck) {
        this.modelTruck = modelTruck;
    }

    /**
     * @return the wheelsNumber
     */
    public int getWheelsNumber() {
        return wheelsNumber;
    }

    /**
     * @param wheelsNumber the wheelsNumber to set
     */
    public void setWheelsNumber(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }
    
    
}
