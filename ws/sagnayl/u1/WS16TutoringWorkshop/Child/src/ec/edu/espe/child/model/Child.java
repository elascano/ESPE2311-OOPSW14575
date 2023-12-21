package ec.edu.espe.child.model;

import java.util.List;

/**
 *
 * @author Luis Sagnay
 */
public class Child {
    private int id;
    private String name;
    private List<School> schools;
    private boolean isStuding;

    @Override
    public String toString() {
        return "Child{" + "id=" + getId() + ", name=" + getName() + ", schools=" + getSchools() + ", isStuding=" + isIsStuding() + '}';
    }

    public Child(int id, String name, List<School> schools, boolean isStuding) {
        this.id = id;
        this.name = name;
        this.schools = schools;
        this.isStuding = isStuding;
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the schools
     */
    public List<School> getSchools() {
        return schools;
    }

    /**
     * @param schools the schools to set
     */
    public void setSchools(List<School> schools) {
        this.schools = schools;
    }

    /**
     * @return the isStuding
     */
    public boolean isIsStuding() {
        return isStuding;
    }

    /**
     * @param isStuding the isStuding to set
     */
    public void setIsStuding(boolean isStuding) {
        this.isStuding = isStuding;
    }
    
    

}
