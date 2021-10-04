package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\suriyamz\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.youtube.com/");
//driver.get("http://greenstech.in/selenium-course-content.html");
//driver.get("https://www.netflix.com/in/");
driver.navigate().to("https://www.amazon.in/ref=nav_logo");
driver.navigate().back();
String u1 = driver.getCurrentUrl();
System.out.println(u1);
driver.navigate().to("https://www.netflix.com/in/");
System.out.println(driver.getCurrentUrl());
driver.navigate().forward();
String tit1 = driver.getTitle();
System.out.println(tit1);
driver.navigate().refresh();
driver.manage().window().fullscreen();
driver.close();

	}

}
