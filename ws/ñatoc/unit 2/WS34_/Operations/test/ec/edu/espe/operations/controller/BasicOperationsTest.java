/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espe.operations.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Carlos Ñato, The Javas, DCC-ESPE
 */
public class BasicOperationsTest {
    
    public BasicOperationsTest() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class BasicOperations.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        float addend1 = 1.0F;
        float addend2 = 2.0F;
        BasicOperations instance = new BasicOperations();
        float expResult = 3.0F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of substracte method, of class BasicOperations.
     */
    @Test
    public void testSubstracte() {
        System.out.println("substracte");
        float minuned = 2.0F;
        float sutrahend = 1.0F;
        BasicOperations instance = new BasicOperations();
        float expResult = 1.0F;
        float result = instance.substracte(minuned, sutrahend);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
