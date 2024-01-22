package ec.edu.espe.calculatetaxes.view;

import ec.edu.espe.calculatetaxes.model.CalculateTax;


/**
 *
 * @author Luis Sagnay
 */
public class Sales {
    public static void main(String[] args) {
        float priceOfTheProduct = 11;
        System.out.println("----IVA----");
        System.out.println("Luis Sagnay");
        System.out.println("Price: " + priceOfTheProduct);
        System.out.println("IVA: " + CalculateTax.calculateIVA(priceOfTheProduct));
        System.out.println("PVP: " + CalculateTax.calculatePVP(priceOfTheProduct));
    }
}
