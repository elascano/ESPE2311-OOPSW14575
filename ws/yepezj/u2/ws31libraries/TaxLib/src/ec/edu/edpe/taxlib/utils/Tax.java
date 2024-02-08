package ec.edu.edpe.taxlib.utils;

import java.util.Scanner;

/**
 *
 * @author Jefferson Yepez DCCO BitCoderz
 */
public class Tax {

    static float ivaPercentage = 12.0f;
    static float min = 1500.35f;
    private float[] basicFraction = {0, 11722, 14930, 19385, 25638, 33738, 44721, 59537, 79388, 105580};
    private float[] taxBasicFraction = {0, 0, 160, 606, 1356, 2571, 4768, 8472, 14427, 23594};
    private float[] porcentExcedentFraction = {0, 5, 10, 12, 15, 20, 25, 30, 35, 37};
    private float annualEarning = 0;

    private float earnings = 0;
    private String typeEarning = "";
    private String typeSalaried = "";

    public Tax(float earning, String typeEarning, String typeSalaried) {
        float socialSecurityPorcent = (!typeSalaried.equals("public"))?0.0945f : 0.1145f;
        this.annualEarning = (!typeEarning.equals("annual")) ?  earning * 12 : earning;
        this.annualEarning -= (this.annualEarning* socialSecurityPorcent);
    }

    @Override
    public String toString() {
        return "Tax{" + "basicFraction=" + basicFraction + ", taxBasicFraction=" + taxBasicFraction + ", porcentExcedentFraction=" + porcentExcedentFraction + ", annualEarning=" + annualEarning + ", earnings=" + earnings + ", typeEarning=" + typeEarning + '}';
    }

    public static float computeIva(float amount) {
        float iva;

        iva = amount * ivaPercentage / 100;
        return iva;
    }

    public static float computePvP(float amount) {
        float total;

        total = amount + computeIva(amount);
        return total;
    }

    public float computeRentTax() {
        for(int i = 0 ; i < basicFraction.length; i ++){
            if(annualEarning > basicFraction[i] && annualEarning <= basicFraction[i+1])
                return taxBasicFraction[i] + (annualEarning - basicFraction[i]) * (porcentExcedentFraction[i] / 100);
        }
        return 0;
    }
}
