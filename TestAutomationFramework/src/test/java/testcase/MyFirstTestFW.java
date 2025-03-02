package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Utilities.ReadXLSdata;
import base.BaseTest;

public class MyFirstTestFW extends BaseTest {
	
	@Test(dataProviderClass=ReadXLSdata.class,dataProvider="testingData")
	public static void LoginTest(String username, String password) throws InterruptedException 
	{
		

		driver.findElement(By.linkText(loc.getProperty("signin_Link"))).click();
		driver.findElement(By.id(loc.getProperty("email_field"))).sendKeys(username);
		driver.findElement(By.xpath(loc.getProperty("next_button"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc.getProperty("pwd_field"))).sendKeys(password);
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc.getProperty("login_next_button"))).click();
		Thread.sleep(4000);


	}

}
