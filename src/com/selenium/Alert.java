package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suriyamz\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	org.openqa.selenium.Alert a = driver.switchTo().alert();
		Thread.sleep(3000);
		a.accept();
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		org.openqa.selenium.Alert c = driver.switchTo().alert();
		Thread.sleep(3000);
		c.dismiss();
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		org.openqa.selenium.Alert r = driver.switchTo().alert();
		Thread.sleep(3000);
		r.sendKeys("Java selenium");
		r.accept();
	}
	
	

}
