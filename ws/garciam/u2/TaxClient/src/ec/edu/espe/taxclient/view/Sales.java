
package ec.edu.espe.taxclient.view;


import 
/**
 *
 * @author mateo
 */
public class Sales {
     public static void main(String[] args) {
            System.out.println("Iva price --> " + IvaComputer.computeIva(10));
            System.out.println("Total price --> " + IvaComputer.computeTotalPrice(10));
            IvaComputer ivaComputer = new IvaComputer();
            ivaComputer.setIvaPorcentage(15);
            
            System.out.println("Iva price --> " + IvaComputer.computeIva(10));
            System.out.println("Total price --> " + IvaComputer.computeTotalPrice(10));
    }
}