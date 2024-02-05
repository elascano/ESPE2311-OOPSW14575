/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espe.taxlibrary.controller;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Luis Sagnay
 */
public class RentTaxTest {
    
    public RentTaxTest() {
    }

    /**
     * Test of calculateRentTaxes method, of class RentTax.
     */
    @org.junit.jupiter.api.Test
    public void testCalculateRentTaxes() {
        System.out.println("calculateRentTaxes");
        double monthlyIncome = 450.0;
        boolean isPublicEmployee = false;
        int year = 2023;
        double expResult = 0.0;
        double result = RentTax.calculateRentTaxes(monthlyIncome, isPublicEmployee, year);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of getYearTaxFractions method, of class RentTax.
     */
    @org.junit.jupiter.api.Test
    public void testGetYearTaxFractions() throws Exception {
        System.out.println("getYearTaxFractions");
        int year = 0;
        ArrayList<TaxFraction> expResult = null;
        ArrayList<TaxFraction> result = RentTax.getYearTaxFractions(year);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
