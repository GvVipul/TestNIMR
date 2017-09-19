package com.nimr.pages.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class JS_02_ProfileUpdate {


	@FindBy(id="ctl00_ctl66_g_0827fe39_a1f1_4c1e_a613_0ae35e4d8417_ctl00_btnsaveandcontinueVal")
	private WebElement save_continue1;
	
	
	@FindBy(id="ctl00_ctl60_g_0827fe39_a1f1_4c1e_a613_0ae35e4d8417_ctl00_btnpersonalsaveVal")
	private WebElement save_continue2;
	
	
	@FindBy(xpath="//input[@value='Update']")
	private WebElement clickUpdateBtn;
	
	
	
	public JS_02_ProfileUpdate(WebDriver driver)
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	public void setSave_continue1()
	{
		save_continue1.click();
	}
	

	public void setSave_continue2()
	{
		save_continue2.click();
	}
	
	public void setUpdate()
	{
		clickUpdateBtn.click();
	}
}
