/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stack.niall;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Niall
 */
public class ConversionsTest {
    
    public ConversionsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of InToCm method, of class Conversions.
     */
    @Test
    public void testInToCm() {
        System.out.println("InToCm");
        double inch = 67.0;
        double expResult = 170.18;
        double result = Conversions.InToCm(inch);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of decimalToHex method, of class Conversions.
     */
    @Test
    public void testDecimalToHex() {
        System.out.println("decimalToHex");
        int d = 45;
        String expResult = "2D";
        String result = Conversions.decimalToHex(d);
        assertEquals(expResult, result);
    }

    /**
     * Test of hexToDecimal method, of class Conversions.
     */
    @Test
    public void testHexToDecimal() {
        System.out.println("hexToDecimal");
        String s = "457FFB";
        int expResult = 4554747;
        int result = Conversions.hexToDecimal(s);
        assertEquals(expResult, result);
    }

    /**
     * Test of FahrenheitToCelius method, of class Conversions.
     */
    @Test
    public void testFahrenheitToCelius() {
        System.out.println("FahrenheitToCelius");
        double fTemp = 678.0;
        double expResult = 358.889;
        double result = Conversions.FahrenheitToCelius(fTemp);
        assertEquals(expResult, result, 0.1);
    }

    /**
     * Test of CelciusToFahrenheit method, of class Conversions.
     */
    @Test
    public void testCelciusToFahrenheit() {
        System.out.println("CelciusToFahrenheit");
        double cTemp = 56.0;
        double expResult = 132.8;
        double result = Conversions.CelciusToFahrenheit(cTemp);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of EuroToDollar method, of class Conversions.
     */
    @Test
    public void testEuroToDollar() {
        System.out.println("EuroToDollar");
        float euro = 0.0F;
        float expResult = 0.0F;
        float result = Conversions.EuroToDollar(euro);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DollarToEuro method, of class Conversions.
     */
    @Test
    public void testDollarToEuro() {
        System.out.println("DollarToEuro");
        float dollar = 0.0F;
        float expResult = 0.0F;
        float result = Conversions.DollarToEuro(dollar);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EuroToGBP method, of class Conversions.
     */
    @Test
    public void testEuroToGBP() {
        System.out.println("EuroToGBP");
        float euro = 0.0F;
        float expResult = 0.0F;
        float result = Conversions.EuroToGBP(euro);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GBPToEuro method, of class Conversions.
     */
    @Test
    public void testGBPToEuro() {
        System.out.println("GBPToEuro");
        float pound = 0.0F;
        float expResult = 0.0F;
        float result = Conversions.GBPToEuro(pound);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
