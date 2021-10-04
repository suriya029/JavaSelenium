package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class TestSite {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suriyamz\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Suriya");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("S");
		driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys("No-45,link road,chennai-600089");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc@gmail.com");
		//Thread.sleep(3000);
		WebElement lo = driver.findElement(By.xpath("//input[@type='tel']"));
		lo.sendKeys("5467856764");
		String j = lo.getAttribute("value");
		System.out.println(j);
		boolean ko = lo.isDisplayed();
		System.out.println(ko);
		driver.findElement(By.xpath("(//input[@name='radiooptions'])[1]")).click();
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox3")).click();
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("abc@123");
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("abc@123");
WebElement o = driver.findElement(By.xpath("(//label[@class=\"col-md-3 col-xs-3 col-sm-3 control-label\"])[6]"));
String k = o.getText();
System.out.println(k);
		
	}

}
