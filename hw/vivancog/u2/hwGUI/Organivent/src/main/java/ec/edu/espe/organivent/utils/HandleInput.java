package ec.edu.espe.organivent.utils;

import java.util.Scanner;

/**
 *
 * @author Frederick Tipan, Gabriel Vivanco, Jefferson Yepez - Bit Coderz - DCCO ESPE
 */
public class HandleInput {
    
    public static int insertInteger(){
        Scanner scanner = new Scanner(System.in);
        int analyzeInt=0;
        boolean passed=true;
        
        do{
            try{
                analyzeInt = Integer.parseInt(scanner.nextLine());
                passed=true;
            }catch (Exception e){
                System.out.println("Enter a valid whole number please: ");
                passed=false;
            }
        }while(passed==false);
        
        return analyzeInt;    
    }
    
    public static float insertFloat(){
        Scanner scanner = new Scanner(System.in);
        float analyzeFloat=0;
        boolean passed=true;
        
        do{
            try{
                analyzeFloat = Float.parseFloat(scanner.nextLine());
                passed=true;
            }catch (Exception e){
                System.out.println("Enter a valid decimal number please");
                System.out.println("Maybe try using '.' instead of ','");
                passed=false;
            }
        }while(passed==false);
        
        return analyzeFloat;    
    }
    
    public static float insertPrice(){
        float price;
        boolean passed = true;
        
        do {
            price = insertFloat();
            if (price <= 0) {
                System.out.println("enter a decimal number greater than zero");
                passed = false;
            } else {
                passed = true;
            }
        } while (!passed);

        return price;
    }
    
    public static String insertNonBlankString() {
        Scanner scanner = new Scanner(System.in, "ISO-8859-1");
        String inputString;
        boolean passed = true;
        
        do {
            inputString = scanner.nextLine();
            if (inputString.trim().isEmpty()) {
                System.out.println("Please enter a non-blank string");
                passed = false;
            } else {
                passed = true;
            }
        } while (!passed);

        return inputString.trim();
    }
    
    public static String insertRealName() {
        String inputName;
        boolean passed = false;
        
        do {
            inputName = insertNonBlankString();
            passed = true;
            for(char currentchar:inputName.toCharArray()){
                    if(Character.isDigit(currentchar)){
                        System.out.println("A name can't have numbers!");
                        System.out.println("Please try again");
                        passed=false;
                        break;
                    }else{
                        if(!Character.isLetter(currentchar)&& !Character.isWhitespace(currentchar)){
                            System.out.println("A name can't have special characters!");
                            System.out.println("Please try again");
                            passed=false;
                        break;
                        }else{
                            passed = true;
                        }
                    }
                }
        } while (passed==false);

        return inputName;
    }
}
