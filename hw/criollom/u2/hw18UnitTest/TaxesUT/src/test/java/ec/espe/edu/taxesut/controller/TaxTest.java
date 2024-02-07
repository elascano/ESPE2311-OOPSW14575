/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.espe.edu.taxesut.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class TaxTest {
    
    public TaxTest() {
    }

    /**
     * Test of calculteIva method, of class Tax.
     */
    @Test
    public void testCalculteIva1() {
        System.out.println("calculteIva");
        float subtotal = 25.5F;
        float iva = 12.0F;
        Tax instance = new Tax();
        float expResult = 28.56F;
        float result = instance.calculteIva(subtotal, iva);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCalculteIva2() {
        System.out.println("calculteIva");
        float subtotal = -6.0F;
        float iva = 12.0F;
        Tax instance = new Tax();
        float expResult = 0.0F;
        float result = instance.calculteIva(subtotal, iva);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCalculteIva3() {
        System.out.println("calculteIva");
        float subtotal = 12.0F;
        float iva = -6.0F;
        Tax instance = new Tax();
        float expResult = 0.0F;
        float result = instance.calculteIva(subtotal, iva);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCalculteIva4() {
        System.out.println("calculteIva");
        float subtotal = -40.0F;
        float iva = -2.0F;
        Tax instance = new Tax();
        float expResult = 0.0F;
        float result = instance.calculteIva(subtotal, iva);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCalculteIva5() {
        System.out.println("calculteIva");
        float subtotal = 4654654.0F;
        float iva = 6.1F;
        Tax instance = new Tax();
        float expResult = 4938587.89F;
        float result = instance.calculteIva(subtotal, iva);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCalculteIva6() {
        System.out.println("calculteIva");
        float subtotal = (float) ('9');
        float iva = 12.0F;
        Tax instance = new Tax();
        float expResult = 10.8F;
        float result = instance.calculteIva(subtotal, iva);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCalculteIv7() {
        System.out.println("calculteIva");
        float subtotal = 45.0F;
        float iva = (float) '5';
        Tax instance = new Tax();
        float expResult = 47.25F;
        float result = instance.calculteIva(subtotal, iva);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCalculteIva8() {
        System.out.println("calculteIva");
        float subtotal = 49.2F;
        float iva = 15.0F;
        Tax instance = new Tax();
        float expResult = 56.58F;
        float result = instance.calculteIva(subtotal, iva);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCalculteIva9() {
        System.out.println("calculteIva");
        float subtotal = 25.0F;
        float iva = 12.0F;
        Tax instance = new Tax();
        float expResult = 28.0F;
        float result = instance.calculteIva(subtotal, iva);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCalculteIva10() {
        System.out.println("calculteIva");
        float subtotal = (float)(96);
        float iva = (float)(9);
        Tax instance = new Tax();
        float expResult = 104.64F;
        float result = instance.calculteIva(subtotal, iva);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    /**
     * Test of computerIncomeTax method, of class Tax.
     */
    @Test
    public void testComputerIncomeTax1() {
        System.out.println("computerIncomeTax");
        float monthSalary = 976.83f;
        float expResult = 0.0F;
        float result = Tax.computerIncomeTax(monthSalary);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testComputerIncomeTax2() {
        System.out.println("computerIncomeTax");
        float monthSalary = 1244.16f;
        float expResult = 160.39F;
        float result = Tax.computerIncomeTax(monthSalary);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testComputerIncomeTax3() {
        System.out.println("computerIncomeTax");
        float monthSalary = 1615.41f;
        float expResult = 605.5F;
        float result = Tax.computerIncomeTax(monthSalary);
        assertEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testComputerIncomeTax4() {
        System.out.println("computerIncomeTax");
        float monthSalary = -206540.0F;
        float expResult = 0.0F;
        float result = Tax.computerIncomeTax(monthSalary);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testComputerIncomeTax5() {
        System.out.println("computerIncomeTax");
        float monthSalary = 2136.5f;
        float expResult = 1356.36F;
        float result = Tax.computerIncomeTax(monthSalary);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testComputerIncomeTax6() {
        System.out.println("computerIncomeTax");
        float monthSalary = 2811.5f;
        float expResult = 2571.0F;
        float result = Tax.computerIncomeTax(monthSalary);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testComputerIncomeTax7() {
        System.out.println("computerIncomeTax");
        float monthSalary = 3726.75f;
        float expResult = 4767.60F;
        float result = Tax.computerIncomeTax(monthSalary);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testComputerIncomeTa8() {
        System.out.println("computerIncomeTax");
        float monthSalary = 4961.41f;
        float expResult = 8472.0F;
        float result = Tax.computerIncomeTax(monthSalary);
        assertEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testComputerIncomeTax9() {
        System.out.println("computerIncomeTax");
        float monthSalary =6615.66f;
        float expResult = 14427.28F;
        float result = Tax.computerIncomeTax(monthSalary);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testComputerIncomeTax10() {
        System.out.println("computerIncomeTax");
        float monthSalary = 8798.33f;
        float expResult = 23594.18F;
        float result = Tax.computerIncomeTax(monthSalary);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    
}
