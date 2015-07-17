/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.udea.edu.pruebas.psp.program1.domain;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
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
public class FileStadisticalDataTest {
    
    public FileStadisticalDataTest() {
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
     * Test of addData method, of class FileStadisticalData.
     * @throws java.io.IOException
     */
    @Test
    public void testAddData() throws IOException {
        System.out.println("addData");
        FileStadisticalData instance = new FileStadisticalData("C:\\data.txt");
        LinkedList expResult = new LinkedList();
        expResult.add(1.0);
        expResult.add(2.0);
        expResult.add(3.0);
        LinkedList result = instance.addData();
        assertEquals(expResult, result);
    }
    
}
