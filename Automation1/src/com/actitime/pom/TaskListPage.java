package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy(xpath ="//div[text()='Add New']")
	private WebElement AddNewbtn;
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement NewCustomerbtn;
	@FindBy(id="customerLightBox_nameField")
	private WebElement customernametbx;
	@FindBy(id="customerLightBox_descriptionField")
	private WebElement customerdesc;
	@FindBy(xpath="//button[@class='x-btn-text']")
	private WebElement selectoptn;
	@FindBy(xpath="//a[text()='Our Company']")
	private WebElement companyoptn;
	@FindBy(id="customerLightBox_commitBtn")
	private WebElement createcustomerbtn;
	@FindBy(className = "innerHtml")
	private WebElement displaytxt;
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getAddNewbtn() {
		return AddNewbtn;
	}
	public WebElement getNewCustomerbtn() {
		return NewCustomerbtn;
	}
	public WebElement getCustomernametbx() {
		return customernametbx;
	}
	public WebElement getCustomerdesc() {
		return customerdesc;
	}
	public WebElement getSelectoptn() {
		return selectoptn;
	}
	public WebElement getCompanyoptn() {
		return companyoptn;
	}
	public WebElement getCreatecustomerbtn() {
		return createcustomerbtn;
	}
	public WebElement getDisplaytxt() {
		return displaytxt;
	}
	

}
