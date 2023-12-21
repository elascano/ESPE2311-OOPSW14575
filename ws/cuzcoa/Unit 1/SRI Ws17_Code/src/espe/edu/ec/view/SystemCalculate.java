
package espe.edu.ec.view;
import ec.edu.espe.util.Tax;
import java.util.Scanner;
/**
 *
 * @author Alex Cuzco, HoneyBadgers, DCCO-ESPE
 */
public class SystemCalculate {
    public static void main(String[] args) {
        double salary=0;
        double exedente=0;
        double impuestoFE;
        double impuestoTotal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce your annual salary:");
        salary = sc.nextDouble();
        Tax personsalary= new Tax(salary);
            
        if(personsalary.getSalary()>=0 && personsalary.getSalary()<=11721.00){
            exedente=personsalary.getSalary()-0;
            impuestoFE=exedente*0;
            impuestoTotal=impuestoFE+0;
            System.out.println("El impuesto a la renta es de "+impuestoTotal);
    
        }
        if(personsalary.getSalary()>=11722.00 && personsalary.getSalary()<=14929.00){
            exedente=personsalary.getSalary()-11722;
            impuestoFE=exedente*(0.05);
            impuestoTotal=impuestoFE+0;
            System.out.println("El impuesto a la renta es de "+impuestoTotal);
    
        }
         if(personsalary.getSalary()>=14930.00 && personsalary.getSalary()<=19384.00){
            exedente=personsalary.getSalary()-14930.00;
            impuestoFE=exedente*(0.10);
            impuestoTotal=impuestoFE+160.00;
            System.out.println("El impuesto a la renta es de "+impuestoTotal);
    
        }
         
        if(personsalary.getSalary()>=19385.00 && personsalary.getSalary()<=25637.00){
            exedente=personsalary.getSalary()-19385.00;
            impuestoFE=exedente*(0.12);
            impuestoTotal=impuestoFE+606.00;
            System.out.println("El impuesto a la renta es de "+impuestoTotal);
    
        }
        
        if(personsalary.getSalary()>=25638.00 && personsalary.getSalary()<=33737.00){
            exedente=personsalary.getSalary()-25638.00;
            impuestoFE=exedente*(0.15);
            impuestoTotal=impuestoFE+1356.00;
            System.out.println("El impuesto a la renta es de "+impuestoTotal);
    
        }
        
        if(personsalary.getSalary()>=33738.00 && personsalary.getSalary()<=44720.00){
            exedente=personsalary.getSalary()-33738.00;
            impuestoFE=exedente*(0.20);
            impuestoTotal=impuestoFE+2571.00;
            System.out.println("El impuesto a la renta es de "+impuestoTotal);
    
        }
        
        if(personsalary.getSalary()>=44721.00 && personsalary.getSalary()<=59536.00){
            exedente=personsalary.getSalary()-44721.00;
            impuestoFE=exedente*(0.25);
            impuestoTotal=impuestoFE+4768.00;
            System.out.println("El impuesto a la renta es de "+impuestoTotal);
    
        }
        
        if(personsalary.getSalary()>=59537.00 && personsalary.getSalary()<=79387.00){
            exedente=personsalary.getSalary()-59537.00;
            impuestoFE=exedente*(0.30);
            impuestoTotal=impuestoFE+8472.00;
            System.out.println("El impuesto a la renta es de "+impuestoTotal);
    
        }
        if(personsalary.getSalary()>=79388.00 && personsalary.getSalary()<=105579){
            exedente=personsalary.getSalary()-79388.00;
            impuestoFE=exedente*(0.35);
            impuestoTotal=impuestoFE+14427.00;
            System.out.println("El impuesto a la renta es de "+impuestoTotal);
    
        }
        
        if(personsalary.getSalary()>=105580.00){
            exedente=personsalary.getSalary()-105580.00;
            impuestoFE=exedente*(0.37);
            impuestoTotal=impuestoFE+ 23594.00;
            System.out.println("El impuesto a la renta es de "+impuestoTotal);
    
        }
         
        
        
    }
    

}
