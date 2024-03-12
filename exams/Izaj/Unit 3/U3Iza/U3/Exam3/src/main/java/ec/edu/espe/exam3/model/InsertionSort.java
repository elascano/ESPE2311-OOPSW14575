package ec.edu.espe.exam3.model;

/**
 *
 * @author Mateo Iza
 */
public class InsertionSort implements SortingStrategy {

    @Override
    public int[] sort(int[] arr) {

        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;     
        }
        return arr;
    }

    @Override
    public int[] sort(int[] data, int low, int high) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
