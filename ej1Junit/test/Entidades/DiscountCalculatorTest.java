/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Entidades;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author Usuario
 */
public class DiscountCalculatorTest {
    private DiscountCalculator dc = new DiscountCalculator();
    public DiscountCalculatorTest() {
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
     * Test of descuento method, of class DiscountCalculator.
     */
    /*@Test
    public void testDescuento() {
        System.out.println("descuento");
        double precio = 0.0;
        double descuento = 0.0;
        DiscountCalculator instance = new DiscountCalculator();
        double expResult = 0.0;
        double result = instance.descuento(precio, descuento);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    @Test
    public void testDescuento() {
        assertEquals(100.0, dc.descuento(1000.0, 0.10), 0);

    }

    @Test
    public void testSinDescuento() {
        assertEquals(0, dc.descuento(1000.0, 0), 0);
    }
    
    @Test
    public void testDescuentoMaximo() {
        assertEquals(1000, dc.descuento(1000.0, 1), 0);
    }
}
