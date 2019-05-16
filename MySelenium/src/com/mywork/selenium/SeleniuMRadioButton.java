package com.mywork.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniuMRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C://Users//NikilaPC//Downloads//geckodriver-v0.24.0-win64//geckodriver.exe");	

		WebDriver driver = new FirefoxDriver();
		
//		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
//		driver.navigate().to("https://www.calculator.net/mortgage-payoff-calculator.html");
//		driver.manage().window().maximize();
//		driver.findElement(By.id("cpayoff1")).click();
//		
//		System.out.println("The output of isSlelected is : "+driver.findElement(By.id("cpayoff1")).isSelected());
//		
//		System.out.println("The output of isEnabled is : "+driver.findElement(By.id("cpayoff1")).isEnabled());
//
//		System.out.println("The output of isDisplayed is : "+driver.findElement(By.id("cpayoff1")).isDisplayed());
//
//		
//		driver.close();

		
		//**********for checkbox***********
		driver.navigate().to("https://www.calculator.net/mortgage-calculator.html");
				
		driver.manage().window().maximize();
		
		driver.findElement(By.id("caddoptional")).click();
		System.out.println("The result is:" +driver.findElement(By.id("caddoptional")).isEnabled());
		System.out.println("the result of isSelected :"+driver.findElement(By.id("caddoptional")).isSelected());
		driver.close();
		
	}

}
