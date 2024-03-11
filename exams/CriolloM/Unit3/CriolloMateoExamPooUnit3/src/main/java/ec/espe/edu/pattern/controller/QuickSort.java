
package ec.espe.edu.pattern.controller;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class QuickSort implements SortingStrategy{

    @Override
    public int[] sort(int[] data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int[] sort(int[] data, int low, int high) {
         if (low < high) {
            int pi = partition(data, low, high);
            sort(data, low, pi - 1);
            sort(data, pi + 1, high);
        }
        return data;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {


            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
    
    

}
