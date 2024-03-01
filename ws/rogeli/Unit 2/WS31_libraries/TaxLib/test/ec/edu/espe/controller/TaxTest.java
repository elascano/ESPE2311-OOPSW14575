
package ec.edu.espe.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ilhan
 */
public class TaxTest {
    
    public TaxTest() {
    }

    /**
     * Test of computeIva method, of class Tax.
     */
    @Test
    public void testComputeIva() {
        System.out.println("computeIva");
        float ammount = 110.0F;
        float expResult = 13.2F;
        float result = Tax.computeIva(ammount);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of computePvP method, of class Tax.
     */
    @Test
    public void testComputePvP() {
        System.out.println("computePvP");
        float ammount = 100.0F;
        float expResult = 112.0F;
        float result = Tax.computePvP(ammount);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
/*

    @Test
    public void testComputeTaxableBase() {
        System.out.println("computeTaxableBase");
        float mensualIncome = 0.0F;
        float expResult = 0.0F;
        float result = Tax.computeTaxableBase(mensualIncome);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testComputeIncomeTax() {
        System.out.println("computeIncomeTax");
        float mensualIncome = 0.0F;
        float expResult = 0.0F;
        float result = Tax.computeIncomeTax(mensualIncome);
        assertEquals(expResult, result, 0);
   
        fail("The test case is a prototype.");
    }
    */
}
