
package ec.edu.espe.persons.view;

import ec.edu.espe.persons.model.Persons;
import java.util.Date;

/**
 *
 * @author Carlos Ñato, The Javas, DCC-ESPE
 */
public class ContactsSysytem {    
    
    public static void main(String[] args) {
    int addend1 = 60;
    int addend2 = 70;
    int id =0;
    int addition;
    Persons person = new Persons(addend1, addend2, addend2);    
    String name = "Carlos";
    String phoneNumber = "0963482569";
    String email = "martin_izac8@hotmail.com";
    addition  = add(addend1, addend2);
    System.out.println("persson befor -->" + name);
    System.out.println("person afeter-->" + person);
    System.out.println("id -->" + id);
     
    System.out.println("addition of -->" + addend1 + "and" + addend2 + "is-->" + add(addend1, addend2));
    regiterContact(id, name, phoneNumber, email, person);    
       
  
    
    } 
    
     public static int add(int addend1, int addend2){
        int addition;
        addend1 = 50;
        addition = addend1 + addend2;
        return addition;
          
    }
     
     public static void regiterContact(int id, String name, String phoneNumber, String email, Persons person) {
         id = 20;
         name = "Isaac";
         System.out.println("Person");
         System.out.println("laving(inside the metod)"+ id + ","  + name + "," + phoneNumber + "," + email);
         person.setId(9);
         System.out.println("Person -->" + person.getId());
              
        
    }
    
    
    
  }
      

