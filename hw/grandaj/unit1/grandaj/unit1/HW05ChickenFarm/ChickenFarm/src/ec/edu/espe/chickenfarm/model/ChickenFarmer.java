
package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author JuanGranda,Error 404,DCCO-ESPE
 */
public class ChickenFarmer {
    String name ;
    ChickenCoop[] coops = new ChickenCoop[5];
    int numberCoop = 0;
    
    public void add(ChickenCoop coop){
        if (numberCoop >= coops.length){
            System.out.println("The number of Chicken coop exceded " + coops.length);
        }else{
            coops[numberCoop] =  coop;
            numberCoop = numberCoop + 1;
            System.out.println("Chicked coop added");
        }
    
    
    }
    public void romove(int coopld){}
    public void resetlteration(){}
    public ChickenCoop next(){
    return null;
    }
}
