
package ec.espe.edu.zoo.model;

import java.util.Date;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class Giraffe extends Mammal {

    public Giraffe(int numberOfMammaryGlands, String spine, int numberOfbones, int id, String ciemtificName, Date bornOnDate, int cageId) {
        super(numberOfMammaryGlands, spine, numberOfbones, id, ciemtificName, bornOnDate, cageId);
    }

   @Override
    public void breastFeed(){
        System.out.println("girrafe is breast feeding");
    }
    
    public void breastFeed(int calf){
        System.out.println("giraffe is breat feed its calf number ->>"+calf);
    }
    
    
    @Override
    public String toString() {
        return "Giraffe{" + super.toString() +'}';
    }
    
    public void brushNeck (){
        System.out.println("He have long neck");
    }

    @Override
    public void feed() {
        System.out.println(" feeding giraffe with glass"); 
    }

    @Override
    public void breathe() {
        System.out.println("the giraffe breathes through the lungs"); 
    }
    
}
