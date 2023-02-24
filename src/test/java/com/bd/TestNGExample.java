package com.bd;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGExample {

    // Before Suite
	
    @BeforeSuite
    public void beforeSuiteExample() {
        System.out.println("Before Suite Example");
    }
    
    @Test
    public void test() {
    	System.out.println("Test..........1");
    }
    
    @Test
    public void afterSuiteExample() {
    	System.out.println("After Suite Example");
    }
}