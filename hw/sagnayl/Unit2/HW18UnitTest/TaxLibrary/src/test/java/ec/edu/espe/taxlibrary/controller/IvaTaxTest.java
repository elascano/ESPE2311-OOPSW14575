package ec.edu.espe.taxlibrary.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Luis Sagnay
 */
public class IvaTaxTest {
    
    public IvaTaxTest() {
    }

    /**
     * Test of computeIva method, of class IvaTax.
     */
    @org.junit.jupiter.api.Test
    public void testComputeIva() {
        System.out.println("computeIva");
        float amount = 0.0F;
        float expResult = 0.0F;
        float result = IvaTax.computeIva(amount);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of computePvP method, of class IvaTax.
     */
    @org.junit.jupiter.api.Test
    public void testComputePvP() {
        System.out.println("computePvP");
        float amount = 77.77F;
        float expResult = 87.1024F;
        float result = IvaTax.computePvP(amount);
        assertEquals(expResult, result, 0);
    }
    
}
