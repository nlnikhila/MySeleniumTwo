package com.mywork.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/projects/webdrivers/chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("http://demo.guru99.com/test/radio.html");
driver.manage().window().maximize();
WebElement checkBox = driver.findElement(By.id("vfb-6-0"));
checkBox.click();
if (checkBox.isSelected()) {
	System.out.println("check box is toggled on");
}
	else {
		System.out.println("check box is toggled of");
		
	}

driver.close();
}
	
	



	}


