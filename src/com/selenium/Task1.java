package com.selenium;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Task1 {
	public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\suriyamz\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@class='login']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("yep05957gh@gmail.com");
	driver.findElement(By.xpath("//button[@name='SubmitCreate']")).click();
	Thread.sleep(5000);
WebElement po = driver.findElement(By.xpath("//input[@id='id_gender1']"));
po.click();
	driver.findElement(By.xpath("//input[@name='customer_firstname']")).sendKeys("Suriya");
driver.findElement(By.xpath("//input[@name='customer_lastname']")).sendKeys("S");
driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("123qwe");
WebElement q = driver.findElement(By.xpath("//select[@name='days']"));
Select s = new Select(q);
s.selectByIndex(1);
WebElement w = driver.findElement(By.xpath("//select[@name='months']"));
Select d = new Select(w);
d.selectByValue("3");
WebElement e = driver.findElement(By.xpath("//select[@name='years']"));
Select f = new Select(e);
f.selectByValue("1997");
driver.findElement(By.xpath("//input[@id='newsletter']")).click();
driver.findElement(By.xpath("//input[@id='optin']")).click();
driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Suriya");
driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("S");
driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Amazon");
driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("No-22, north street");
driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Chennai");
WebElement k = driver.findElement(By.xpath("//select[@id='id_state']"));
Select h = new Select(k);
h.selectByValue("21");
driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys("60007");
WebElement l = driver.findElement(By.xpath("//select[@id='id_country']"));
Select v = new Select(l);
v.selectByValue("21");
driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("3456765673");
driver.findElement(By.xpath("//input[@id='alias']")).sendKeys("No-45, south street");
driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
TakesScreenshot ss = (TakesScreenshot) driver;
File ss1 = ss.getScreenshotAs(OutputType.FILE);
File ss2 = new File("C:\\Users\\suriyamz\\eclipse-workspace\\JavaSelenium\\Screenshot\\sstask.png");
FileUtils.copyFile(ss1, ss2);
Actions a = new Actions(driver);
WebElement we = driver.findElement(By.xpath("//a[.='Women']"));
a.moveToElement(we).perform();
WebElement io = driver.findElement(By.xpath("(//a[.='Evening Dresses'])[1]"));
a.moveToElement(io).click().perform();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.manage().window().maximize();
WebElement jk = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
a.moveToElement(jk).click().perform();
Thread.sleep(7000);
WebElement tr = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
driver.switchTo().frame(tr);
driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
WebElement fd = driver.findElement(By.xpath("//select[@name='group_1']"));
Select sd = new Select(fd);
sd.selectByIndex(1);
driver.findElement(By.xpath("//a[@name='Pink']")).click();
driver.findElement(By.xpath("//button[@name='Submit']")).click();
TakesScreenshot dd = (TakesScreenshot) driver;
File dd1 = dd.getScreenshotAs(OutputType.FILE);
File dd2 = new File("C:\\Users\\suriyamz\\eclipse-workspace\\JavaSelenium\\Screenshot\\dd1.png");
FileUtils.copyFile(dd1, dd2);
driver.switchTo().defaultContent();
driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("Colour-blue , size-L");
driver.findElement(By.xpath("//button[@name='processAddress']")).click();
driver.findElement(By.xpath("//input[@type='checkbox']")).click();
driver.findElement(By.xpath("//button[@name='processCarrier']")).click();
TakesScreenshot ff = (TakesScreenshot) driver;
File ff1 = ff.getScreenshotAs(OutputType.FILE);
File ff2 = new File("C:\\Users\\suriyamz\\eclipse-workspace\\JavaSelenium\\Screenshot\\ff1.png");
FileUtils.copyFile(ff1, ff2);
driver.findElement(By.xpath("//a[@title='Pay by bank wire']")).click();
driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
TakesScreenshot gg = (TakesScreenshot) driver;
File gg1 = gg.getScreenshotAs(OutputType.FILE);
File gg2 = new File("C:\\Users\\suriyamz\\eclipse-workspace\\JavaSelenium\\Screenshot\\gg2.png");
FileUtils.copyFile(gg1, gg2);
driver.quit();




	
	
	
	}
	
	

}
