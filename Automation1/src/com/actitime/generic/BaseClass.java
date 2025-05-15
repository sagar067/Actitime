package com.actitime.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.LoginPage;

public class BaseClass {
	public WebDriver driver;	
	@BeforeTest
	public void OpenBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
	}
	@AfterTest
	public void CloseBrowser() {
		if(driver!=null) {
		  driver.quit();
		}
	}
	@BeforeMethod
	public void Login(){
		LoginPage l=new LoginPage(driver);
		l.SetLogin("admin", "manager");
		  }
	@AfterMethod
	public void Logout() throws InterruptedException{
		EnterTimeTrackPage t1=new EnterTimeTrackPage(driver);
		Thread.sleep(1000);
		t1.setLogout();
	}
	}
