/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarview;

import ec.edu.espe.chickenfarmmodel.Chicken;
import java.util.Date;

/**
 *
 * @author MateoCriollo
 */
public class ChickenFarmSystem {
    
    public static void main(String[] args) {
        
    int id=1;
    String name="Lucy";
    String color="white and black";
    boolean isMolting=false;
    Date bornOnDate=new Date();
        
        Chicken chicken = new Chicken(name, id, color, id, isMolting, bornOnDate);
        System.out.println("Chicken-->"+chicken);
        
        chicken.doStuff(5);
        
    }
    
    
    
}
