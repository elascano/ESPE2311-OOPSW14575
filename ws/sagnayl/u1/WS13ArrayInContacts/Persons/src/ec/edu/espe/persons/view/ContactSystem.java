package ec.edu.espe.persons.view;

import ec.edu.espe.persons.model.Person;
import java.util.Date;

/**
 *
 * @author Luis Sagnay
 */
public class ContactSystem {
   
    public static void main(String[] args) {
        int addend1=20;
        int addend2=30;
        int addition;
        int id=1;
    
        String name = "Luis";
        String phoneNumber = "0983172773";
        String email = "lesagnay@espe.edu.ec";
        
        Person person;
        Date date = new Date();
        person = new Person(id, name, phoneNumber, date);
        
        
        System.out.println("Id of the class " +id);

        addition=add(addend1,addend2);
        System.out.println("addition of--> "+ addend1 +" and "+addend2+" is--> "+addition);
        
        System.out.println("Addend "+addend1);
        
        System.out.println("id: "+id+","+name+","+phoneNumber+","+email);
        
        registerContact(id,name,phoneNumber,email,person);
        person.setFirstName("Luis");
        System.out.println("id: "+id+","+name+","+phoneNumber+","+email);
        System.out.println("Person after--> "+person);
    }
    
    public static int add(int addend1,int addend2){
        int addition;
        addend1=50;
        addition=addend1+addend2;
                
        return addition;
    }
    
    public static void registerContact(int id,String name,String phoneNumber,String email,Person person){
        
        id = 20;
        name = "Eduardo";
        System.out.println("Print inside function registerContact");
        System.out.println("id: " +id +"," +name +"," +phoneNumber +"," +email);
        person.setFirstName("Eduardo");
        System.out.println("Person inside --> "+person);
        
    }
}
