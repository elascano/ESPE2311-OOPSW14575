
package ec.edu.espe.atmsystem.model;

import java.util.ArrayList;

/**
 *
 * @author bryan
 */
public class ATM {
    //Singleton
    
    
    public boolean identify(String name, String password){
        return true;
    }
    
    public float getMoneyInAccount(){
        return 100f;
    }
    
    public void choseAccount(int id){
        System.out.println("Switchung to account " + id);    
    }
    
    public ArrayList<Movement> getMovments(){
        return null;
    }
    
    public void reinteger(){
        
    }
    
}
