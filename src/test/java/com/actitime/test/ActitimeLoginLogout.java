package com.actitime.test;

import java.io.IOException;
import org.testng.annotations.Test;
import com.actitime.generics.BaseTest;
import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class ActitimeLoginLogout extends BaseTest
{
	@Test
	public void login() throws InterruptedException, IOException
	{
		LoginPage login=new LoginPage(driver);
		login.loginMethod();
		Thread.sleep(2000);
		
		HomePage home=new HomePage(driver);
		Thread.sleep(2000);
		home.logoutMethod();
	}
}