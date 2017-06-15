/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author icarques
 */
public class NewEmptyJUnitTest {
    
    private Demo d;
    
    public NewEmptyJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("En BeforeClass");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("En AfterClass");
    }
    
    @Before
    public void setUp() {
        d = new Demo();
        System.out.println("En Before");
    }
    
    @After
    public void tearDown() {
        System.out.println("En After");
    }
    
    @Test
    public void getNombreTest() {
        assertNull(d.getNombre());
        System.out.println("En getNombreTest");
    }
    
    @Test
    public void metodoIntegerTest() {
        assertEquals(new Integer(-1), d.modoInteger());
        System.out.println("En metodoIntegerTest");
    }
}
