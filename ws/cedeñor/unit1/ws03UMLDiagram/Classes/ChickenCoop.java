package ChickenFarm;

/*
@author Rony Cedeño,INTERBYTE,DCCO ESPE_14575
*/
 
public class ChickenCoop {
    private int id;
    private Chicken[] chickens;

    public void add(Chicken chicken){};
    public void remove(int chickenId){};
    public void resetIteration(){};
    public Chicken next(){
        return new Chicken();
    };
}
