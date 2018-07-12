package com.selenium.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizedLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//Generated customized xpath locator.
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("User Name");   
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password"); 
		driver.findElement(By.xpath("//*[@value='Log In']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id='error']")).getText());
		
		// Generated customized cssSelector locator
		driver.findElement(By.cssSelector("*[type='email']")).sendKeys("User Name");   
		driver.findElement(By.cssSelector("*[id='password']")).sendKeys("Password"); 
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		System.out.println(driver.findElement(By.cssSelector("*[id='error']")).getText());
		
		driver.close();
		
	}

}
