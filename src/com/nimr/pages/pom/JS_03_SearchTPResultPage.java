package com.nimr.pages.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JS_03_SearchTPResultPage {

	//click on TP hyper link in TP search result page
	@FindBy(xpath="//td[text()='1']/../td[2]")
	private WebElement clickOnTPlink;
	
	//the "Apply Now" button on TP details page.
	@FindBy(xpath="//input[@value='Apply Now']")
	private WebElement applyNowBtn;
	
	
	public JS_03_SearchTPResultPage(WebDriver driver)
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	public void setclickOnTPlink()
	{
		//method to click on training program hyper link to open TP details page
		clickOnTPlink.click();
	}
	
	public void setapplyNowBtn()
	{
		//click on apply button on TP detail page
		applyNowBtn.click();
	}
}
