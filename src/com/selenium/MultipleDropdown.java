package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suriyamz\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	WebElement dr = driver.findElement(By.id("multi-select"));
	
	Select s = new Select(dr);
	
	s.selectByIndex(3);
	s.selectByValue("Ohio");
	s.selectByVisibleText("Pennsylvania");
	
	List<WebElement> tt = s.getAllSelectedOptions();
	
	for (WebElement ui : tt) {
		System.out.println(ui.getText());
		
		}
	System.out.println("*************************");
 for (int i = 0; i <tt.size(); i++) {
	 System.out.println(tt.get(i).getText());
	
}
 WebElement yu = s.getFirstSelectedOption();
 String o = yu.getText();
 System.out.println(o);
	
	
	
	}

}
