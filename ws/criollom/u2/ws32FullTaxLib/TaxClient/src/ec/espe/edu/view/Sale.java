
package ec.espe.edu.view;

import ec.espe.edu.taxlib.utils.Tax;
import java.util.Scanner;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class Sale {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name of product");
        String name = input.nextLine();
        
        System.out.println("Enter price the product");
        float price = input.nextFloat();
        

        System.out.println("----IVA----");
        System.out.println("Mateo Criollo");
        System.out.println("Price of the product -->"+price);
        System.out.println("Iva-->"+Tax.computerIva(price));
        System.out.println("total-->"+Tax.computerPVP(price));
        
       input.nextLine();
        
        System.out.println("Register employee");
        System.out.println("Enter name the employee");
        name=input.nextLine();
        
        System.out.println("Register salary month");
        float salaryMonth = input.nextFloat();
        
        System.out.println("Is he a public employee ");
        boolean confirm= input.nextBoolean();
        
        if (!confirm){
            System.out.println("The salary anual without taxes is-->"+salaryMonth*12);
        }else{
            System.out.println("The salary anual without taxes is--> "+salaryMonth*12);
            System.out.println("The tax anual is  ->>  "+Tax.computerIncomeTax(salaryMonth));
            System.out.println("The anual salary with tax is--> "+((salaryMonth*12)-Tax.computerIncomeTax(salaryMonth)));
        }
    }
}
