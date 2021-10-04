package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\suriyamz\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jddgdjd@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hezlo@1203");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
			Thread.sleep(7000);
		TakesScreenshot ss = (TakesScreenshot) driver;
		File ss1 = ss.getScreenshotAs(OutputType.FILE);
		File ss2 = new File("C:\\Users\\suriyamz\\eclipse-workspace\\JavaSelenium\\Screenshot\\Screen002.png");
		FileUtils.copyFile(ss1, ss2);
driver.navigate().back();
driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Suriya");
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("s");
driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("apple@gmail.com");
driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
Thread.sleep(5000);
TakesScreenshot ts = (TakesScreenshot) driver;
File ss3 = ts.getScreenshotAs(OutputType.FILE);
File ss4 = new File("C:\\Users\\suriyamz\\eclipse-workspace\\JavaSelenium\\Screenshot\\second02.png");
FileUtils.copyFile(ss3, ss4);
driver.quit();
	}

}
