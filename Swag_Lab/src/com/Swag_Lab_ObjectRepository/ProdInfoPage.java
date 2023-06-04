package com.Swag_Lab_ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProdInfoPage {
@FindBy(xpath="//button[.='Add to cart']")
private WebElement addtocartbtn;
 
@FindBy(xpath="//a[@class='shopping_cart_link']")
private WebElement carticonbtn;

@FindBy(id="back-to-products")
private WebElement backbtn;

public ProdInfoPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getAddtocartbtn() {
	return addtocartbtn;
}

public WebElement getCarticonbtn() {
	return carticonbtn;
}

public WebElement getBackbtn() {
	return backbtn;
}
}
