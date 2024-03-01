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
public class Platypus extends Mammal {
    private boolean poisoness;
    private int poisonGlands;

    public Platypus(boolean poisoness, int poisonGlands, int numberOfMammaryGlands, int id, String scientificName, Date bornDate, int cageId, String cageId, String spine, int numberOfBones) {
        super(numberOfMammaryGlands, id, scientificName, bornDate, cageId, cageId, spine, numberOfBones);
        this.poisoness = poisoness;
        this.poisonGlands = poisonGlands;
    }

    @Override
    public String toString() {
        return "Platypus{" +super.toString()+ "poisoness=" + poisoness + ", poisonGlands=" + poisonGlands + '}';
    }

    
    
    
    /**
     * @return the poisoness
     */
    public boolean isPoisoness() {
        return poisoness;
    }

    /**
     * @param poisoness the poisoness to set
     */
    public void setPoisoness(boolean poisoness) {
        this.poisoness = poisoness;
    }

    /**
     * @return the poisonGlands
     */
    public int getPoisonGlands() {
        return poisonGlands;
    }

    /**
     * @param poisonGlands the poisonGlands to set
     */
    public void setPoisonGlands(int poisonGlands) {
        this.poisonGlands = poisonGlands;
    }
    
}
