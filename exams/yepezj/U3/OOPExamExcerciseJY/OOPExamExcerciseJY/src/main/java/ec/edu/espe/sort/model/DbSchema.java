package ec.edu.espe.sort.model;

import java.util.ArrayList;

/**
 *
 * @author Jefferson Yepez - Bit Coderz - DCCO ESPE
 */
public class DbSchema {
    private ArrayList<Integer> unsorted;
    private ArrayList<Integer> sorted;
    private String sortAlgorithm;

    public DbSchema(ArrayList<Integer> unsorted, ArrayList<Integer> sorted, String sortAlgorithm) {
        this.unsorted = unsorted;
        this.sorted = sorted;
        this.sortAlgorithm = sortAlgorithm;
    }
    

}
