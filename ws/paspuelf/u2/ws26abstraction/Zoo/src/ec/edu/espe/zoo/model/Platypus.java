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
public class Platypus extends Mammal {

    private boolean poisonous;
    private int poisonGlands;

    @Override
    public void feed() {
        System.out.println("Feeding platypus with small fish n worms");
    }

    @Override
    public void move() {
        System.out.println("The platypus is swimming and moving with a unique paddle-like motion.");
    }

    public Platypus(boolean poisonous, int poisonGlands, int numberOfMammayGlands, String spine, int numberOfBones, int id, String scientificName, Date bornDate, int cageId) {
        super(numberOfMammayGlands, spine, numberOfBones, id, scientificName, bornDate, cageId);
        this.poisonous = poisonous;
        this.poisonGlands = poisonGlands;
    }

    @Override
    public String toString() {
        return "Platypus{" + super.toString() + "poisonous=" + poisonous + ", poisonGlands=" + poisonGlands + '}';
    }

    /**
     * @return the poisonous
     */
    public boolean isPoisonous() {
        return poisonous;
    }

    /**
     * @param poisonous the poisonous to set
     */
    public void setPoisonous(boolean poisonous) {
        this.poisonous = poisonous;
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
