public class ChickenCoop{
	private int id;
	private Chicken[] chickens;
	
	public void add(Chicken chicken);
	public void remove(int chicken Id);
	public void resetIteration();
	public Chicken next();
}