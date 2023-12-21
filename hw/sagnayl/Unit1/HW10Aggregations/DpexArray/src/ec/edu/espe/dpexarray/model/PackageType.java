package ec.edu.espe.dpexarray.model;

/**
 *
 * @author Luis Sagnay
 */
public class PackageType {
    private int id;
    private String type;

    public PackageType(int id, String type) {
        this.id = id;
        this.type = type;
    }

    @Override
    public String toString() {
        return "PackageType{" + "id=" + getId() + ", type=" + getType() + '}';
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
    
    
}
