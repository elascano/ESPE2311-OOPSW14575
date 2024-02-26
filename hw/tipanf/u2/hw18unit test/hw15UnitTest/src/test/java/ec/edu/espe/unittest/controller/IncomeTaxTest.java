package ec.edu.espe.unittest.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Frederick
 */
public class IncomeTaxTest {
    
    public IncomeTaxTest() {
    }

    /**
     * Test of applyIESSDiscount method, of class IncomeTax.
     */
    @Test
    public void testApplyIESSDiscount() {
        System.out.println("applyIESSDiscount");
        float anualSalary = 34500.0F;
        boolean isPublicEmployee = false;
        float expResult = 31239.75F;
        float result = IncomeTax.applyIESSDiscount(anualSalary, isPublicEmployee);
        assertEquals(expResult, result, 0.02);
        
    }

    /**
     * Test of computeIncomeTax method, of class IncomeTax.
     */
    @Test
    public void testComputeIncomeTax() {
        System.out.println("computeIncomeTax");
        float monthlySalary = 1542.0F;
        boolean isPublicEmployee = false;
        float expResult = 342.53F;
        float result = IncomeTax.computeIncomeTax(monthlySalary, isPublicEmployee);
        assertEquals(expResult, result, 0.02);
        
    }
    
}
