package com.nimr.pages.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {

	// jobcurrent openings link  in dashboard
	@FindBy(id="ctl00_ctl60_g_eba7d7c3_68ba_416f_bb2d_7c9f7a51364d_ctl00_lbljobopening")
	private WebElement JobCurrentOpenings;
	
	// Training Program current openings link in dashboard
	@FindBy(id="ctl00_ctl60_g_eba7d7c3_68ba_416f_bb2d_7c9f7a51364d_ctl00_lbltpopening")
	private WebElement trainingProgramOpeningsLink;
	
	// profile update link in dashboard
	@FindBy(xpath="//a[text()='Profile Update']")
	private WebElement profileUpdate;
	
	//Location of CV Preview link on dashboard
	@FindBy(id="ctl00_ctl60_g_eba7d7c3_68ba_416f_bb2d_7c9f7a51364d_ctl00_lnkcvpreview")
	private WebElement cvPreviewLink;
	
	// signout button
	@FindBy(id="signOutlink")
	private WebElement signoutBtn;
	
	public Dashboard(WebDriver driver)
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	public void setJobCurrentOpenings()
	{
		JobCurrentOpenings.click();
	}
	
	public void setProfileUpdate()
	{
		profileUpdate.click();
	}
	
	public void settrainingProgramOpeningsLink()
	{
		//click on training program current openings link in dashboard
		trainingProgramOpeningsLink.click();
	}
	
	public void setCvPreview()
	{
		//click on cv preview link on dashboard
		cvPreviewLink.click();
	}
	
	public void setSignoutBtn()
	{
		signoutBtn.click();
	}
}
