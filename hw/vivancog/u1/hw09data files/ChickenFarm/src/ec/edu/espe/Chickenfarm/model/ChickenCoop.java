package ec.edu.espe.Chickenfarm.model;
/**
 *
 * @author Gabriel Vivanco - Bit Coderz - DCCO ESPE
 */
public class ChickenCoop {
  private int id;
  private Chicken[] chickens = new Chicken[20];
  
  private int space =1;

  public void add(Chicken chicken){
      if(space > (chickens.length)){
          System.out.println("Max capacity");
      }else{
            chickens[space]=chicken;
            space++;
      }
  }
  public void remove(int chickenId){
  }
  public void resetIteration(){
  }
  public Chicken next(){
    return null;
  }
}
