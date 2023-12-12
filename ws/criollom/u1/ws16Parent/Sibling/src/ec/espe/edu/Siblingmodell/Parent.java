
package ec.espe.edu.Siblingmodell;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author MateoCriollo
 */
public class Parent {
    private int id;
    private String name;
    private ArrayList<Parent> parents=new ArrayList<>();
    private boolean isStudying;

    public Parent(int id, String name, boolean isStudying) {
        this.id = id;
        this.name = name;
        this.isStudying = isStudying;
    }

    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append("Parent{");
        sb.append("id=").append(id);
        sb.append("name=").append(name);
        if(!hasParents(this.parents)){
        sb.append(",parents=").append(parents);
        }
        sb.append("isStudying=").append(isStudying);
        sb.append('}');
        return sb.toString();
    }

    private boolean hasParents(ArrayList<Parent> parents){
        return parents==null;
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
     * @return the parent
     */
    public ArrayList<Parent> getParent() {
        return parents;
    }

    /**
     * @param parent the parent to set
     */
    public void setParent(ArrayList<Parent> parent) {
        this.parents = parent;
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
    
    
}
