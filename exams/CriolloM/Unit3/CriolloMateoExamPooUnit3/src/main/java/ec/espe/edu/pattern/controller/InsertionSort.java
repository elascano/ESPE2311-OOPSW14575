
package ec.espe.edu.pattern.controller;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class InsertionSort implements SortingStrategy {

    @Override
    public int[] sort(int[] data) {
        int n = data.length;
        for (int i = 1; i < n; ++i) {
            int key = data[i];
            int j = i - 1;

            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = key;     
        }
        /* This code is contributed by Miguel Jaque Barbero */
        return data;
    }
    @Override
    public int[] sort(int[] data, int low, int high) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
