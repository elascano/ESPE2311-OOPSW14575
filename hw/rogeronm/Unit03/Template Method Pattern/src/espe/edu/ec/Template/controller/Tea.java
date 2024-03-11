package espe.edu.ec.Template.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author EDWARICHSNAKE
 */
public class Tea extends CaffeineBeverage{

    @Override
    public void brew() {
        System.out.println("Dripping coffee throught filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
    
    public boolean wantsCondiments(){
        String answer = getUserInput();
        if(answer.toLowerCase().startsWith("y")){
            return true;
        }else{
            return false;
        }
    }
    
    private String getUserInput(){
        String answer = null;
        System.out.println("Wouls you like lemon in your tea(y/n)?");
        BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
        return answer;
    }
    
}
