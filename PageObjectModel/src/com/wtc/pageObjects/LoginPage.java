package com.wtc.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver dri;
	By UserName = By.id("textfield-1030-inputEl");
	By Password = By.id("textfield-1031-inputEl");
	By SigninBtn = By.id("button-1033-btnInnerEl");
	
	public LoginPage(WebDriver mainDriver){
		this.dri = mainDriver;
	}
	
	public void userName(){
		dri.findElement(UserName).sendKeys("veena.gangula@walkingtree.tech");
	}
	public void password(){
		dri.findElement(Password).sendKeys("veen@");
	}
	public void signinBtn(){
		dri.findElement(SigninBtn).click();
	}

}
