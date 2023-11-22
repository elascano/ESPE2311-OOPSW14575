/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author Carlos
 */
public class ChickenCoop {
    private int id;
    private Chicken[] chickens=new Chicken[20];
    
    private int space=1;
    public void add(Chicken chicken){
        if(space>(chickens.length)){
            System.out.println("Coop full");
        }else{
            chickens[space]=chicken;
            space++;
        }
    }
    public void remove(int chicken){           
    }
    public void resetiteration(){    
    }
    public ChickenCoop next(){
        return null;
    }
}
    
