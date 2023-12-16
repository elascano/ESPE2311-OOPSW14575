package ec.edu.espe.icecreamsystem.model;




/**
 *
 * @author JuanGranda,Error 404,DCCO-ESPE
 */
public class IceCream {
    private int id;
    private String name;
    private String flavor;
    private float cost;

    public IceCream(int id, String name, String flavor, float cost) {
        this.id = id;
        this.name = name;
        this.flavor = flavor;
        this.cost = cost;
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

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "IceCream{" + "id=" + id + ", name=" + name + ", flavor=" + flavor + ", cost=" + cost + '}';
    }
    
}
