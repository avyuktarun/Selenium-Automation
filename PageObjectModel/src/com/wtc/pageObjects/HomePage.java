package com.wtc.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage   {

		WebDriver driv;
		By fundamentals = By.xpath("//*[text() = 'Fundamentals']/../div");
		By workingWithElements = By.xpath("//*[text() = 'Working with Elements']");
		By modifyStyle = By.xpath("//*[text() = 'Modify Style ']");
		By text = By.id("panel-1163-innerCt > ul > li");
		public WebDriverWait wait;
		
		public HomePage(WebDriver mainDriver){
			this.driv = mainDriver;
			wait = new WebDriverWait(driv, 30);
		}
		
		public void clickOnFundamentals(){
			wait.until(ExpectedConditions.visibilityOfElementLocated(fundamentals));
			driv.findElement(fundamentals).click();
		}
		
		public void clickOnWorkingWithElements(){
			driv.findElement(workingWithElements).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(modifyStyle));
		}
		
		public void clickOnModifyStyle(){
			driv.findElement(modifyStyle).click();
//			wait.until(ExpectedConditions.visibilityOfElementLocated(text));
		}
}
