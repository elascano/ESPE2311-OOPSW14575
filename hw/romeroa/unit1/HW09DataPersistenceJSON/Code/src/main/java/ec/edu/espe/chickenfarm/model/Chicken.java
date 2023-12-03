package ec.edu.espe.chickenfarm.model;

import java.util.Calendar;

public class Chicken {
    private int id;
    private String name;
    private String color;
    private int birthYear;
    private int birthMonth;
    private int birthDay;
    private boolean isMolting;

    public Chicken(int id, String name, String color, int birthYear, int birthMonth, int birthDay, boolean isMolting) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.isMolting = isMolting;
    }

    private int computeAge() {
        final int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        final int currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;
        final int currentDay = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);

        int age = currentYear - birthYear;
        if (currentMonth < birthMonth || (currentMonth == birthMonth && currentDay < birthDay)) {
            age--;
        }
        return age;
    }

    @Override
    public String toString() {
        return "-> ID = " + id + ", name = " + name + ", color = " + color + ", age = " + computeAge() + " years (born on " + birthYear + "/" + birthMonth + "/" + birthDay + "), is molting = " + isMolting;
    }

    public String toCSVLine() {
        return this.id + ";" + this.name + ";" + this.color + ";" + this.birthYear + ";" + this.birthMonth + ";" + this.birthDay + ";" + this.isMolting;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return computeAge();
    }

    public boolean isMolting() {
        return isMolting;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int newBirthYear, int newBirthMonth, int newBirthDay) {
        this.birthYear = newBirthYear;
        this.birthMonth = newBirthMonth;
        this.birthDay = newBirthDay;
    }

    public void setMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }
}
