package ec.edu.espe.exam.controller;

/**
 *
 * @author Criollo Sebastian
 */
public interface SortingStrategy {

    public int[] sort(int data[]);
    public int[] sort(int data[],int low, int high);
    
}
