/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espe.Operations.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */
public class BasicOperationsTest {
    
    public BasicOperationsTest() {
    }

    /**
     * Test of add method, of class BasicOperations.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        float addend1 = 1.10F;
        float addend2 = 2.20F;
        BasicOperations instance = new BasicOperations();
        float expResult = 3.30F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of substrat method, of class BasicOperations.
     */
    @Test
    public void testSubstrat() {
        System.out.println("substrat");
        float minumend = 0.0F;
        float substract = 0.0F;
        BasicOperations instance = new BasicOperations();
        float expResult = 0.0F;
        float result = instance.substrat(minumend, substract);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
