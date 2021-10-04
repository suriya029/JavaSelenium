package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Prac {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\suriyamz\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.com/ref=nav_logo");
	//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//input[@class='a-button-input'])[1]")).click();
	WebElement hy = driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]"));
	Actions a = new Actions(driver);
	a.contextClick(hy).perform();
	WebElement r = driver.findElement(By.id("nav-link-accountList"));
	a.moveToElement(r).perform();
}
}
