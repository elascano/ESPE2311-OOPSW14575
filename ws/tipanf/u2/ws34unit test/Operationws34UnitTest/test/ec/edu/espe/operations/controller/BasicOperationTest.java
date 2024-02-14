package ec.edu.espe.operations.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author USUARIO
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
        float addend1 = 1.0F;
        float addend2 = 2.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 3.0F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0);
        
    }

    /**
     * Test of subract method, of class BasicOperation.
     */
    @Test
    public void testSubract() {
        System.out.println("subract");
        float minuend = 2.0F;
        float subtrahend = 1.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 1.0F;
        float result = instance.subract(minuend, subtrahend);
        assertEquals(expResult, result, 0);
    }
    
}
