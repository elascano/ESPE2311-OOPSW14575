package ec.edu.espe.icecreamsystem.model;

//import java.util.ArrayList;
/**
 *
 * @author JuanGranda,Error 404,DCCO-ESPE
 */
public class Box {

    private int id;
    private String name;
    private float amountOfIceCream;
    private float cost;
    private IceCream[] icecream;

    public Box(int id, String name, float amountOfIceCream, float cost,
            IceCream[] icecream) {
        this.id = id;
        this.name = name;
        this.amountOfIceCream = amountOfIceCream;
        this.cost = cost;
        this.icecream = icecream;
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

    public float getAmountOfIceCream() {
        return amountOfIceCream;
    }

    public void setAmountOfIceCream(float amountOfIceCream) {
        this.amountOfIceCream = amountOfIceCream;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public IceCream[] getIcecream() {
        return icecream;
    }

    public void setIcecream(IceCream[] icecream) {
        this.icecream = icecream;
    }

    @Override
    public String toString() {
        return "Box{" + "id=" + id + ", name=" + name + ", amountOfIceCream=" +
            amountOfIceCream + ", cost=" + cost + ", icecream=" + icecream + '}';
    }

}
