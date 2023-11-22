/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Chickenfarm.model;

/**
 *
 * @author Antonio Revilla - CodingNinjas - DCCO ESPE
 */
public class ChickenFarmer {
    private String name;
    private ChickenCoop[] coops = new ChickenCoop[5];
    
    private int spaceI=0;
    
    public void add(ChickenCoop coop){
        if(spaceI>(coops.length -1)){
            System.out.println("There are no spaces in the chicken coop");
        }else{
            coops [spaceI] = coop;
            spaceI++;
            System.out.println("Successfully added");
        }
    }
    public void remove(int coopld){
    }     
    public void restlteration(){
    }
    public ChickenCoop next(){
        return null;
    }
}
