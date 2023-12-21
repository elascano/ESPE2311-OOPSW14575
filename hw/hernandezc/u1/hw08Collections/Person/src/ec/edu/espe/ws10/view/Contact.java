
package ec.edu.espe.ws10.view;

import ec.edu.espe.ws10.model.Person;

/**
 *
 * @author Carlos
 */
public class Contact {   
    
    public static void main(String[] args) {
    int addition;
    int addend1=20;
    int addend2=30;
    int id=1;
    String name="Carlos";
    String phoneNumber="09991802042";
    String email="cohernandez@espe.euc.ec";
    Person person=new Person(id, name, phoneNumber, email);
    
    addition=add(addend1,addend2);
    
        System.out.println("id of the class---> "+id);
        System.out.println("Addition of "+addend1+ " and "+addend2+" is---->"+addition);
        System.out.println("Person-->"+person);
        registerContact(id,name,phoneNumber,email,person);
        System.out.println("Person-->"+person);
    }
    
    public static int add(int addend1, int addend2){
        int addition;
        addend1=50;
        addition=addend1+addend2;
        return addition;
    }
    public static void registerContact(int id,String name,String phoneNumber,String email, Person person){
        id=20;
        person.setFirstName("Orlando");
        System.out.println("Inside the method "+id+ " " +name+ " " +phoneNumber+ "" + email);
    }
}
