
package ec.edu.espe.study.view;

import ec.edu.espe.study.model.Customer;
import ec.edu.espe.study.util.Encoding;
import java.util.Scanner;


/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class FoodAndRollOrder {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Registro de clientes");
        System.out.println("1 Crear cliente");
        System.out.println("2 Buscar cliente");
        System.out.println("3 Actualizar cliente");
        System.out.println("4 Borrar cliente");
        System.out.println("5 Ver todos los clientes");
       
        int option=0;
        option=input.nextInt();
        
        switch(option){
            case 1 :
                System.out.println("Ingrese datos del cliente");
                input.nextLine();
                System.out.println("nombre");
                String name = input.nextLine();
                System.out.println("email");
                String email = input.nextLine();
                
                System.out.println("Phone Number");
                float phoneNumber = input.nextFloat();
                
                input.nextLine();
                
                System.out.println("Addres");
                String addres = input.nextLine();
                
                Customer customer = new Customer(name, email, phoneNumber, addres);
                Encoding.crear(customer);
                        
            break;
            
            case 2:
                System.out.println("Ingrese el nombre del cliente que dese buscar");
                input.nextLine();
                name = input.nextLine();
                Encoding.buscar(name);
                        
            break;
            
            case 3:
                System.out.println("Ingrese el nombre del cliente para cambiar los datos");
                input.nextLine();
                name = input.nextLine();
                boolean val=Encoding.confirm(name);
                if(val){
                    System.out.println("Ingrese la direccion a cambiar");
                    String OtherAddres = input.nextLine();
                    Encoding.cambiar(OtherAddres, name);
                }
            break;  
            
            case 4:
                System.out.println("Ingrese el nombre del cliente para borrar");
                input.nextLine();
                name = input.nextLine();
                val=Encoding.confirm(name);
                if(val){
                    Encoding.eliminar(name);
                }
                
            break;   
            
            case 5:
                Encoding.printAll();
            break;
        }
    }
}
