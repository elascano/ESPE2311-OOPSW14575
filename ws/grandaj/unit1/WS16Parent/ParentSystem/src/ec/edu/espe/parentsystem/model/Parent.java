
package ec.edu.espe.parentsystem.model;
import java.util.Arrays;
/**
 *
 * @author JuanGranda,Error 404,DCCO-ESPE
 */
public class Parent {
    private int id;
    private String name;
    private Parent[] parents;
    private boolean isStuding;

    public Parent(int id, String name, Parent[] parents, boolean isStuding) {
        this.id = id;
        this.name = name;
        this.parents = parents;
        this.isStuding = isStuding;
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

    public Parent[] getParents() {
        return parents;
    }

    public void setParents(Parent[] parents) {
        this.parents = parents;
    }

    public boolean isIsStuding() {
        return isStuding;
    }

    public void setIsStuding(boolean isStuding) {
        this.isStuding = isStuding;
    }

    @Override
    public String toString() {
        return "Parent{" + "id=" + id + ", name=" + name + ", parents=" + Arrays.toString(parents)+ ", isStuding=" + isStuding + '}';
    }

   
    
}





