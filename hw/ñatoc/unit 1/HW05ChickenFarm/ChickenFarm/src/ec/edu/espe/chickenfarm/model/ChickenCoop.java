
package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author Carlos Ñato, Coding Ninjas, DCC-ESPE
 */
public class ChickenCoop {
    private int id;
    private Chicken[] chicken = new Chicken[20];

    public ChickenCoop(int id) {
        this.id = id;
      
    }
    public void addchicken(Chicken chicke){
        for(int i = 0; i <= chicken.length ; i++){
            System.out.println("Enter caracteristic of the chicken"+(i + 1)+":");
        }
       
    }
    

    @Override
    public String toString() {
        return "ChickenCoop{" + "id=" + id + ", chicken=" + chicken + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Chicken[] getChicken() {
        return chicken;
    }

    public void setChicken(Chicken[] chicken) {
        this.chicken = chicken;
    }
    
    
    
    
    
    
}
