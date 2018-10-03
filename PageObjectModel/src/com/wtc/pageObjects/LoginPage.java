package com.wtc.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	WebDriver dri;
	By UserName = By.id("textfield-1030-inputEl");
	By Password = By.id("textfield-1031-inputEl");
	By SigninBtn = By.id("button-1033-btnInnerEl");
	public WebDriverWait wait;


	public LoginPage(WebDriver mainDriver){
		this.dri = mainDriver;
		wait = new WebDriverWait(dri, 30);
	}

	public void userName(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(UserName));
		dri.findElement(UserName).sendKeys("veena.gangula@walkingtree.tech");
	}
	public void password(){
		dri.findElement(Password).sendKeys("veen@");
	}
	public void signinBtn(){
		dri.findElement(SigninBtn).click();
	}

}
