package ec.edu.espe.Arrays.model;

import java.util.ArrayList;
import java.util.Arrays;


/**
 *
 * @author Gabriel Vivanco
 */
public class Staff {
    private int id;
    private String type;
    //private Equipment[] equipments;
    private ArrayList<Equipment> equipments;
    
    

    public Staff(int id, String type, ArrayList<Equipment> equipments) {
        this.id = id;
        this.type = type;
        this.equipments = equipments;
    }

    @Override
    public String toString() {
        return "Staff{" + "id=" + getId() + ", type=" + getType() + ", equipments=" + getEquipments() + '}';
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
     * @return the equipments
     */
    public ArrayList<Equipment> getEquipments() {
        return equipments;
    }

    /**
     * @param equipments the equipments to set
     */
    public void setEquipments(ArrayList<Equipment> equipments) {
        this.equipments = equipments;
    }
    
    



    
}
