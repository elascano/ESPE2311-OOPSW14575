package ec.edu.espe.persons.view;

import ec.edu.espe.persons.model.Persons;
import ec.edu.espe.persons.model.Sibling;
import java.util.ArrayList;
import com.google.gson.Gson;

/**
 *
 * @author Mateo Rogeron, NullPointerException, DCCO - ESPE
 */
public class ContacSystem {
    

    public static void main(String[] args) {
        Gson gson = new Gson();
        
        ArrayList <Sibling> sibling = new ArrayList<>();
        
        
         
        
       
        
        int addend1 = 20;
        int addend2=30;
        int id = 1;
        int addition;
        String name = "Mateo";
        String phoneNumber = "0999545685";
        String email = "materoge32@gmail.com";
        Persons person;
        person = new Persons(id,name,phoneNumber,name);
        
        addition = addend1 + addend2;
        System.out.println("id ---> " +id);
        
        System.out.println("addition of --> "+addend1+" and "+addend2+" is ---->"+addition);
        System.out.println("Person before ----> "+person);
        registerContact(id,name,phoneNumber,email,person);
        System.out.println("Person after ----> "+person);
    }
   
    public static int add(int addend1,int addend2){
        int addition;
        addend1 = 50;
        addition = addend1 + addend2;
        return addition;
    }    
        
    public static void registerContact(int id, String name, String number, String email,Persons person){
        id = 20;
        name = "Mathew";
        System.out.println("Saving: "+id+", "+name+", "+number+","+email);
        person.setFirtsName("Nicolay");
        System.out.println("Person ---> "+person);
        
        //imprimirse el nombre en la llamada despues de la llamada aparece otro nombre
    }
        
    
}


/* public static void person(){
        int firtsname;
    }
    public static void main(String[] args) {
        
        
        
        Collection things;
        things = new ArrayList();
        
        
       
        System.out.println("size at the begginning: "+things.size());
        
        things.add(20203);
        things.add("Hello Mateo Rogeron");
        things.add(5000.25F);
        
        System.out.println("Size now: "+things.size());
        
        Collection person;
        person = new ArrayList();
        System.out.println("size at the begginning: "+person.size());
        
        person.add(202550);
        person.add("Hello");
        person.add(2023);
        
        System.out.println("Size now: "+person.size());
        person.add(505054);
        
        System.out.println("Size now: "+person.size());
        
        person.remove(505054);
        
        System.out.println("Size now: "+person.size());
        
        Collection<Integer> integers = new ArrayList<>();
        integers.add(1);
        
        Collection<Persons> persons;
        persons = new ArrayList<>();
        for (int i = 0 ; i <5 ; i++ ) {
            persons.add(new Persons(i, "Mateo"+(i+1), "Rogeron"));
        }
        persons.forEach((p) -> {
        System.out.println("Person --> " + p);
        });
*/
