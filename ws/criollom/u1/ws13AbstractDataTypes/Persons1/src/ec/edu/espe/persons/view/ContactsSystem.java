
package ec.edu.espe.persons.view;

import ec.edu.espe.persons.model.Person;

/**
 *
 * @author MateoCriollo
 */
public class ContactsSystem {
   
    public static void main(String[] args) {
        int addend1=20;
        int addend2=30;
        int addition;
        int id=1;
        Person person=new Person();
    
        String name = "Mateo";
        String phoneNumber="0986824606";
        String email = "mgcriollo1@espe.edu.ec";
        
        
        System.out.println("Print before entering the function add");
        System.out.println("addition of--> "+ addend1 +" and "+addend2+" is--> "+(addend1+addend2));
        
        System.out.println("print after entering the function add");
        addition=add(addend1,addend2);
        System.out.println("addition of--> "+ addend1 +" and "+addend2+" is--> "+addition);
        
        System.out.println("Print before entering the function registerContact");
        System.out.println("id: "+id+","+name+","+phoneNumber+","+email);
        person.setName(name);
        System.out.println("Person before--> "+person);
        
        registerContact(id,name,phoneNumber,email,person);
        
        System.out.println("print after entering the function registerContact");
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
        
        id=20;
        name="Gabriel";
        System.out.println("Print inside function registerContact");
        System.out.println("id: "+id+","+name+","+phoneNumber+","+ email);
        person.setName("Gabriel");
        System.out.println("Person inside ->> "+person);
        
    }
}
