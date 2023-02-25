package com.bd;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGExample {

    // Before Suite

    @BeforeSuite
    public void beforeSuiteExample() {
        System.out.println("Before Suite Example");
    }

    @Test(priority = 1)
    public void test1() {
        System.out.println("Test..........1");
    }

    @Test(priority = 0)
    public void test2() {
        System.out.println("Test..........2");
    }

    @AfterSuite
    public void afterSuiteExample() {
        System.out.println("After Suite Example");
    }
}