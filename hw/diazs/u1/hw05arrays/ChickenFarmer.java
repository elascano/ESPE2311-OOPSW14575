public class ChickenFarmer{
	private String name;
	private ChickenCoop[] coops;

	public void add(ChickenCoop coop);
	public void remove(int coopId);
	public void restIteration();
	public ChickenCoop next();
}