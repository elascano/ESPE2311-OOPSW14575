package ec.espe.edu.model;

/**
 *
 * @author Frederick - DCCO ESPE
 */
public class Parent {
    private int id;
    private String name;
    private Parent[] parents;
    private boolean isStuding;

    @Override
    public String toString() {
        String message="Parent: " + "\n id: " + id + "\n name: " + name + "\n parents: {";
        
        for(int i = 0;i<2;i++){
            message = message + "\n    id: " + parents[i].getId();
            message = message + ", name: " + parents[i].getName();
        }
        
        message = message + "\n  }\n Is Studing? " + isStuding;
        return message;
    }
    
    

    public Parent(int id, String name, Parent[] parents, boolean isStuding) {
        this.id = id;
        this.name = name;
        this.parents = parents;
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
     * @return the parents
     */
    public Parent[] getParents() {
        return parents;
    }

    /**
     * @param parents the parents to set
     */
    public void setParents(Parent[] parents) {
        this.parents = parents;
    }

    /**
     * @return the isStuding
     */
    public boolean getIsStuding() {
        return isStuding;
    }

    /**
     * @param isStuding the isStuding to set
     */
    public void setIsStuding(boolean isStuding) {
        this.isStuding = isStuding;
    }

    
    
}
