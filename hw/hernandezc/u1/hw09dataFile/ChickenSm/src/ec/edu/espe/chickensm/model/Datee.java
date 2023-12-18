/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickensm.model;

/**
 *
 * @author Carlos
 */
public class Datee {
    private int day;
    private int month;
    private int year;

    @Override
    public String toString() {
        return getDay() + "/" + getMonth() + "/" + getYear();
    }

    public Datee(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    

    /**
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }
}
