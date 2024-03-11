package ec.edu.espe.organivent.utils;

/**
 *
 * @author Frederick Tipan, Gabriel Vivanco, Jefferson Yepez - Bit Coderz - DCCO ESPE
 */
public class ValidationTime {
    
    public static int validateYear(){
        int year=0;
        do{
            System.out.println("   Enter the year:");
            year = HandleInput.insertInteger();
        }while(year<2010);
        
        return year;
    }
    
    public static int validateMonth(){
        int month=0;

        do{
            System.out.println("   Enter the month:");
            month = HandleInput.insertInteger();
        }while(month < 1 || month > 12);
        
        return month;
    }
    
    public static int validateDay(int leapYear,int month){
        int day=0;


        if(month==2){
            if(leapYear==0){
                do{
                    System.out.println("   Enter the day:");
                    day = HandleInput.insertInteger();
                }while(day<1 || day>29);
            }else{
                do{
                    System.out.println("   Enter the day:");
                    day = HandleInput.insertInteger();
                }while(day<1 || day>28);
            }
        }else{
            if(month<=7){
                day=firstMidyear(month);
            }else{
                day=secondMidyear(month);
            }    
        }
        
        return day;
    }
    
    private static int firstMidyear(int month){
        int day=0;
        
        if(month%2 != 0){
            do{
                System.out.println("   Enter the day:");
                        day = HandleInput.insertInteger();
            }while(day<1 || day>31);
        }else{
            do{
                System.out.println("   Enter the day:");
                        day = HandleInput.insertInteger();
            }while(day<1 || day>30);
        }
        
        return day;
    }
    
    private static int secondMidyear(int month){
        int day=0;
        
        if(month%2 != 0){
            do{
                System.out.println("   Enter the day:");
                        day = HandleInput.insertInteger();
            }while(day<1 || day>30);
        }else{
            do{
                System.out.println("   Enter the day:");
                        day = HandleInput.insertInteger();
            }while(day<1 || day>31);
        }
        
        return day;
    }
    
    public static int validateHour(){
        int hour=0;
        
        do{
            System.out.println("   Enter the hour (24 hour format):");
            hour = HandleInput.insertInteger();
        }while(hour < 0 || hour > 23);
        
        return hour;
    }
    
    public static int validateMinutes(){
        int minutes=0;
        
        do{
            System.out.println("   Enter the minutes:");
            minutes = HandleInput.insertInteger();
        }while(minutes < 0 || minutes > 59);
        
        return minutes;
    }
    
    public static int compareYear(int entryYear){
        int year=0;
        do{
            year = ValidationTime.validateYear();
            if(year<entryYear){
                System.out.println("   This departure year doesn't make sense, please try again");
            }
        }while(year<entryYear);
        
        return year;
    }
    
    public static int compareMonth(int entryMonth){
        int month=0;
        do{
            month = ValidationTime.validateMonth();
            if(month<entryMonth){
                System.out.println("   This departure month doesn't make sense, please try again");
            }
        }while(month<entryMonth);
        
        return month;
    }
    
    public static int compareDay(int entryDay,int year,int month){
        int day=0;
        do{
            day = ValidationTime.validateDay(year%4,month);
            if(day<entryDay){
                System.out.println("   This departure day doesn't make sense, please try again");
            }
        }while(day<entryDay);
        
        return day;
    }
    
    public static int compareHour(int entryHour){
        int hour=0;
        do{
            hour = ValidationTime.validateHour();
            if(hour<entryHour){
                System.out.println("   This departure hour doesn't make sense, please try again");
            }
        }while(hour<entryHour);
        
        return hour;
    }
    
    public static int compareMinutes(int entryMinutes){
        int minutes=0;
        do{
            minutes = ValidationTime.validateMinutes();
            if(minutes<entryMinutes){
                System.out.println("   These departure minutes doesn't make sense, please try again");
            }
        }while(minutes<entryMinutes);
        
        return minutes;
    }
    
}
