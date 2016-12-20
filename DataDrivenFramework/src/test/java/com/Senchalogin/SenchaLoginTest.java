package com.Senchalogin;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class SenchaLoginTest {
	
	public WebDriver driver;
	
	@DataProvider
	public String[][] getExcelData() throws InvalidFormatException, IOException{
		ReadExcel read = new ReadExcel();
		return read.getCellData("Testdata/SenchaLogin.xls", "Sheet1");
				
	}
	@BeforeSuite
	        public void launchApp(){
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://senchatutorials.in/");
		}
	@Test(testName="sencha",dataProvider = "getExcelData")
public void testSenchaLogin(String Username, String Password) throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys(Username);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.xpath("(//span[text()='Sign In'])[2]")).click();
		Thread.sleep(2000);
		String InvalidLogin = driver.findElement(By.xpath("//a[contains(text(), 'Support Team')]")).getText();
		if(InvalidLogin.contains("Support Team")){
			System.out.println("Login Failed");
		}
		else{
			wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("(//font[text()='Sencha Ext JS Overview'])"), "Sencha Ext JS Overview"));
			Assert.assertEquals("Sencha Ext JS Overview", driver.findElement(By.xpath("//font[text()='Sencha Ext JS Overview']")).getText());
			System.out.println("Login successfull");	
		}
	
	}
		
	@AfterSuite
	public void closeBrowser(){
		driver.quit();
	}
}
