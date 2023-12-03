
package ec.edu.espe.persons.view;

import ec.edu.espe.persons.model.Persons;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author Carlos Ñato, The Javas, DCC-ESPE
 */
public class Contacts {
    public static void main(String[] args) {
        Collection things;
        things = new ArrayList();
        System.out.println("size at the beginnning" + things.size());
       
        things.add(2004);
        things.add("Hello Quito");
        things.add(500.25F);
        //things.add(person);
        things.remove(5000.25F);
        
        System.out.println("size at the beginnning" + things.size());
        things.add(2004);
        System.out.println(things);
        
        System.out.println("New person");
   //EMPLO     
        Persons myself = new Persons(1, "Carlos", "Caiza",null); 
        
        things.add(myself);
        System.out.println(things);
        things.remove (2004);
        System.out.println(things.size());
        
        Collection<Persons> persons;
        
        persons = new ArrayList();
        
        for(int i = 0; i<5; i++){
            
            persons.add(new Persons((i+1),"Carlos" + (i+1), "Ñato", new Date()));
        }
        
        for(Persons personIndex : persons){
            System.out.println(personIndex);
        }
        
        System.out.println(persons.size());
        
        
                
        
        
        
        
        
    }
    
}
