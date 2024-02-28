
package ec.edu.espe.persons.view;
import ec.edu.espe.persons.model.Person;


/**
 *
 * @author Sebastisn
 */
public class ContactSystem {
    
    public static void main(String[] args) {
        int addend1=20;
        int addend2=30;
        int id=1;
        int addition;
        String name="Sebastian";
        String phoneNumber="0968935844";
        String email="sebastiancriollo943@gmail.com";
        Person person;
        person = new Person(id,name,phoneNumber,email);
        System.out.println("of the class---+"+ id);
        addition =add(addend1,addend2);
        System.out.println("addition of ---"+addend1+"and"+ addend2 +"is---"+addition);
        
        
        System.out.println("person before----"+person);
        registercontact (id , name, phoneNumber,email,person);
        System.out.println("addition of----"+addend1+"and"+ addend2+"is-------"+addition);
        System.out.println("Person before----"+person);
        
        System.out.println("print form the main"+id+","+name+","+phoneNumber+","+email);
    }
    
            

      
     public static int add (int addend1, int addend2 ){
         int addition;
         addition=addend1 + addend2;
         return addition;
     }
       
     public static void registerContact(int id, String name, String phoneNumber , String email) {
         id= 20;
         name="Brayan";
         phoneNumber="0968935844";
         email="sebastiancriollo943@gmail.com";
         
         System.out.println("person");
         System.out.println("Saving(inside the metid)"+id+","+name+","+ phoneNumber+","+ email);
         person.setId(8);
         System.out.println("person----"+person.getId());
                          }         

private static void registercontact(int id, String name, String phoneNumber, String email, Person person) {
  
    person.setId(id);
    person.setName(name);
    person.setPhoneNumber(phoneNumber);
    person.setEmail(email);


}

   

            