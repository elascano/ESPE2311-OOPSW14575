
package ec.ecu.espe.strategy.controller;

public class BubbleSort implements SortingStrategy{

    @Override
    public int[] sort(int[] data) {
        int size = data.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        
        return data;
    }
    
}
