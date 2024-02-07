package ec.edu.espe.taxlibrary.controller;

import java.util.ArrayList;

/**
 *
 * @author Luis Sagnay
 */
public class RentTax {
    public static double calculateRentTaxes(double monthlyIncome, boolean isPublicEmployee, int year) {
        double anualIncome = monthlyIncome*12;
        double iessTax;
        if (isPublicEmployee) {
            iessTax = anualIncome*0.1145F;
        } else {
            iessTax = anualIncome*0.0945F;
        }
        double netAnualIncome = anualIncome - iessTax;
        TaxFraction fraction = getTaxFraction(netAnualIncome, year);
        if (fraction == null) {
            return 0;
        }
        double tax = fraction.tax + (netAnualIncome - fraction.from) * fraction.discount;
        return tax;
    }

    public static ArrayList<TaxFraction> getYearTaxFractions(int year) throws Exception {
        ArrayList<TaxFraction> fractions = new ArrayList<>();
        switch (year) {
            case 2023: {
                fractions.add(new TaxFraction(0, 11722, 0, 0));
                fractions.add(new TaxFraction(11722, 14930, 0, 0.05));
                fractions.add(new TaxFraction(14930, 19385, 0, 0.1));
                fractions.add(new TaxFraction(19385, 25638, 0, 0.12));
                fractions.add(new TaxFraction(25638, 33738, 1356, 0.15));
                fractions.add(new TaxFraction(33738, 44721, 2571, 0.2));
                fractions.add(new TaxFraction(44721, 59537, 4768, 0.25));
                fractions.add(new TaxFraction(59537, 79388, 8472, 0.3));
                fractions.add(new TaxFraction(79388, 105580, 14427, 0.35));
                fractions.add(new TaxFraction(105580, Double.POSITIVE_INFINITY, 23594, 0.37));
                break;
            }
            default: {
                throw new Exception("Unfortunately we don't know the table of taxes for this year.");
            }
        }
        return fractions;
    }
    
    private static TaxFraction getTaxFraction(double netAnualIncome, int year) {
        ArrayList<TaxFraction> yearFractions;
        try {
            yearFractions = getYearTaxFractions(year);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        for (TaxFraction fraction : yearFractions) {
            if (netAnualIncome >= fraction.from && netAnualIncome < fraction.upto) {
                return fraction;
            }
        }
        return null;
    }
}
