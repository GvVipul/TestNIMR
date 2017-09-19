package com.nimr.pages.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JS_04_CvPreviewPage {

	@FindBy(xpath="//input[@value='Print Cv']")
	private WebElement printCv;
	
	public JS_04_CvPreviewPage(WebDriver driver)
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	public void setprintCV()
	{
		printCv.click();
	
	}
}
