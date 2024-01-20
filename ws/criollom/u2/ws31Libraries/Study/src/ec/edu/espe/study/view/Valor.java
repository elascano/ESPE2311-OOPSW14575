
package ec.edu.espe.study.view;

import ec.edu.espe.study.contoller.TaxController;
import ec.edu.espe.study.model.Product;
import java.util.Scanner;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class Valor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name of product");
        String name = input.nextLine();
        
        
        System.out.println("Enter price the product");
        float price = input.nextFloat();
        
        Product product = new Product(name , price);
        
        
        System.out.println("----IVA----");
        System.out.println("Mateo Criollo");
        System.out.println("Price of the product -->"+product.getPrice());
        System.out.println("Iva-->"+TaxController.computerIva(price));
        System.out.println("total-->"+TaxController.computerPVP(price));
        
    }
    
    
    
    }
    
    
  
