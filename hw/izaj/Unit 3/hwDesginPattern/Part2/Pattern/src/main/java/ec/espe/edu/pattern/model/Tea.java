
package ec.espe.edu.pattern.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class Tea extends CaffeineBeverage{
    @Override
    public void brew() { System.out.println( "Steep the tea" ); }
    @Override
    public void addCondiments() { System.out.println( "Adding lemon" ); }
    @Override
    public boolean wantsCondiments() { // a hook operation
        String answer = getUserInput();
        return answer != null && answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like lemon with your tea (y/n)? ");
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            answer = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return answer;
}
}
