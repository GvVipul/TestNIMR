package com.nimr.pages.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JS_01_SearchJobResultPage {

	//in job search result click on job hyperlink
	@FindBy(xpath="//td[text()='1']/../td[3]")
	private WebElement clickOnJobLink;
	
	//click on apply button in job details page
	@FindBy(xpath="//input[@value='Apply Now']")
	private WebElement Applyjob;
	
	//click on OK button in success pop up
	@FindBy(xpath="//input[@value='OK']")
	private WebElement OkBtn;
	
	// Click close button on job details page
	@FindBy(xpath="//button[@aria-label='Close']")
	private WebElement OKBtn2;
	
	public JS_01_SearchJobResultPage(WebDriver driver)
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	public void setclickOnJobLink()
	{
		clickOnJobLink.click();
	}
	
	public void setApplyJob() 
	{
		Applyjob.sendKeys(Keys.ENTER);
	}
	
	public void setOK()
	{
		OkBtn.click();
	}
	
	public void setOK2()
	{
		OKBtn2.click();
	}
}
