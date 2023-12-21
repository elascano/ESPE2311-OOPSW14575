package ec.edu.espe.trucks.util;

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
    
}
