package com.jenkins.test;

/**
 * Simple application for Jenkins Maven CI/CD testing
 */
public class App {
    
    /**
     * Returns a greeting message
     * 
     * @param name the name to greet
     * @return greeting message
     */
    public String getGreeting(String name) {
        if (name == null || name.isEmpty()) {
            return "Hello, World!";
        }
        return "Hello, " + name + "!";
    }
    
    /**
     * Adds two numbers
     * 
     * @param a first number
     * @param b second number
     * @return sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }
    
    /**
     * Main method
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.getGreeting("Jenkins"));
        System.out.println("2 + 3 = " + app.add(2, 3));
    }
}
