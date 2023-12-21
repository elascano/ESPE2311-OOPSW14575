package ec.edu.espe.dpexarraylist.model;

import java.util.ArrayList;

/**
 *
 * @author Luis Sagnay
 */
public class Shipping {
    private String dispatchDate;
    private String arrivalDate;
    private ArrayList<Package>packages;

    public Shipping(String dispatchDate, String arrivalDate, ArrayList<Package> packages) {
        this.dispatchDate = dispatchDate;
        this.arrivalDate = arrivalDate;
        this.packages = packages;
    }

    @Override
    public String toString() {
        return "Shipping{" + "dispatchDate=" + getDispatchDate() + ", arrivalDate=" + getArrivalDate() + ", packages=" + getPackages() + '}';
    }

    /**
     * @return the dispatchDate
     */
    public String getDispatchDate() {
        return dispatchDate;
    }

    /**
     * @param dispatchDate the dispatchDate to set
     */
    public void setDispatchDate(String dispatchDate) {
        this.dispatchDate = dispatchDate;
    }

    /**
     * @return the arrivalDate
     */
    public String getArrivalDate() {
        return arrivalDate;
    }

    /**
     * @param arrivalDate the arrivalDate to set
     */
    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    /**
     * @return the packages
     */
    public ArrayList<Package> getPackages() {
        return packages;
    }

    /**
     * @param packages the packages to set
     */
    public void setPackages(ArrayList<Package> packages) {
        this.packages = packages;
    }
    
    
}
