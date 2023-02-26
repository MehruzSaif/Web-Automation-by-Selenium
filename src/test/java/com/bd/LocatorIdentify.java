package com.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorIdentify extends BaseDriver {

	String url = "https://login.yahoo.com/";

	@Test
	public void testLocator() throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);

		/*
		 * ID
		 */
		/*
		 * WebElement email = driver.findElement(By.id("login-username"));
		 * email.sendKeys("abc@yahoo.com");
		 */

		/*
		 * Class
		 */
		/*
		 * WebElement email = driver.findElement(By.className("phone-no"));
		 * email.sendKeys("abc@yahoo.com");
		 */

		/*
		 * Name
		 */
		WebElement email = driver.findElement(By.name("username"));
		email.sendKeys("extremearnob007@yahoo.com");
		
		WebElement nextButton = driver.findElement(By.id("login-signin"));
		nextButton.click();

		Thread.sleep(5000);
	}

}