package com.wtc.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.wtc.pageObjects.LoginPage;
import com.wtc.pageObjects.HomePage;

public class SenchaTutorial {

	@Test
	public void SenchaTest() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://senchatutorials.in");
		System.out.println("********Login Page********");
		LoginPage login = new LoginPage(driver);
		login.userName();
		login.password();
		login.signinBtn();
		System.out.println("********Home Page********");
		HomePage home = new HomePage(driver);
		home.clickOnFundamentals();
		home.clickOnWorkingWithElements();
		home.clickOnModifyStyle();
		//Close the driver
		driver.close();
	}
}


