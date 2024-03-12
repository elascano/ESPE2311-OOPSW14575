package ec.edu.espe.sort.model;

import java.util.ArrayList;

/**
 *
 * @author mateo
 */
public class QuickSort extends SortingStrategy {

    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> unsortedSet) {
        int [] arr = new int[unsortedSet.size()];
        for(int i =0 ; i < unsortedSet.size(); i ++){
            arr[0] = unsortedSet.indexOf(i);
        }
        ArrayList<Integer> sortedNumber = new ArrayList<>();


        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements  
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        for (int i = 0; i < n; i++) {
            sortedNumber.add(arr[i]);
        }
        return sortedNumber;

    }

}
