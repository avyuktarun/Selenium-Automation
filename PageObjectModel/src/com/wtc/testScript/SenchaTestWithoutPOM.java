package com.wtc.testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SenchaTestWithoutPOM {
	@Test
	public void SenchaTest() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://senchatutorials.in");
		Thread.sleep(25000);
		System.out.println("********Login Page********");
		driver.findElement(By.id("textfield-1030-inputEl")).sendKeys("veena.gangula@walkingtree.tech");
		driver.findElement(By.id("textfield-1031-inputEl")).sendKeys("veen@");
		driver.findElement(By.id("button-1033-btnInnerEl")).click();
		Thread.sleep(15000);
		System.out.println("********Home Page********");
		driver.findElement(By.xpath("//*[text() = 'Fundamentals']/../div")).click();
		driver.findElement(By.xpath("//*[text() = 'Working with Elements']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text() = 'Modify Style ']")).click();
		Thread.sleep(5000);
		
		//Close the driver
		driver.close();
		
	}
}
