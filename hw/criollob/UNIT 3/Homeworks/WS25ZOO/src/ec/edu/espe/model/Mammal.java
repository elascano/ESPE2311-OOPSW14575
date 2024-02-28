/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.model;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Mammal extends Vertebrate{
    private int numberOfMammaryGlands;

    public Mammal(int numberOfMammaryGlands, int id, String scientificName, Date bornDate, int cageId, String cageId, String spine, int numberOfBones) {
        super(id, scientificName, bornDate, cageId, cageId, spine, numberOfBones);
        this.numberOfMammaryGlands = numberOfMammaryGlands;
    }

    @Override
    public String toString() {
        return "Mammal{" +super.toString()+ "numberOfMammaryGlands=" + numberOfMammaryGlands + '}';
    }

    
    
    /**
     * @return the numberOfMammaryGlands
     */
    public int getNumberOfMammaryGlands() {
        return numberOfMammaryGlands;
    }

    /**
     * @param numberOfMammaryGlands the numberOfMammaryGlands to set
     */
    public void setNumberOfMammaryGlands(int numberOfMammaryGlands) {
        this.numberOfMammaryGlands = numberOfMammaryGlands;
    }
    
}
