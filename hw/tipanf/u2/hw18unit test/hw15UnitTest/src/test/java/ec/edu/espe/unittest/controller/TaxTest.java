package ec.edu.espe.unittest.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Frederick
 */
public class TaxTest {
    
    public TaxTest() {
    }

    /**
     * Test of computeIVA method, of class Tax.
     */
    @org.junit.jupiter.api.Test
    public void testComputeIVA() {
        System.out.println("computeIVA");
        float amount = 99.64F;
        float expResult = 111.6F;
        float result = Tax.computeIVA(amount);
        assertEquals(expResult, result, 0);
    }
    
}
