
package ec.espe.edu.pattern.controller;


public interface SortingStrategy {
    public int[] sort(int data[]);
    public int[] sort(int data[],int low, int high);
}
