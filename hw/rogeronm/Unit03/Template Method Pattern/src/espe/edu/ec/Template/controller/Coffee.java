package espe.edu.ec.Template.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author EDWARICHSNAKE
 */
public class Coffee extends CaffeineBeverage{

    @Override
    public void brew() {
        System.out.println("Steep the tea");
    }
    
    @Override
    public void addCondiments(){
        System.out.println("Adding lemon");
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
        System.out.println("Wouls you like milk and sugar with your cofee(y/n)?");
        BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
        return answer;
    }
    
}
