package ec.edu.espe.persons.view;

import ec.edu.espe.persons.model.Person;

/**
 *
 * @author JuanGranda,Error 404,DCCO-ESPE
 */
public class Contacts {

    public static void main(String[] args) {
        int addend1 = 20;
        int addend2 = 30;
        int addition;
        int id = 1;
        Person person;
        person = new Person(id, addend1, addend2);
        String name = "Carlos";
        String phoneNumber = "0987271121";
        String email = "carlos.granda6424@gmail.com";
        addition =  add(addend1, addend2);
        System.out.println("person before -->"+person);
        System.out.println("person afeter-->" + person);
        System.out.println("id -->"+ id);
        System.out.println("adiyion of ->" + addend1 + " and " + addend2 + " is -> " + add(addend1 , addend2));
        registerContact(id, name, phoneNumber, email, person);
        
    }
        
        public static int add(int addend1, int addend2){
            int addition;
            addend1 = 50;
            addition = addend1 + addend2;
            return addition;
            
        }
        public static void registerContact(int id, String name, String phonenumber, String email, Person person){
            id = 20;
            name =  "Carlos";
            System.out.println("laving(inside the metod )"+ id+", "+name+", "+phonenumber+", "+ email);
            person.setId(9);
            System.out.println("Person ->" + person.getId());

            
            

            
    }

    /**
     * public static void main(String[] args) { Collection things; things = new
     * ArrayList(); System.out.println("size at the beginnning" +
     * things.size());
     *
     * things.add(2004); things.add("Hello Quito"); things.add(500.25F);
     * //things.add(person); things.remove(5000.25F);
     *
     * System.out.println("size at the beginnning" + things.size());
     * things.add(2004); System.out.println(things);
     *
     * System.out.println("New person"); //EMPLO Person myself = new Person(1,
     * "Carlos", "Caiza",null);      *
     * things.add(myself); System.out.println(things); things.remove (2004);
     * System.out.println(things.size());
     *
     * Collection<Person> persons;
     *
     * persons = new ArrayList();
     *
     * for(int i = 0; i<5; i++){
     *
     * persons.add(new Person((i+1),"Carlos" + (i+1), "Ñato", new Date())); }
     *
     * for(Person personIndex : persons){ System.out.println(personIndex); }
     *
     * System.out.println(persons.size());
     *
     *
     *
     *
     *
     *
     *
     *
     * }
     */
}
