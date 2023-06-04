package com.Swag_Lab_ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompletePage {
@FindBy(xpath="//div[@class=\"header_label\"]")
private WebElement menubtn;

@FindBy(id="logout_sidebar_link")
private WebElement logoutbtn;

@FindBy(id="back-to-products")
private WebElement backtohomebtn;

public CompletePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getMenubtn() {
	return menubtn;
}

public WebElement getLogoutbtn() {
	return logoutbtn;
}
public WebElement getBacktohomebtn() {
	return backtohomebtn;
}
}
