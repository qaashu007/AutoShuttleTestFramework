package com.shuttl.projectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.shuttl.pageObject.LoginPageObject;
import com.shuttle.page.BaseClass;
import com.shuttle.page.ILogLevel;

public class LoginPage extends BaseClass{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void enterMobileNumber(String _mobNumber) {
		waitForElementDisplayed(By.id(LoginPageObject.mobileNumberTextField_Id));
		sendKeys(By.id(LoginPageObject.mobileNumberTextField_Id), _mobNumber);
		log("enter [Mobile Number]", ILogLevel.METHOD);
		
	}

}
