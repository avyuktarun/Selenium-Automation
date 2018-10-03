package com.wtc.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage   {

		WebDriver driv;
		By fundamentals = By.xpath("//*[text() = 'Fundamentals']/../div");
		By workingWithElements = By.xpath("//*[text() = 'Working with Elements']");
		By modifyStyle = By.xpath("//*[text() = 'Modify Style ']");
		
		public HomePage(WebDriver mainDriver){
			this.driv = mainDriver;
		}
		
		public void clickOnFundamentals(){
			driv.findElement(fundamentals).click();
		}
		
		public void clickOnWorkingWithElements(){
			driv.findElement(workingWithElements).click();
		}
		
		public void clickOnModifyStyle(){
			driv.findElement(modifyStyle).click();
		}
}
