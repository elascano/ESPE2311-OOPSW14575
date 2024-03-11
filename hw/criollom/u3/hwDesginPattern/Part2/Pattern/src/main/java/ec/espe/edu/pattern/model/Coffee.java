
package ec.espe.edu.pattern.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class Coffee extends CaffeineBeverage{

    @Override
    public void brew() { System.out.println("Dripping coffee through filter"); } 
    @Override
    public void addCondiments() { System.out.println("Adding sugar and milk" ); } 

    @Override
    public boolean wantsCondiments() { // a hook operation
        String answer = getUserInput();
        return answer != null && answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like milk and sugar with your coffee (y/n)? ");
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            answer = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return answer;
    }

}
