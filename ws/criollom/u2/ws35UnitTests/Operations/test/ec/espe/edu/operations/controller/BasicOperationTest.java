/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.espe.edu.operations.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
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
        float addendd1 = 5.0F;
        float addend2 = 4.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 9.0F;
        float result = instance.add(addendd1, addend2);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subtruc method, of class BasicOperation.
     */
    @Test
    public void testSubtruc() {
        System.out.println("subtruc");
        float minumed = 1.0F;
        float subtrahend = 2.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 3.0F;
        float result = instance.subtruc(minumed, subtrahend);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
