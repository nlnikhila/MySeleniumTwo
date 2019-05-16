package com.mywork.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDropown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C://Users//NikilaPC//Downloads//geckodriver-v0.24.0-win64//geckodriver.exe");
WebDriver driver = new FirefoxDriver();

driver.get("https://www.calculator.net/interest-calculator.html");
driver.manage().window().maximize();
Select dropDown = new Select(driver.findElement(By.id("ccompound")));

dropDown.selectByVisibleText("annually");

System.out.println("The out put of Is selected is " +driver.findElement(By.id("ccompound")).isSelected());
driver.close();
		}

}
