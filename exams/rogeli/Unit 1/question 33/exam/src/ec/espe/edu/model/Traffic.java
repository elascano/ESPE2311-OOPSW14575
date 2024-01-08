/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.model;

/**
 *
 * @author HP
 */
public class Traffic {

    private String Place;
    private int numberOfCars;
    private boolean areYouThere;

    public Traffic(String Place, int numberOfCars, boolean areYouThere) {
        this.Place = Place;
        this.numberOfCars = numberOfCars;
        this.areYouThere = areYouThere;
    }
    
    
    /**
     * @return the Place
     */
    public String getPlace() {
        return Place;
    }

    /**
     * @param Place the Place to set
     */
    public void setPlace(String Place) {
        this.Place = Place;
    }

    /**
     * @return the numberOfCars
     */
    public int getNumberOfCars() {
        return numberOfCars;
    }

    /**
     * @param numberOfCars the numberOfCars to set
     */
    public void setNumberOfCars(int numberOfCars) {
        this.numberOfCars = numberOfCars;
    }

    /**
     * @return the areYouThere
     */
    public boolean AreYouThere() {
        return areYouThere;
    }

    /**
     * @param areYouThere the areYouThere to set
     */
    public void setAreYouThere(boolean areYouThere) {
        this.areYouThere = areYouThere;
    }
    
}
