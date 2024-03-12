
package ec.edu.espe.exam.controller;

/**
 *
 * @author Sebastian Criollo
 */
public class BubbleSort implements SortingStrategy {

    @Override
    public int[] sort(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        /* This code is contributed by Rajat Mishra. */
        return arr;
    }

    @Override
    public int[] sort(int[] data, int low, int high) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
