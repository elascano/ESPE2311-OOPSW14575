package ec.edu.espe.parent.model;

/**
 *
 * @author mateo
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

    @Override
    public String toString() {
        String objectString = "Parent{" + "id=" + id + ", name=" + name;
        if (parents != null) {
            objectString += ", parents=[";
            for (Parent x : parents) {
                objectString += x.toString();
            }
            objectString += "]";
        }
        objectString += ", isStuding=" + isStuding + "}";
        return objectString;

    }

}
