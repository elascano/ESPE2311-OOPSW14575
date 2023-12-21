
package ec.edu.espe.model;

/**
 *
 * @author Alex Cuzco, HoneyBadgers, DCCO-ESPE
 */
public class DataStudents {
    int id; //number of the list
    String name;
    String carrer;

    @Override
    public String toString() {
        return "DataStudents{" + "id=" + id + ", name=" + name + ", carrer=" + carrer + '}';
    }
    

    public DataStudents(int id, String name, String carrer) {
        this.id = id;
        this.name = name;
        this.carrer = carrer;
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

    public String getCarrer() {
        return carrer;
    }

    public void setCarrer(String carrer) {
        this.carrer = carrer;
    }


   
    
    
}
