package ec.edu.espe.TaxLib.utils;

/**
 *
 * @author Olivier Paspuel
 */
public class RentTax {

    public static float calculatePublicEmployeeRentTax(float salary) {
        float annualEarnings = calculateAnnualEarnings(salary);

        float IESSAportation = calculateIESSAportation(annualEarnings);

        float netEarnings = annualEarnings - IESSAportation;

        RentThreshold thold = calculateThreshold(netEarnings);

        float excess = netEarnings - thold.getBasicFraction();

        float excessTax = (float) (excess * thold.getExcessFractionTax());

        float rentTax = (excessTax + thold.getBasicFractionTax());

        return rentTax;

    }

    private static float calculateAnnualEarnings(float salary) {
        return salary * 12;
    }

    private static float calculateIESSAportation(float annual) {
        return (float) (annual * 0.1145);
    }

    private static RentThreshold calculateThreshold(float netEarnings) {
        if (netEarnings > 105580) {
            return new RentThreshold(105580, 23594, (float) 0.37);
        }
        if (netEarnings > 79388) {
            return new RentThreshold(79388, 14427, (float) 0.35);
        }
        if (netEarnings > 59537) {
            return new RentThreshold(59537, 8472, (float) 0.3);
        }
        if (netEarnings > 44721) {
            return new RentThreshold(44721, 4768, (float) 0.25);
        }
        if (netEarnings > 33738) {
            return new RentThreshold(33738, 2571, (float) 0.2);
        }
        if (netEarnings > 25638) {
            return new RentThreshold(25638, 1356, (float) 0.15);
        }
        if (netEarnings > 19385) {
            return new RentThreshold(19385, 606, (float) 0.12);
        }
        if (netEarnings > 14930) {
            return new RentThreshold(14930, 160, (float) 0.1);
        }
        if (netEarnings > 11722) {
            return new RentThreshold(11722, 0, (float) 0.05);
        }
        return new RentThreshold(0, 0, (float) 0);
    }

}
