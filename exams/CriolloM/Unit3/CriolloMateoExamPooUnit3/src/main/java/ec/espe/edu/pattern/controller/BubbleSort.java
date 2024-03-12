
package ec.espe.edu.pattern.controller;


public class BubbleSort implements SortingStrategy{
    @Override
    public int[] sort(int data[]){
        int n = data.length;
        for (int i= 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        /* This code is contributed by Parzibyte */
        return data;
        
    }

    @Override
    public int[] sort(int[] data, int low, int high) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
