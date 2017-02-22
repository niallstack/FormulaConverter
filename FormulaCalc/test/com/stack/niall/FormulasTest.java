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
public class FormulasTest {
    
    public FormulasTest() {
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
     * Test of AreaTriangle method, of class Formulas.
     */
    @Test
    public void testAreaTriangle() {
        System.out.println("AreaTriangle");
        double base = 4.0;
        double height = 8.0;
        double expResult = 16.0;
        double result = Formulas.AreaTriangle(base, height);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of AreaCircle method, of class Formulas.
     */
    @Test
    public void testAreaCircle() {
        System.out.println("AreaCircle");
        double radius = 6.0;
        double expResult = 113.1;
        double result = Formulas.AreaCircle(radius);
        assertEquals(expResult, result, 0.5);
    }

    /**
     * Test of AreaRectangle method, of class Formulas.
     */
    @Test
    public void testAreaRectangle() {
        System.out.println("AreaRectangle");
        double length = 7.0;
        double width = 4.0;
        double expResult = 28.0;
        double result = Formulas.AreaRectangle(length, width);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of AreaParallelogram method, of class Formulas.
     */
    @Test
    public void testAreaParallelogram() {
        System.out.println("AreaParallelogram");
        double base = 3.0;
        double height = 7.0;
        double expResult = 21.0;
        double result = Formulas.AreaParallelogram(base, height);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of EMC method, of class Formulas.
     */
    @Test
    public void testEMC() {
        System.out.println("EMC");
        double mass = 3.0;
        double expResult = 269626553621050000.0;
        double result = Formulas.EMC(mass);
        assertEquals(expResult, result, 10000.0);
    }

    /**
     * Test of Speed method, of class Formulas.
     */
    @Test
    public void testSpeed() {
        System.out.println("Speed");
        double distance = 10.0;
        double time = 4.0;
        double expResult = 2.5;
        double result = Formulas.Speed(distance, time);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of Distance method, of class Formulas.
     */
    @Test
    public void testDistance() {
        System.out.println("Distance");
        double speed = 4.0;
        double time = 7.0;
        double expResult = 28.0;
        double result = Formulas.Distance(speed, time);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of Time method, of class Formulas.
     */
    @Test
    public void testTime() {
        System.out.println("Time");
        double speed = 6.6;
        double distance = 30.9;
        double expResult = 4.68;
        double result = Formulas.Time(speed, distance);
        assertEquals(expResult, result, 0.02);
    }

    /**
     * Test of VolCone method, of class Formulas.
     */
    @Test
    public void testVolCone() {
        System.out.println("VolCone");
        double height = 5.0;
        double radius = 4.0;
        double expResult = 83.78;
        double result = Formulas.VolCone(height, radius);
        assertEquals(expResult, result, 0.02);
    }

    /**
     * Test of VolPrism method, of class Formulas.
     */
    @Test
    public void testVolPrism() {
        System.out.println("VolPrism");
        double length = 4.0;
        double width = 5.0;
        double depth = 7.0;
        double expResult = 140.0;
        double result = Formulas.VolPrism(length, width, depth);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of VolSphere method, of class Formulas.
     */
    @Test
    public void testVolSphere() {
        System.out.println("VolSphere");
        double radius = 5.0;
        double expResult = 523.6;
        double result = Formulas.VolSphere(radius);
        assertEquals(expResult, result, 0.02);
    }
    
}
