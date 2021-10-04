package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebElements2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\suriyamz\\eclipse-workspace\\JavaSelenium\\Driver\\msedgedriver.exe");
WebDriver driver = new EdgeDriver();
driver.manage().window().maximize();
driver.get("https://www.irctc.co.in/nget/train-search");
WebElement click = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
click.click();
WebElement from = driver.findElement(By.className("ng-tns-c58-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted"));
from.sendKeys("CHENNAI EGMORE - MS");
WebElement to = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
to.sendKeys("NEW DELHI - NDLS");
WebElement date = driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]"));
		date.sendKeys("29/07/2021");
		WebElement uu = driver.findElement(By.className("ng-tns-c66-11 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted"));
	uu.click();
	uu.click();
	
	}

}
