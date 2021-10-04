package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskFrames2 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suriyamz\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		WebElement singleframe = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(singleframe);
		WebElement j = driver.findElement(By.xpath("//input[@type='text']"));
		j.sendKeys("Hello");
		//System.out.println(j.getText());
		System.out.println(j.getAttribute("value"));
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		WebElement multi = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(multi);
		WebElement multi1 = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(multi1);
		WebElement r = driver.findElement(By.xpath("//input[@type='text']"));
		r.sendKeys("World");
		System.out.println(r.getAttribute("value"));
		}

}
