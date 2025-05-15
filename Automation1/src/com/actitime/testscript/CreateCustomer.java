package com.actitime.testscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateCustomer {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='TASKS']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.findElement(By.xpath("//div[text()='Add New']")).click();
        driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
        driver.findElement(By.id("customerLightBox_nameField")).sendKeys("HDFC_001");
        driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys("Banking Project");
        driver.findElement(By.xpath("//button[@class='x-btn-text']")).click();
        driver.findElement(By.xpath("//a[text()='Our Company']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Create Customer')]")).click();
        String text = driver.findElement(By.className("innerHtml")).getText();
        driver.findElement(By.id("logoutLink")).click();
        driver.close();
        	}


}
