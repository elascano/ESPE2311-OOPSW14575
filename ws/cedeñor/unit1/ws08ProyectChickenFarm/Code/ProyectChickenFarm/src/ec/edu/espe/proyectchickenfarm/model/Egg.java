package ec.edu.espe.proyectchickenfarm.model;

/*
@author Rony Cedeño,INTERBYTE,DCCO ESPE_14575
 */
public class Egg {

    private int id;

    @Override
    public String toString() {
        return "Egg{" + "id=" + getId() + '}';
    }

    public Egg(int id) {
        this.id = id;
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

}
