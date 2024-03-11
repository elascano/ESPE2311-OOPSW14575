
package ec.espe.edu.pattern.model;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class ListNumber {
    private int unsorted[];
    private int size;
    private String sortAlgorithm;
    private int sorted[];

    public ListNumber(int[] unsorted, int size, String sortAlgorithm, int[] sorted) {
        this.unsorted = unsorted;
        this.size = size;
        this.sortAlgorithm = sortAlgorithm;
        this.sorted = sorted;
    }

    public int[] getUnsorted() {
        return unsorted;
    }

    public void setUnsorted(int[] unsorted) {
        this.unsorted = unsorted;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getSortAlgorithm() {
        return sortAlgorithm;
    }

    public void setSortAlgorithm(String sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int[] getSorted() {
        return sorted;
    }

    public void setSorted(int[] sorted) {
        this.sorted = sorted;
    }
    
    
}
