package com.mywork.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/projects/workspace/mysecond/chromedriver/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://demo.guru99.com/test/accessing-link.html");

driver.findElement(By.partialLinkText("here")).click();
System.out.println("the title is: "+driver.getTitle());
driver.close();


	}

}
