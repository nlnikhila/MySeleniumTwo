package com.mywork.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MySeleniumTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.gecko.driver", "C:/projects/webdrivers/geckodriver.exe");	
		WebDriver driver= new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.calculator.net/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Math Calculators")).click();;
		
		driver.findElement(By.linkText("Percentage Calculator")).click();
		
		driver.findElement(By.id("cpar1")).sendKeys("10");
		driver.findElement(By.id("cpar2")).sendKeys("50");
		driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();
		String result=driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText();
		System.out.println("result is : "+result);
		String actualResult="5";
		if(result.equals(actualResult)) {
			System.out.println("Test pass");
		}
		
		
		
		driver.close();
		
		
//		String title=driver.getTitle();
//		System.out.println("title is :" +title);
//		
//		driver.findElement(By.name("firstName")).sendKeys("abc");
//		 
//		 
//		driver.findElement(By.name("lastName")).sendKeys(Keys.ENTER);
//		 
//		 
		 
		
		
		

	}

}
