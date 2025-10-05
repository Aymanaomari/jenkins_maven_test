package com.jenkins.test;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * Unit tests for App class
 */
public class AppTest {
    
    private App app;
    
    @Before
    public void setUp() {
        app = new App();
    }
    
    @Test
    public void testGetGreetingWithName() {
        String result = app.getGreeting("Jenkins");
        assertEquals("Hello, Jenkins!", result);
    }
    
    @Test
    public void testGetGreetingWithEmptyString() {
        String result = app.getGreeting("");
        assertEquals("Hello, World!", result);
    }
    
    @Test
    public void testGetGreetingWithNull() {
        String result = app.getGreeting(null);
        assertEquals("Hello, World!", result);
    }
    
    @Test
    public void testAddPositiveNumbers() {
        int result = app.add(2, 3);
        assertEquals(5, result);
    }
    
    @Test
    public void testAddNegativeNumbers() {
        int result = app.add(-5, -3);
        assertEquals(-8, result);
    }
    
    @Test
    public void testAddZero() {
        int result = app.add(0, 5);
        assertEquals(5, result);
    }
}
