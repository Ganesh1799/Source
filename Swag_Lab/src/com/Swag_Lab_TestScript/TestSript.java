package com.Swag_Lab_TestScript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Swag_Lab_Genericlibrary.BaseClass;
import com.Swag_Lab_Genericlibrary.Listner_implement;
import com.Swag_Lab_ObjectRepository.CartPage;
import com.Swag_Lab_ObjectRepository.CompletePage;
import com.Swag_Lab_ObjectRepository.OverviewPage;
import com.Swag_Lab_ObjectRepository.ProdInfoPage;
import com.Swag_Lab_ObjectRepository.ProductPage;
import com.Swag_Lab_ObjectRepository.YourinfoPage;

@Listeners(Listner_implement.class)
public class TestSript extends BaseClass{
@Test
public void orderProduct() throws EncryptedDocumentException, IOException, InterruptedException {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
ProductPage p=new ProductPage(driver);	
p.getProduct2().click();
ProdInfoPage pi=new ProdInfoPage(driver);
pi.getAddtocartbtn().click();
pi.getCarticonbtn().click();
CartPage cp=new CartPage(driver);
cp.getCheckoutbtn().click();
YourinfoPage yp=new YourinfoPage(driver);
String fname = f.readExcelFile("Sheet1", 1, 2);
yp.getFirstnametf().sendKeys(fname);
String lname = f.readExcelFile("Sheet1", 6, 2);
yp.getLastnametf().sendKeys(lname);
Thread.sleep(2000);
String zipcode = f.readExcelFile("Sheet1",11, 2);
yp.getZipcodetf().sendKeys(zipcode);
Thread.sleep(2000);
yp.getContinuebtn().click();
OverviewPage op=new OverviewPage(driver);
op.getFinishbtn().click();
CompletePage cpp=new CompletePage(driver);
cpp.getBacktohomebtn().click();
Thread.sleep(2000);
p.getMenubtn().click();
Thread.sleep(2000);
String expect="Swag Labs";
String actual=driver.getTitle();
SoftAssert s=new SoftAssert();
s.assertEquals(actual, expect);
s.assertAll();
}
}
