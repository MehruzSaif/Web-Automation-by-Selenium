package com.bd;

import org.testng.annotations.Test;

public class GoogleTesting extends BaseDriver {

    public String baseUrl = "https://www.google.com/";

    @Test
    public void googleTest() throws InterruptedException {
        driver.get(baseUrl);
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }
}