/**
 *
 * @author Jefferson David Yepez Moran, Bit Coderz, DCCO -ESPE
 */
public class ChickenCoop {
    
    private int id;
    private Chicken[] chickens = new Chicken[20];
    
    private int index = 0;

    public void add(Chicken chicken) {
        if (isFull()) {
            System.out.println("There are no spaces left in the chicken coop. Cannot add more chickens.");
        } else {
            chickens[index++] = chicken;
            System.out.println("Chicken was added");
        }
    }

    private boolean isFull() {
        return index >= chickens.length;
    }
    
    public void remove(int chickenId){
        
    }
    public void resetIteration(){
        
    }
    public Chicken next(){
        return null;
    }

}
