package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage {
	@FindBy(id = "logoutLink")
	private WebElement logout;

	@FindBy(xpath = "//div[text()='TASKS']")
	private WebElement tasks;

	public EnterTimeTrackPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void setLogout() {
	logout.click();
	}
	public void settasktab() {
		tasks.click();
	}


}
