package ec.edu.espe.persons.model;

/**
 *
 * @author JuanGranda,Error 404,DCCO-ESPE
 */
public class Person {

    private int id;
    private int addend1;
    private int addend2;

    public Person(int id, int addend1, int addend2) {
        this.id = id;
        this.addend1 = addend1;
        this.addend2 = addend2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAddend1() {
        return addend1;
    }

    public void setAddend1(int addend1) {
        this.addend1 = addend1;
    }

    public int getAddend2() {
        return addend2;
    }

    public void setAddend2(int addend2) {
        this.addend2 = addend2;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", addend1=" + addend1 + ", addend2=" + addend2 + '}';
    }


    
    
}
