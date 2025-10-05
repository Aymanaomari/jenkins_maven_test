package com.test;

/**
 * Simple Java application for CI/CD pipeline testing.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int result = add(2, 3);
        System.out.println("2 + 3 = " + result);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
