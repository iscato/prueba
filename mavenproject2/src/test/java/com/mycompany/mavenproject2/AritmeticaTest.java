/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import java.util.ArrayList;
import java.util.List;
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
public class AritmeticaTest {
    
    private Aritmetica a;
    
    public AritmeticaTest() {
        
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
        a = new Aritmetica();
        System.out.println("En Before");
    }
    
    @After
    public void tearDown() {
        System.out.println("En After");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void mediaNullTest() {
        System.out.println("null");
        
        a.media(null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void mediaEmptyTest() {
        System.out.println("empty");
        
        List<Double> nums = new ArrayList<>();
        a.media(nums);
    }
    
    @Test(expected = RuntimeException.class)
    public void mediaNegativeTest() {
        System.out.println("negative");
        
        List<Double> nums = new ArrayList<>();
        nums.add(1.0);
        nums.add(1.0);
        nums.add(-1.0);
        nums.add(1.0);
        a.media(nums);
    }
    
    @Test
    public void mediaTest() {
        System.out.println("media");
        
        List<Double> nums = new ArrayList<>();
        nums.add(4.0);
        nums.add(1.0);
        assertEquals(new Double(2.5), a.media(nums));
    }
}
