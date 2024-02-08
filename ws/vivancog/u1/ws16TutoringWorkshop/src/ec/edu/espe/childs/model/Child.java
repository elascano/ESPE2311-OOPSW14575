package ec.edu.espe.childs.model;

import java.util.Arrays;

/**
 *
 * @author Gabriel Vivanco
 */
public class Child {
    private int id;
    private String name;    
    private School schools[];
    private boolean isStuding;

    public Child(int id, String name, School[] schools, boolean isStuding) {
        this.id = id;
        this.name = name;
        this.schools = schools;
        this.isStuding = isStuding;
    }

    @Override
    public String toString() {
        return "Child{" + "id=" + id + ", name=" + name + ", schools=" + schools + ", isStuding=" + isStuding + '}';
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

    public boolean isIsStuding() {
        return isStuding;
    }

    public void setIsStuding(boolean isStuding) {
        this.isStuding = isStuding;
    }

    
}
