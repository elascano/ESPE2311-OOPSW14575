/**
 *
 * @author Jefferson David Yepez Moran, Bit Coderz, DCCO -ESPE
 */
public class ChickenFarmer {
    
    private String name;
    private ChickenCoop[] coops = new ChickenCoop[5];
    
    private int index = 0;

    public void add(ChickenCoop coop) {
        if (isFull()) {
            System.out.println("Cannot add more chicken coops. The farm is full.");
        } else {
            coops[index++] = coop;
            System.out.println("Chicken coop was added");
        }
    }

    private boolean isFull() {
        return index >= coops.length;
    }
    
    public void remove(int coopId){
        
    }
    public void resetIteration(){
        
    }
    public ChickenCoop next(){
        return null;
    }

}
