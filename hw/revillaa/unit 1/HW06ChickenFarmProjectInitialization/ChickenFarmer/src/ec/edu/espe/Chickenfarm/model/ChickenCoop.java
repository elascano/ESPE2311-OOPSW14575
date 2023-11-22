/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Chickenfarm.model;

/**
 *
 * @author Antonio Revilla - CodingNinjas - DCCO ESPE
 */
public class ChickenCoop {
    private int id;
    private Chicken[] chickens = new Chicken[20];
    
    private int spaceI=0;
            
    public void add(Chicken chicken){
        if (spaceI < 20){
            chickens[spaceI] = chicken;
            spaceI++;
            System.out.println("Successfully added");
        }else{
            system.out.println("Chicken coop full");
        }
        
    }
    public void remove(int chickenId){
    }
    public void resetIteration(){
    }
    public Chicken next(){
        return null;
    }
}