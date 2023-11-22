package ec.edu.espe.Chickenfarm.model;
/**
 *
 * @author Gabriel Vivanco - Bit Coderz - DCCO ESPE
 */
public class ChickenFarmer {
  private String name;
  private ChickenCoop[] coops;

  public void add(ChickenCoop coop);
  public void remove(int coopId);
  public void resetIteration();
  public void ChickenCoop next();

}
