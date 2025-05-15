package com.actitime.testscript;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass{

	public void CreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
	EnterTimeTrackPage t1=new EnterTimeTrackPage(driver);
	t1.settasktab();
    FileLib f=new FileLib();
	String name = f.getExcelData("CreateCustomer", 1, 3);
	String desc = f.getExcelData("CreateCustomer", 1, 4);
	TaskListPage t=new TaskListPage(driver);
	t.getAddNewbtn().click();
	t.getNewCustomerbtn().click();
	t.getCustomernametbx().sendKeys(name);
	Thread.sleep(2000);
	t.getCustomerdesc().sendKeys(desc);
	t.getSelectoptn().click();
	t.getCompanyoptn().click();
	t.getCreatecustomerbtn().click();
	Thread.sleep(3000);
	String actualtext = t.getDisplaytxt().getText();
	boolean res=actualtext.contains(name);
	Assert.assertTrue(res);
	String expectedtext="Customer '"+name+"' has been created";
	Assert.assertEquals(actualtext, expectedtext);
}
}
