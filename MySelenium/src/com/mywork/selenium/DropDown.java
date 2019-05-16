package com.mywork.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/projects/webdrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("http://demo.guru99.com/test/newtours/register.php");
//		Select dropCountry = new Select(driver.findElement(By.name("country")));
//		dropCountry.selectByVisibleText("ANGOLA");
//		
//		System.out.println("Angola is displayed: "+driver.findElement(By.name("country")).isDisplayed());
//		
		
		driver.get("http://jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		
		fruits.selectByValue("banana");
		fruits.selectByIndex(1);
		fruits.selectByVisibleText("Grape");
		System.out.println("banana is selected:" +driver.findElement(By.id("fruits")).isSelected());
				
		
		
	}

}
