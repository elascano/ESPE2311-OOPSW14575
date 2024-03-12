
package ec.edu.espe.exam3.model;

import java.util.ArrayList;

/**
 *
 * @author Fréderick Tipán
 */
public class SortArray {

    private ArrayList<Integer> unsortedData;
    private int size;
    private String sortAlgorithm;
    private ArrayList<Integer> sortedData;

    public SortArray(ArrayList<Integer> unsortedData, String sortAlgorithm, ArrayList<Integer> sortedData) {
        this.unsortedData = unsortedData;
        this.sortAlgorithm = sortAlgorithm;
        this.sortedData = sortedData;
        this.size = unsortedData.size();
    }
    
    /**
     * @return the unsortedData
     */
    public ArrayList<Integer> getUnsortedData() {
        return unsortedData;
    }

    /**
     * @param unsortedData the unsortedData to set
     */
    public void setUnsortedData(ArrayList<Integer> unsortedData) {
        this.unsortedData = unsortedData;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the sortAlgorithm
     */
    public String getSortAlgorithm() {
        return sortAlgorithm;
    }

    /**
     * @param sortAlgorithm the sortAlgorithm to set
     */
    public void setSortAlgorithm(String sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    /**
     * @return the sortedData
     */
    public ArrayList<Integer> getSortedData() {
        return sortedData;
    }

    /**
     * @param sortedData the sortedData to set
     */
    public void setSortedData(ArrayList<Integer> sortedData) {
        this.sortedData = sortedData;
    }
    
    

    
}
