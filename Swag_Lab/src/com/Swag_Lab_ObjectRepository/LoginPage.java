package com.Swag_Lab_ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(id="user-name")
private WebElement usernamentf;
@FindBy(id="password")
private WebElement passwordtf;
@FindBy(id="login-button")
private WebElement loginbtn;

public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getUsernamentf() {
	return usernamentf;
}

public WebElement getPasswordtf() {
	return passwordtf;
}

public WebElement getLoginbtn() {
	return loginbtn;
}
}
