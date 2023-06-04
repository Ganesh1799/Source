package com.Swag_Lab_ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
@FindBy(id="checkout")
private WebElement checkoutbtn;

@FindBy(id="continue-shopping")
private WebElement contshoppingbtn;

@FindBy(id="remove-sauce-labs-backpack")
private WebElement removebtn;

@FindBy(xpath="//div[.=\"Sauce Labs Backpack\"]")
private WebElement productnamelink;

public CartPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getCheckoutbtn() {
	return checkoutbtn;
}

public WebElement getContshoppingbtn() {
	return contshoppingbtn;
}

public WebElement getRemovebtn() {
	return removebtn;
}

public WebElement getProductnamelink() {
	return productnamelink;
}

}
