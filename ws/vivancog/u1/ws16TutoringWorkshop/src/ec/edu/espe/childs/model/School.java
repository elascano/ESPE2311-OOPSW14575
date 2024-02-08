<<<<<<<< HEAD:ws/cepedad/Unit 1/WS16TutoringWorkshop/Child/src/ec/edu/espe/child/model/School.java
package ec.edu.espe.child.model;

/**
 *
 * @author David
 */
public class School {
    private int id;
    private String name;
========
package ec.edu.espe.childs.model;

/**
 *
 * @author Admin
 */
class School {
    int id;
    String name;
>>>>>>>> 3105831e9d4737ff3c9dddc8cf7c841ad97c3452:ws/vivancog/u1/ws16TutoringWorkshop/src/ec/edu/espe/childs/model/School.java

    public School(int id, String name) {
        this.id = id;
        this.name = name;
    }

<<<<<<<< HEAD:ws/cepedad/Unit 1/WS16TutoringWorkshop/Child/src/ec/edu/espe/child/model/School.java
    @Override
    public String toString() {
        return "Schools{" + "id=" + id + ", name=" + name + '}';
    }

    /**
     * @return the id
     */
========
>>>>>>>> 3105831e9d4737ff3c9dddc8cf7c841ad97c3452:ws/vivancog/u1/ws16TutoringWorkshop/src/ec/edu/espe/childs/model/School.java
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
<<<<<<<< HEAD:ws/cepedad/Unit 1/WS16TutoringWorkshop/Child/src/ec/edu/espe/child/model/School.java
    
========

    @Override
    public String toString() {
        return "School{" + "id=" + id + ", name=" + name + '}';
    }
>>>>>>>> 3105831e9d4737ff3c9dddc8cf7c841ad97c3452:ws/vivancog/u1/ws16TutoringWorkshop/src/ec/edu/espe/childs/model/School.java
    
    
}
