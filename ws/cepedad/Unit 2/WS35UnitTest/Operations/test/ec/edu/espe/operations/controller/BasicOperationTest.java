package ec.edu.espe.operations.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author David
 */
public class BasicOperationTest {
    
    public BasicOperationTest() {
    }

    /**
     * Test of add method, of class BasicOperation.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        float adden1 = 1.0F;
        float adden2 = 2.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 3.0F;
        float result = instance.add(adden1, adden2);
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }

    /**
     * Test of substract method, of class BasicOperation.
     */
    @Test
    public void testSubstract() {
        System.out.println("substract");
        float minuend = 10.0F;
        float subtrahend = 6.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 4.0F;
        float result = instance.substract(minuend, subtrahend);
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }
    
}
