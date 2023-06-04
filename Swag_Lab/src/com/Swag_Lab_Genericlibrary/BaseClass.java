package com.Swag_Lab_Genericlibrary;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.Swag_Lab_ObjectRepository.CompletePage;
import com.Swag_Lab_ObjectRepository.LoginPage;

public class BaseClass {
	static {
		System.setProperty("Webdriver.chrome.driver", "./chromedriver2.exe");
	}
	public static WebDriver driver;
	public File_Library f=new File_Library();
	@BeforeSuite
	private void dataBaseConnection() {
		Reporter.log("Database is connected",true);
	}
	@BeforeTest
	public void launchBrowser() throws IOException {
		driver=new ChromeDriver();
		String url = f.readPropertyFile("url");
		driver.get(url);
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void login() throws EncryptedDocumentException, IOException {
		String un = f.readPropertyFile("username1");
		LoginPage l=new LoginPage(driver);
		l.getUsernamentf().sendKeys(un);
		String pwd = f.readPropertyFile("password");
		l.getPasswordtf().sendKeys(pwd);
		l.getLoginbtn().click();
	}
	@AfterMethod
	public void logOut() {
		CompletePage cpp=new CompletePage(driver);
		cpp.getLogoutbtn().click();
	}
	@AfterTest
	public void closeBrowser() {
	driver.close();	
	}
	@AfterSuite
	public void closeDatabaseConnection() {
		Reporter.log("Database is disconnected",true);
	}
}
