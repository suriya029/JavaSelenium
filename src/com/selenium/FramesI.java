package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesI {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suriyamz\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		WebElement firframe = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(firframe);
		WebElement w = driver.findElement(By.xpath("//input[@type='text']"));
		w.sendKeys("HEllo");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		WebElement mulframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(mulframe);
		WebElement yt = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(yt);
		WebElement k = driver.findElement(By.xpath("//input[@type='text']"));
		k.sendKeys("world");
	}

	
}
