/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espe.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Admin
 */
public class TaxTest {
    
    public TaxTest() {
    }

    /**
     * Test of computeIva method, of class Tax.
     */
    @org.junit.jupiter.api.Test
    public void testComputeIva() {
        System.out.println("computeIva");
        float amount = 100.00F;
        float expResult = 12.00F;
        float result = Tax.computeIva(amount);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of computePvP method, of class Tax.
     */
    @org.junit.jupiter.api.Test
    public void testComputePvP() {
        System.out.println("computePvP");
        float amount = 100.00F;
        float expResult = 112.00F;
        float result = Tax.computePvP(amount);
        assertEquals(expResult, result, 0);
    }
    
}
