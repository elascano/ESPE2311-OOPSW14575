package ec.edu.espe.array.model;

import java.util.ArrayList;

/**
 *
 * @author Jefferson David Yepez Moran, Bit Coderz, DCCO -ESPE
 */
public class Staff {
    private int id;
    private String type;
    private String workday;
    private String employees;
    private float totalStaffCost;

    @Override
    public String toString() {
        return "\n * id=" + id + ", type=" + type + ", workday=" + workday + ", employees=" + employees + ", totalStaffCost=" + totalStaffCost + '}';
    }

    public Staff(int id, String type, String workday, String employees, float totalStaffCost) {
        this.id = id;
        this.type = type;
        this.workday = workday;
        this.employees = employees;
        this.totalStaffCost = totalStaffCost;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the workday
     */
    public String getWorkday() {
        return workday;
    }

    /**
     * @param workday the workday to set
     */
    public void setWorkday(String workday) {
        this.workday = workday;
    }

    /**
     * @return the employees
     */
    public String getEmployees() {
        return employees;
    }

    /**
     * @param employees the employees to set
     */
    public void setEmployees(String employees) {
        this.employees = employees;
    }

    /**
     * @return the totalStaffCost
     */
    public float getTotalStaffCost() {
        return totalStaffCost;
    }

    /**
     * @param totalStaffCost the totalStaffCost to set
     */
    public void setTotalStaffCost(float totalStaffCost) {
        this.totalStaffCost = totalStaffCost;
    }
    
    
}
