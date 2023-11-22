package ec.edu.espe.Chickenfarm.model;
/**
 *
 * @author Gabriel Vivanco - Bit Coderz - DCCO ESPE
 */
public class Chicken {
  private int id;
  private String name;
  private String color;
  private int age;
  private boolean isMolting;
  
  public void doStuff(int forTime);
  private void cluck();
  private void wander();
  public void eat();
  public void drink();
  private Poop poop();
  private Egg layAnEgg();
}
