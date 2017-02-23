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
public class ExchangeRateTest {
    
    public ExchangeRateTest() {
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
     * Test of getEuroUsdRate method, of class ExchangeRate.
     */
    @Test
    public void testGetEuroUsdRate() {
        System.out.println("getEuroUsdRate");
        ExchangeRate instance = new ExchangeRate();
        double expResult = instance.getEuroUsdRate();;
        double result = instance.getEuroUsdRate();
        assertEquals(expResult, result, 0.1);
    }

    /**
     * Test of getUsdEuroRate method, of class ExchangeRate.
     */
    @Test
    public void testGetUsdEuroRate() {
        System.out.println("getUsdEuroRate");
        ExchangeRate instance = new ExchangeRate();
        double expResult = instance.getUsdEuroRate();
        double result = instance.getUsdEuroRate();
        assertEquals(expResult, result, 0.1);
    }

    /**
     * Test of getEuroGBPRate method, of class ExchangeRate.
     */
    @Test
    public void testGetEuroGBPRate() {
        System.out.println("getEuroGBPRate");
        ExchangeRate instance = new ExchangeRate();
        double expResult = instance.getEuroGBPRate();
        double result = instance.getEuroGBPRate();
        assertEquals(expResult, result, 0.1);
    }

    /**
     * Test of getGBPEuroRate method, of class ExchangeRate.
     */
    @Test
    public void testGetGBPEuroRate() {
        System.out.println("getGBPEuroRate");
        ExchangeRate instance = new ExchangeRate();
        double expResult = instance.getGBPEuroRate();
        double result = instance.getGBPEuroRate();
        assertEquals(expResult, result, 0.1);
    }
    
}
