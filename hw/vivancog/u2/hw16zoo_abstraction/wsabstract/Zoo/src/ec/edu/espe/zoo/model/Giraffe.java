package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Giraffe extends Mammal{
    
    public Giraffe(int numberOfMammaryGlands, int id, String scientificName, Date bornDate, int cageId, String spine, int numberOfBones) {
        super(numberOfMammaryGlands, id, scientificName, bornDate, cageId, spine, numberOfBones);
    }
    
    @Override
    public void feed() {
        System.out.println("feeding platypus with grass");        
    }
    
    @Override
    public void breastfeed(){
        System.out.println("giraffe is breastfeeding"); 
    }
    
    //POLYMORPHISM
    //polymmorphic objects
    //overriding
    //overloading
    
    public void breastfeed(int calf){
        System.out.println("giraffe is breastfeeedin its calf number ---"+ calf);
    }

    @Override
    public String toString() {
        return "Giraffe{" + super.toString() +'}';
    }
    
    
    public void brushNeck(){
        System.out.println("brushing the neck of giraffe");
    }

    @Override
    public void vocalization() {
        System.out.println("Don't make particular vocalization");
    }
    
    
}
