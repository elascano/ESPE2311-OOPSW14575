/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author Carlos Hernandez,Error404,DCCO
 */
public class ChickenFarmer {
    private String name;
    private ChickenCoop[] coops=new ChickenCoop [5];
    private int spaceArray=1;
    
    public void add(ChickenCoop coop){
       if(spaceArray<(coops.length)){
           coops[spaceArray]=coop;
           spaceArray++;
       }else{
           System.out.println("Chicken Coop filled");
       } 
    }
    public void remove(int coop){
    }
    public void resetiteration(){
    }
    public ChickenCoop next(){
        return null;
    }
}
