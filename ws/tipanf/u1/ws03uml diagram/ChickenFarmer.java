public class ChickenFarmer{
	private String name;
	private ChickenCoop[] coops;

	public void add(ChickenCoop coop);
	public void remove(int coopId);
	public void resetIteration();
	public ChickenCoop next();
}