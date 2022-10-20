package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
	@FindBy(className="logout")
	private WebElement logoutt;
	
	@FindBy(id="container_tasks")
	private WebElement tasksLink;
	
	public HomePage(WebDriver driver) throws InterruptedException
	
	{
		PageFactory.initElements(driver, this);
	}
	
	public void logoutMethod() throws InterruptedException
	
	{
		Thread.sleep(2000);
		logoutt.click();
	}
	
	public void taskMethod() throws InterruptedException
	{
		Thread.sleep(2000);	
		tasksLink.click();
	}
}