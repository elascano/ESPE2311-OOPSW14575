
package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author Carlos Ñato,CodingNinjas,DCCO-ESPE
 */

public class Chicken {
    int id;
    String name;
    String color;
    int age;
    boolean IsMolting;
    
    public void doStuff(int forTime){}
    private void cluck(){}
    private void wander(){}
    private void eat(){}
    private void drink(){}
    public Poop poop(){
        return new Poop();
    }
    public Egg layAnEgg(){
        return new Egg();
    
    }  
}
