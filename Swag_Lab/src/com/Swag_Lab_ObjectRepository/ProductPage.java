package com.Swag_Lab_ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
@FindBy(xpath="//img[@alt=\"Sauce Labs Backpack\"]")
private WebElement product1;

@FindBy(xpath="//img[@alt=\"Sauce Labs Bike Light\"]")
private WebElement product2;

@FindBy(xpath="//img[@alt=\"Sauce Labs Bolt T-Shirt\"]")
private WebElement product3;

@FindBy(xpath="//img[@alt=\"Sauce Labs Fleece Jacket\"]")
private WebElement product4;

@FindBy(xpath="//img[@alt=\"Sauce Labs Onesie\"]")
private WebElement product5;

@FindBy(xpath="//img[@alt=\"Test.allTheThings() T-Shirt (Red)\"]")
private WebElement product6;

@FindBy(xpath="//button[.='Open Menu']")
private WebElement menubtn;

public ProductPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getProduct1() {
	return product1;
}

public WebElement getProduct2() {
	return product2;
}

public WebElement getProduct3() {
	return product3;
}

public WebElement getProduct4() {
	return product4;
}

public WebElement getProduct5() {
	return product5;
}

public WebElement getProduct6() {
	return product6;
}
public WebElement getMenubtn() {
	return menubtn;
}
}
