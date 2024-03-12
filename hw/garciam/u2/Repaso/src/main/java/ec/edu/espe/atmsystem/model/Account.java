package ec.edu.espe.atmsystem.model;

/**
 *
 * @author mateo
 */
public class Account {
    private int id;
    private String owner;
    private float ammount;

    public Account(int id, String owner, float ammount) {
        this.id = id;
        this.owner = owner;
        this.ammount = ammount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public float getAmmount() {
        return ammount;
    }

    public void setAmmount(float ammount) {
        this.ammount = ammount;
    }
    
    
}
