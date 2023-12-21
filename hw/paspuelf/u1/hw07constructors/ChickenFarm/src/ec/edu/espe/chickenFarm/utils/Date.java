<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenFarm.utils;

/**
 *
 * @author Olivier Paspuel
 */
public class Date {
    private int year;
    private int month;
    private int day;

    // Constructor to set the date to the current day
    public Date() {
        long currentTimeMillis = System.currentTimeMillis();
        long seconds = currentTimeMillis / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;
        long days = hours / 24;

        // Calculate the year, month, and day
        this.year = 1970; // Start from the epoch year
        while (days >= daysInYear(year)) {
            days -= daysInYear(year);
            year++;
        }

        this.month = 1; // Start from January
        while (days >= daysInMonth(year, month)) {
            days -= daysInMonth(year, month);
            month++;
        }

        this.day = (int) days + 1; // Days are 1-indexed
    }

    // Constructor with parameters to set a specific date
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Getter methods for year, month, and day
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int calculateAge(Date birthdate) {
        int currentYear = this.getYear();
        int birthYear = birthdate.getYear();
        int age = currentYear - birthYear;

        // Check if the birthday has occurred this year
        if (birthdate.getMonth() > this.getMonth() || 
           (birthdate.getMonth() == this.getMonth() && birthdate.getDay() > this.getDay())) {
            age--;
        }

        return age;
    }
    
    // Override toString method to provide a string representation of the date
    @Override
    public String toString() {
        return String.format("%04d-%02d-%02d", year, month, day);
    }

    // You can add other methods as needed, such as methods to compare dates, perform arithmetic, etc.

    // Helper method to calculate the number of days in a year
    private static long daysInYear(int year) {
        return isLeapYear(year) ? 366 : 365;
    }

    // Helper method to check if a year is a leap year
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Helper method to calculate the number of days in a month
    private static long daysInMonth(int year, int month) {
        return switch (month) {
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> 31;
        };
    }
}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenFarm.utils;

/**
 *
 * @author Olivier Paspuel
 */
public class Date {
    private int year;
    private int month;
    private int day;

    // Constructor to set the date to the current day
    public Date() {
        long currentTimeMillis = System.currentTimeMillis();
        long seconds = currentTimeMillis / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;
        long days = hours / 24;

        // Calculate the year, month, and day
        this.year = 1970; // Start from the epoch year
        while (days >= daysInYear(year)) {
            days -= daysInYear(year);
            year++;
        }

        this.month = 1; // Start from January
        while (days >= daysInMonth(year, month)) {
            days -= daysInMonth(year, month);
            month++;
        }

        this.day = (int) days + 1; // Days are 1-indexed
    }

    // Constructor with parameters to set a specific date
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Getter methods for year, month, and day
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int calculateAge(Date birthdate) {
        int currentYear = this.getYear();
        int birthYear = birthdate.getYear();
        int age = currentYear - birthYear;

        // Check if the birthday has occurred this year
        if (birthdate.getMonth() > this.getMonth() || 
           (birthdate.getMonth() == this.getMonth() && birthdate.getDay() > this.getDay())) {
            age--;
        }

        return age;
    }
    
    // Override toString method to provide a string representation of the date
    @Override
    public String toString() {
        return String.format("%04d-%02d-%02d", year, month, day);
    }

    // You can add other methods as needed, such as methods to compare dates, perform arithmetic, etc.

    // Helper method to calculate the number of days in a year
    private static long daysInYear(int year) {
        return isLeapYear(year) ? 366 : 365;
    }

    // Helper method to check if a year is a leap year
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Helper method to calculate the number of days in a month
    private static long daysInMonth(int year, int month) {
        return switch (month) {
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> 31;
        };
    }
}
>>>>>>> 7ad623e1c914bfdcb885f888488936540dbfba3f
