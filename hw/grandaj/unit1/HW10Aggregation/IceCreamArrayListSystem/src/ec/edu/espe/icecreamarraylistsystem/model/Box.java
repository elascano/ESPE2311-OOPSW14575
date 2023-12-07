
package ec.edu.espe.icecreamarraylistsystem.model;

import java.util.ArrayList;

/**
 *
 * @author JuanGranda,Error 404,DCCO-ESPE
 */
public class Box {
    private int id;
    private String name;
    private int amountOfIceCream;
    private float cost;
    private ArrayList<IceCream> icecreams;

    public Box(int id, String name, int amountOfIceCream, float cost, ArrayList<IceCream> icecreams) {
        this.id = id;
        this.name = name;
        this.amountOfIceCream = amountOfIceCream;
        this.cost = cost;
        this.icecreams = icecreams;
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

    public int getAmountOfIceCream() {
        return amountOfIceCream;
    }

    public void setAmountOfIceCream(int amountOfIceCream) {
        this.amountOfIceCream = amountOfIceCream;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public ArrayList<IceCream> getIcecreams() {
        return icecreams;
    }

    public void setIcecreams(ArrayList<IceCream> icecreams) {
        this.icecreams = icecreams;
    }

    @Override
    public String toString() {
        String box = null;
        box = "Box{" + "id=" + id + ", name=" + name + ", amountOfIceCream=" + amountOfIceCream + ", cost=" + cost + ", icecreams="; 
        for(IceCream iceCream : icecreams){
            box = box + iceCream;
        } 
        box = box + "}";
        return box;
        }
}
