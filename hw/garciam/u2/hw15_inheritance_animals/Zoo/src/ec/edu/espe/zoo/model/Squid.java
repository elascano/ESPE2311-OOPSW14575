/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author mateo
 */
public class Squid extends Mollusk{
    private float tentacleLength;
    private String inkColor;

    public Squid(float tentacleLength, String inkColor, String shellType, float movementSpeed, String AnatomyStructure, String habitat, String reproductionType, int id, String scientificName, Date bornDate, int cageId) {
        super(shellType, movementSpeed, AnatomyStructure, habitat, reproductionType, id, scientificName, bornDate, cageId);
        this.tentacleLength = tentacleLength;
        this.inkColor = inkColor;
    }
    
    public void ejectInk(){}

    @Override
    public String toString() {
        return "Squid{" + "tentacleLength=" + tentacleLength + ", inkColor=" + inkColor + '}';
    }
    
}
