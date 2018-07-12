package com.selenium.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractionMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		//Enter data in fields using ID and name locator
		driver.findElement(By.id("email")).sendKeys("Enter email");
		driver.findElement(By.name("pass")).sendKeys("Provide password");
		
		//Click using linkText
		driver.findElement(By.linkText("Forgot account?")).click();
		
		//Enter data in fields using xPath and cssSelector locator | Get text of Error message from div.
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("User Name");
		driver.findElement(By.cssSelector("#password")).sendKeys("Password");
		driver.findElement(By.id("Login")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
	}
}
