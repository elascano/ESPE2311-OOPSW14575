package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author Edison Lascano, The Javas, DCCO-ESPE
 */
public class ChickenCoop {
    int id;
    Chicken chickens[] = new Chicken[20];
    
    public void add(Chicken chicken){
        //TODO add the cicken to the array chickens
        System.out.println(chickens.length);
        chickens[0]= chicken;
    }
    
}
