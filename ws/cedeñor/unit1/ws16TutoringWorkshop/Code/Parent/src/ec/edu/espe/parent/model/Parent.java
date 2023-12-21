package ec.edu.espe.parent.model;

import java.util.List;

/*
@author Rony Cedeño,INTERBYTE,DCCO ESPE_14575
 */
public class Parent {

    private int id;
    private String name;
    private boolean isStudying;
    private List<Parent> parents;

    @Override
    public String toString() {
        String string = "Parent{" + "id=" + getId() + ", name= " + getName();
        if (getParents() != null) {
            string = string + ", parents=[";
            for (Parent x : getParents()) {
                string = string + x.toString();
            }
            string = string + "]";
        }
        string = string + ", isStudying=" + isIsStudying() + "}";
        return string;
    }

    public Parent(int id, String name, boolean isStudying, List<Parent> parents) {
        this.id = id;
        this.name = name;
        this.isStudying = isStudying;
        this.parents = parents;
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
     * @return the isStudying
     */
    public boolean isIsStudying() {
        return isStudying;
    }

    /**
     * @param isStudying the isStudying to set
     */
    public void setIsStudying(boolean isStudying) {
        this.isStudying = isStudying;
    }

    /**
     * @return the parents
     */
    public List<Parent> getParents() {
        return parents;
    }

    /**
     * @param parents the parents to set
     */
    public void setParents(List<Parent> parents) {
        this.parents = parents;
    }

}
