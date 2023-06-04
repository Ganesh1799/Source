package com.Swag_Lab_ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourinfoPage {
@FindBy(id="first-name")
private WebElement firstnametf;

@FindBy(id="last-name")
private WebElement lastnametf;

@FindBy(id="postal-code")
private WebElement zipcodetf;

@FindBy(id="continue")
private WebElement continuebtn;

@FindBy(id="cancel")
private WebElement cancelbtn;

public YourinfoPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getFirstnametf() {
	return firstnametf;
}

public WebElement getLastnametf() {
	return lastnametf;
}

public WebElement getZipcodetf() {
	return zipcodetf;
}

public WebElement getContinuebtn() {
	return continuebtn;
}

public WebElement getCancelbtn() {
	return cancelbtn;
}

}
