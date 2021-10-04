package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTask11 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suriyamz\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://demoqa.com/frames");
WebElement firframe = driver.findElement(By.xpath("//iframe[@id='frame1']"));
driver.switchTo().frame(firframe);
WebElement k = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
System.out.println(k.getText());
driver.switchTo().defaultContent();
WebElement lo = driver.findElement(By.xpath("//iframe[@id='frame2']"));
driver.switchTo().frame(lo);
WebElement rt = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
System.out.println(rt.getText());

	}

}
