package com.actitime.pom;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.actitime.generics.AutoConstant;
import com.actitime.generics.BasePage;
import com.actitime.generics.ExcelLibrary;
import com.actitime.generics.Helper;

public class LoginPage extends BasePage implements AutoConstant
{
	public WebDriver driver;
	
	@FindBy(id="username")
	private WebElement usernameTextfield;
	
	@FindBy(xpath = "//input[@name='pwd']")
	private WebElement passwordtextfield;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepmeloggedinCheckbox;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(xpath = "//a[.='Forgot your password?']")
	private WebElement forgotyourpasswordLink;
	
	@FindBy(xpath = "//a[.='actiTIME Inc.']")
	private WebElement actitimeincLink;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginMethod() throws InterruptedException, IOException
	{
		Helper.highlightelement(driver, usernameTextfield);
		usernameTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_name_login, 1, 0));
		Thread.sleep(2000);
		Helper.highlightelement(driver, passwordtextfield);
		passwordtextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_name_login, 1, 1));
		Thread.sleep(2000);
		keepmeloggedinCheckbox.click();
		Thread.sleep(2000);
		loginButton.click();
		Thread.sleep(3000);
	}
	
	public void forgotyourpasswordMethod()
	{
		forgotyourpasswordLink.click();
	}
	
	public void actitimeincMethod()
	{
		actitimeincLink.click();
	}
}