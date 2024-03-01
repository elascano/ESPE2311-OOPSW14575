import org.junit.Test;

import ec.edu.espe.taxcalc.util.TaxCalculator;
import ec.edu.espe.taxlib.utils.Tax;

import static org.junit.Assert.*;

public class SalesTest {

    @Test
    public void testComputeIva() {
        float amount = 10.f;
        float expectedIva = 1.2f;
        float actualIva = Tax.computeIva(amount);
        assertEquals(expectedIva, actualIva, 0.01f);
    }

    @Test
    public void testComputePvP() {
        float amount = 10.f;
        float expectedPvP = 11.2f;
        float actualPvP = Tax.computePvP(amount);
        assertEquals(expectedPvP, actualPvP, 0.01f);
    }

    @Test
    public void testCalculateTaxes() {
        double monthlyIncome = 3920;
        boolean hasDeductions = false;
        int year = 2023;
        double expectedTaxAmount = 4342.34;
        double actualTaxAmount = TaxCalculator.CalculateTaxes(monthlyIncome, hasDeductions, year);
        assertEquals(expectedTaxAmount, actualTaxAmount, 0.01);
    }
}