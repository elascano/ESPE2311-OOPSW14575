package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author Carlos Ñato, Coding Ninjas, DCC-ESPE
 */
public class ChickenFarm {

    private int id;
    private ChickenCoop[] coop = new ChickenCoop[5];

    public ChickenFarm(int id) {
        this.id = id;

    }

    @Override
    public String toString() {
        return "ChickenFarm{" + "id=" + id + ", coop=" + coop + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ChickenCoop[] getCoop() {
        return coop;
    }

    public void setCoop(ChickenCoop[] coop) {
        this.coop = coop;
    }

}
