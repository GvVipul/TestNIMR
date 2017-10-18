package com.nimr.pages.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class JS_02_ProfileUpdate {

	
	//Location of browse button to upload pic
	@FindBy(id="ctl00_ctl60_g_0827fe39_a1f1_4c1e_a613_0ae35e4d8417_ctl00_fileImage")
	private WebElement browseBtn;
		
		
	//Location of Upload btn to upload picture of JS
	@FindBy(id="ctl00_ctl60_g_0827fe39_a1f1_4c1e_a613_0ae35e4d8417_ctl00_btnphotouploadDoc")
	private WebElement uploadBtn;
		
		
		
	//location of save and continue button in step 1 page
	@FindBy(xpath="//input[@type='submit']")
	private WebElement save_continue1;
	
	
	//location of save and continue button in step 2 page
	@FindBy(id="ctl00_ctl60_g_0827fe39_a1f1_4c1e_a613_0ae35e4d8417_ctl00_btnpersonalsaveVal")
	private WebElement save_continue2;
	
	
	//location of Update button in step 3 page
	@FindBy(xpath="//input[@value='Update']")
	private WebElement clickUpdateBtn;
	
	
	//constructor to initialize the objects in Update profile page
	public JS_02_ProfileUpdate(WebDriver driver)
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	
	//Method to perform action on upload button
	public void setUploadBtn()
	{
		uploadBtn.click();
	}
	
	
	//Method to perform action on browse button
	public void setBrowseBtn()
	{
		browseBtn.click();
		
	}
	
	
	//method to click on save and continue button in step 1 page
	public void setSave_continue1()
	{
		save_continue1.click();
	}
	
	
	//method to click on save and continue button in step 2 page
	public void setSave_continue2()
	{
		save_continue2.click();
	}
	
	
	//method to click on update button on step 3 page
	public void setUpdate()
	{
		clickUpdateBtn.click();
	}
}
