package com.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertExample extends BaseDriver {

    public String url = "https://the-internet.herokuapp.com/javascript_alerts";

    @Test
    public void alertTest() throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(5000);

        WebElement jsAlert = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
        WebElement jsConfirm = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
        WebElement jsPrompt = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));

        jsAlert.click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

        Thread.sleep(3000);

        jsConfirm.click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();

        Thread.sleep(5000);
    }
}