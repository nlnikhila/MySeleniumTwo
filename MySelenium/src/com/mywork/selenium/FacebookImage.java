package com.mywork.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:/projects/webdrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/identify?ctx=recover");
		
//		String title = driver.getTitle();
//		System.out.println(title);
		
		driver.findElement(By.cssSelector("a[title='Go to Facebook Home']")).click();
		
		if(driver.getTitle().equals("Facebook - Log In or Sign Up")) {
			System.out.println("We are back to the home page");
		}
		else {
			System.out.println("we are not in facebook homepage");
		}
		
		
		
		
		
	}

}
