
package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author JuanGranda,Error 404,DCCO-ESPE
 */
public class ChickenCoop {
    int id;
    Chicken[] chickens = new Chicken[20];
    int numberChicken = 0;
    
    public void add(Chicken chicken){
        if (numberChicken >= chickens.length){
            System.out.println("The number of chickens it is"+chickens.length);
        }else{
            chickens[numberChicken] = chicken;
            numberChicken = numberChicken + 1;   
        }
    }
    public void romove(int chicken){}
    public void resetlteration(){}
    public ChickenCoop next(){
    return null;
    }
}



