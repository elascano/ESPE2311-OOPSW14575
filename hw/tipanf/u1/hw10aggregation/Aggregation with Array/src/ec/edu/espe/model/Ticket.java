package ec.edu.espe.model;

/**
 *
 * @author Frederick
 */
public class Ticket {
    private int id;
    private float value;
    private String code;

    @Override
    public String toString() {
        return "\n   id ---> " + id + "\n   value ---> $" + value + "\n   code ---> " + code;
    }
    
    

    public Ticket(int id, float value, String code) {
        this.id = id;
        this.value = value;
        this.code = code;
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
     * @return the value
     */
    public float getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(float value) {
        this.value = value;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }
    
    
    
}
