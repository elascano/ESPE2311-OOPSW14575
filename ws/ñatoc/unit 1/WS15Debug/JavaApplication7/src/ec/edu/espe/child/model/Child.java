
package ec.edu.espe.child.model;
import java.util.Arrays;
import ec.edu.espe.child.model.School;

/**
 *
 * @author Carlos Ñato, The Javas, DCC-ESPE
 */
public class Child {
    private int id;
    private String name;
    private School[] schools;
    private boolean isStudyng;

    public Child(int id, String name, School[] schools, boolean isStudyng) {
        this.id = id;
        this.name = name;
        this.schools = schools;
        this.isStudyng = isStudyng;
    }

    @Override
    public String toString() {
        return "Child{" + "id=" + id + ", name=" + name + ", schools=" + Arrays.toString(schools) + ", isStudyng=" + isStudyng + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public School[] getSchools() {
        return schools;
    }

    public void setSchools(School[] schools) {
        this.schools = schools;
    }

    public boolean isIsStudyng() {
        return isStudyng;
    }

    public void setIsStudyng(boolean isStudyng) {
        this.isStudyng = isStudyng;
    }
    
    
    
}

