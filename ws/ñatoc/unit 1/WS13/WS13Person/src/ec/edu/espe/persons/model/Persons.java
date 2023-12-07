package ec.edu.espe.persons.model;


/**
 *
 * @author Carlos Ñato, The Javas, DCC-ESPE
 */
public class Persons {
    private int addend1;
    private int addend2;
    private int id;

    @Override
    public String toString() {
        return "Persons{" + "addend1=" + addend1 + ", addend2=" + addend2 + ", id=" + id + '}';
    }
    
    

    public Persons(int addend1, int addend2, int id) {
        this.addend1 = addend1;
        this.addend2 = addend2;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
    
            }
  

   