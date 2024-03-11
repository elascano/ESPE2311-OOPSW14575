package ec.edu.espe.exam3.model;

/**
 *
 * @author Luis Sagnay
 */
public interface SortingStrategy {
    public int[] sort(int data[]);
    public int[] sort(int data[],int low, int high);
    
}