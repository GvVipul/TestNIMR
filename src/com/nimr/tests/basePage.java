
package com.nimr.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.nimr.pages.pom.homePage;

public class basePage {
	public WebDriver driver;
	
	public basePage(WebDriver driver)
	{
		homePage l=new homePage(driver);
		PageFactory.initElements(driver, l);
		this.driver=driver;
	}
	
	public void verifyTitle(String eTitle)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{
			wait.until(ExpectedConditions.titleIs(eTitle));
			Reporter.log("Title is matching"+eTitle,true);
		}
		catch(Exception e)
		{
			Reporter.log("Title is not matching"+eTitle,true);
		}
	}
	
	public void verifyElementIsPresent(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("Element is present",true);
		}
		catch(Exception e)
		{
			Reporter.log("Element is not present",true);
			Assert.fail();
		}
	}
}
