package ec.edu.espe.child.model;

import java.util.Arrays;

/**
 *
 * @author David
 */
public class Child {
    private int id;
    private String name;
    private boolean isStuding;
    private School[] schools;

    public Child(int id, String name, boolean isStuding, School[] schools) {
        this.id = id;
        this.name = name;
        this.isStuding = isStuding;
        this.schools = schools;
    }

    @Override
    public String toString() {
        return "Child {id=" + id + ", name=" + name + ", isStuding=" + isStuding + ", schools=" + Arrays.toString(schools) + '}';
    }
    
    

}
   