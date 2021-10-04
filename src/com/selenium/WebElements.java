package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\suriyamz\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("hello@gmail.com");
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("hello@123");
		WebElement eng = driver.findElement(By.xpath("//*[@id=\"pageFooter\"]/ul/li[11]/a"));
		eng.click();
		WebElement login = driver.findElement(By.name("login"));
		login.click();
	}

}
