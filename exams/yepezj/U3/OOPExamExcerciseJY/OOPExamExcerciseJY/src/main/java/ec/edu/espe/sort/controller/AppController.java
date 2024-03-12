package ec.edu.espe.sort.controller;

import ec.edu.espe.sort.model.BubbleSort;
import java.util.ArrayList;

/**
 *
 * @author Jefferson Yepez - Bit Coderz - DCCO ESPE
 */
public class AppController {

    public int numbersLength = 0;
    public static String getBestSortAlgorithm = "";
    ArrayList<Integer> sortedNumbers = new ArrayList<>();
    ArrayList<Integer> unsortedNumbers = new ArrayList<>();

    public void converStringIntoSetOfNumber(String number) {
        String[] numbers = number.split(",");
        numbersLength = numbers.length;
        //TODO: Conver to int
        for (int i = 0; i < numbers.length; i++) {
            unsortedNumbers.add(Integer.parseInt(numbers[i]));
            System.out.println("number: " + numbers[i]);
            System.out.println("There is " + numbersLength + "numbers");
        }

    }

    public void getBestOptionToSort() {
        if (numbersLength >= 2 && numbersLength <= 5) {
            getBestSortAlgorithm = "Bubble Sort";
            BubbleSort bubbleSort = new BubbleSort();
            sortedNumbers = bubbleSort.sort(unsortedNumbers);
        } else if (numbersLength >= 6 && numbersLength <= 10) {
            BubbleSort bubbleSort = new BubbleSort();
            sortedNumbers = bubbleSort.sort(unsortedNumbers);
            getBestSortAlgorithm = "Insertion Sort";
            
        } else {
            BubbleSort bubbleSort = new BubbleSort();
            sortedNumbers = bubbleSort.sort(unsortedNumbers);
            getBestSortAlgorithm = "QuickSort";
            
        }
    }

    public ArrayList<Integer> getSortedNumbers() {
        return sortedNumbers;
    }

    public ArrayList<Integer> getUnsortedNumbers() {
        return unsortedNumbers;
    }
    
    

    public void uploadToDatabase() {

    }
}
