
package ec.ecu.espe.strategy.controller;

public class QuickSort implements SortingStrategy{

    @Override
    public int[] sort(int[] data) {
        int sortedData[];

        sortedData=quickSort(data, 0, data.length - 1);
        return sortedData;
    }
    
    private int[] quickSort(int[] data, int low, int high) {

        if (low < high) {
            int part = partition(data, low, high);
            quickSort(data, low, part - 1);
            quickSort(data, part + 1, high);
        }
        
        return data;

    }

    static int partition(int[] data, int low, int high) {
        int pivot = data[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (data[j] <= pivot) {
                i++;
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }
        int temp = data[i + 1];
        data[i + 1] = data[high];
        data[high] = temp;
        return i + 1;
    }
}
