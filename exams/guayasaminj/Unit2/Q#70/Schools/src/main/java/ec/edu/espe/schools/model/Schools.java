

package ec.edu.espe.schools.model;

/**
 *
 * @author JosuéG
 */

public class Schools {
    private int id;
    private String nameOftheSchool;
    private String direccion;
    private int numberOfStudents;

    public Schools(int id, String nameOftheSchool, String direccion, int numberOfStudents) {
        this.id = id;
        this.nameOftheSchool = nameOftheSchool;
        this.direccion = direccion;
        this.numberOfStudents = numberOfStudents;
    }

    @Override
    public String toString() {
        return "Schools{" + "id=" + id + ", nameOftheSchool=" + nameOftheSchool + ", direccion=" + direccion + ", numberOfStudents=" + numberOfStudents + '}';
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOftheSchool() {
        return nameOftheSchool;
    }

    public void setNameOftheSchool(String nameOftheSchool) {
        this.nameOftheSchool = nameOftheSchool;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }
    
}
