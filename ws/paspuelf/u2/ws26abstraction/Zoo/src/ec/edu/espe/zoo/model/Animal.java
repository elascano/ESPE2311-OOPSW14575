/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Olivier Paspuel
 */
public abstract class Animal {

    private int id;
    private String scientificName;
    private Date bornDate;
    private int cageId;

    public Animal(int id, String scientificName, Date bornDate, int cageId) {
        this.id = id;
        this.scientificName = scientificName;
        this.bornDate = bornDate;
        this.cageId = cageId;
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", scientificName=" + scientificName + ", bornDate=" + bornDate + ", cageId=" + cageId + '}';
    }

    public abstract void feed();

    public abstract void move();

    public void assignCage(int id) {
        System.out.println("Assigning cage number" + id);
        this.cageId = id;
    }

    public void sleep() {
        System.out.println("The animal is sleeping.");
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
     * @return the scientificName
     */
    public String getScientificName() {
        return scientificName;
    }

    /**
     * @param scientificName the scientificName to set
     */
    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    /**
     * @return the bornDate
     */
    public Date getBornDate() {
        return bornDate;
    }

    /**
     * @param bornDate the bornDate to set
     */
    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    /**
     * @return the cageId
     */
    public int getCageId() {
        return cageId;
    }

    /**
     * @param cageId the cageId to set
     */
    public void setCageId(int cageId) {
        this.cageId = cageId;
    }
}
