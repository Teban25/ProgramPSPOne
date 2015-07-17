/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.udea.edu.pruebas.psp.program1.domain;

import java.io.File;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Teban-Ing
 */
public class StatisticalFunctionsTest {
    
    public StatisticalFunctionsTest() {
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
     * Test of calculateDeviation method, of class StatisticalFunctions.
     * @throws java.io.IOException
     */
    
    @Test
    public void testCalculateDeviation() throws IOException {
        System.out.println("calculateDeviation");
        StatisticalFunctions instance = new StatisticalFunctions("C:\\data.txt");
        Double expResult = 1.0;
        Double result = instance.calculateDeviation();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalculateMean() throws IOException{
        System.out.println("calculateMean");
        StatisticalFunctions instance = new StatisticalFunctions("C:\\data.txt");
        Double expResult = 2.0;
        Double result=instance.calculateMean();
        assertEquals(expResult, result);
    }
    
}
