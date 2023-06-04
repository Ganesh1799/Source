package com.Swag_Lab_ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage {
@FindBy(id="finish")
private WebElement finishbtn;

@FindBy(xpath="//div[.=\"Sauce Labs Backpack\"] ")
private WebElement productnamelink;

@FindBy(id="cancel")
private WebElement cancelbtn;

public OverviewPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getFinishbtn() {
	return finishbtn;
}

public WebElement getProductnamelink() {
	return productnamelink;
}

public WebElement getCancelbtn() {
	return cancelbtn;
}
}
