/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.dino.model;

/**
 *
 * @author RC_558
 */

import java.util.ArrayList;

public class JurassicPark {
    private int id;
    private ArrayList<Dino> dinos;

    @Override
    public String toString() {
        return "JurassicPark{" + "id=" + id + ", dinos=" + dinos + '}';
    }

    
    public JurassicPark(int id, ArrayList<Dino> dinos) {
        this.id = id;
        this.dinos = dinos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Dino> getDinos() {
        return dinos;
    }

    public void setDinos(ArrayList<Dino> dinos) {
        this.dinos = dinos;
    }
    
    

  
}

