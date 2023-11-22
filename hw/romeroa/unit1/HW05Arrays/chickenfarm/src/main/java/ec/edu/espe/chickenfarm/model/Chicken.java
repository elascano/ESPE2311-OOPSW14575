package ec.edu.espe.chickenfarm.model;

import java.util.Date;

/**
 * @author Andrés Romero, NullPointerException, DCCO-ESPE
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private int age;
    private boolean isMolting;
    private Date bornOnDate;

    public void doStuff(int forTime) {
    };

    private void cluck() {
    };

    private void wander() {
    };

    private void eat() {
    };

    private void drink() {
    };

    private Poop poop() {
        return new Poop();
    };

    private Egg layAnEgg() {
        return new Egg();
    };
}
