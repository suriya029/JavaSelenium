package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandling {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suriyamz\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	WebElement q = driver.findElement(By.xpath("(//a[.='Amazon Pay'])[1]"));
	Actions a = new Actions(driver);
	a.moveToElement(q).perform();
	a.contextClick(q).perform();
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	Thread.sleep(5000);
	String w1 = driver.getWindowHandle();
	System.out.println();
	Set<String> eh = driver.getWindowHandles();
	System.out.println(eh);
	for (String str : eh) {
		String ho = driver.switchTo().window(str).getTitle();
		System.out.println(ho);
		
		
	}
	}

}
