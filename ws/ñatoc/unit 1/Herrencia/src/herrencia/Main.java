
package herrencia;

/**
 *
 * @author Carlos Ñato, The Javas, DCC-ESPE
 */
public class Main {
     public static void main(String[] args) {
     
            //Hija1 hija1 = new Hija1(9); 
            
            //hija1.imprimir();
            
            
            Padre pun1 = new Padre(1,2);
            Padre pun2 = new Padre(1,2);
            
            if(pun1.equals(pun2)){    
                System.out.println("Son iguales");
            }

    
    }

   
    
}
