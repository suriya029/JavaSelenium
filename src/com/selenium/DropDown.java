package com.selenium;


import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\suriyamz\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
String s = driver.getTitle();
System.out.println(s);
driver.findElement(By.id("email")).sendKeys("jhsis@gmaiil.com");
driver.findElement(By.id("pass")).sendKeys("hello@123");
driver.findElement(By.xpath("//button[@name='login']")).click();
Thread.sleep(5000);
TakesScreenshot ss = (TakesScreenshot) driver;
File ss0 = ss.getScreenshotAs(OutputType.FILE);
File ss1 = new File("C:\\Users\\suriyamz\\eclipse-workspace\\JavaSelenium\\Screenshot\\Scr01.png");
FileUtils.copyFile(ss0, ss1);
driver.navigate().back();
Thread.sleep(3000);
driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Suriya");
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("S");
WebElement y = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
y.sendKeys("234567898");
String kl = y.getText();
System.out.println(kl);
WebElement tr = driver.findElement(By.xpath("//select[@id='day']"));
Select s1 = new Select(tr);
s1.selectByIndex(3);
WebElement qw = driver.findElement(By.xpath("//select[@id='month']"));
Select qq = new Select(qw);
qq.selectByValue("5");
WebElement qt = driver.findElement(By.xpath("//select[@id='year']"));
Select jj = new Select(qt);
jj.selectByVisibleText("2017");
driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
TakesScreenshot g = (TakesScreenshot) driver;
File ss3 = g.getScreenshotAs(OutputType.FILE);
File ss4 = new File("C:\\Users\\suriyamz\\eclipse-workspace\\JavaSelenium\\Screenshot\\scr02.png");
FileUtils.copyFile(ss3, ss4);
driver.findElement(By.xpath("//button[@name='websubmit']")).click();



	}

}
