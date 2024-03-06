package ec.edu.espe.organivent.model;

import ec.edu.espe.organivent.utils.ValidationTime;

/**
 *
 * @author Frederick Tipan, Gabriel Vivanco, Jefferson Yepez - Bit Coderz - DCCO ESPE
 */
public class Schedule {

    private int year;
    private int month;
    private int day;
    private int hours;
    private int minutes;
    
    public static Schedule createEntrySchedule() {
        
        int year = ValidationTime.validateYear();
        int month = ValidationTime.validateMonth();
        int day = ValidationTime.validateDay(year%4,month);
        int hour = ValidationTime.validateHour();
        int minutes = ValidationTime.validateMinutes();

        return new Schedule(year, month, day, hour, minutes);
    }
    
    public static Schedule createDepartureSchedule(Schedule entryTime) {
        int day=0;
        int hour=0;
        int minutes=0;
        
        day = ValidationTime.compareDay(entryTime.getDay(),entryTime.getYear(),entryTime.getMonth());

        if(day==entryTime.getDay()){
            hour = ValidationTime.compareHour(entryTime.getHours());
        }else{
            hour = ValidationTime.validateHour();
        }
        
        if(hour==entryTime.getHours()){
            minutes = ValidationTime.compareMinutes(entryTime.getMinutes());
        }else{
            minutes = ValidationTime.validateMinutes();
        }
        
        return new Schedule(entryTime.getYear(), entryTime.getMonth(), day, hour, minutes);
    }
    

    @Override
    public String toString() {
        return "(" + day + "/" + month + "/" + year + " - " + hours + ":"  + minutes + ")";
    }

    public Schedule(int year, int month, int day, int hours, int minutes) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hours = hours;
        this.minutes = minutes;
    }
    
    public Schedule(){}

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    
    
}
