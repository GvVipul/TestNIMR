package com.nimr.pages.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {

	// jobcurrent openings link  in  JS dashboard
	@FindBy(id="ctl00_ctl60_g_eba7d7c3_68ba_416f_bb2d_7c9f7a51364d_ctl00_lbljobopening")
	private WebElement JobCurrentOpenings;
	
	
	// Training Program current openings link in JS dashboard
	@FindBy(id="ctl00_ctl60_g_eba7d7c3_68ba_416f_bb2d_7c9f7a51364d_ctl00_lbltpopening")
	private WebElement trainingProgramOpeningsLink;
	
	
	// profile update link in  JS dashboard
	@FindBy(xpath="//a[text()='Profile Update']")
	private WebElement profileUpdate;
	
	
	//Location of cv update link in dashboard
	@FindBy(xpath="//a[text()='CV Update']")
	private WebElement cvUpdateLink;
	
	
	//Location of CV Preview link on JS dashboard
	@FindBy(id="ctl00_ctl60_g_eba7d7c3_68ba_416f_bb2d_7c9f7a51364d_ctl00_lnkcvpreview")
	private WebElement cvPreviewLink;
	
	
	// location of job alert link in JS dashboard
	@FindBy(xpath="//a[text()='Job Alert']")
	private WebElement jobAlertLink;
	
	
	// Location of Job alert under Quick links
	@FindBy(id="ctl00_ctl66_g_eba7d7c3_68ba_416f_bb2d_7c9f7a51364d_ctl00_UCJobSeeker_HyperLink12")
	private WebElement QuickJobAlertLink;
	
	//Location of request letter under quick access
	@FindBy(xpath="//a[text()='Request Letters']")
	private WebElement reqLetter;
	
	
	// Location of quick access link in JS dashboard page
	@FindBy(id="menuToggle")
	private WebElement quickAccess;
	
	
	//Location of My Nominated jobs link in dashboard
	@FindBy(id="ctl00_ctl60_g_eba7d7c3_68ba_416f_bb2d_7c9f7a51364d_ctl00_lbljobnominated")
	private WebElement myNominatedJobsLink;
	
	
	//Location of My nominated TP in dashboard
	@FindBy(id="ctl00_ctl60_g_eba7d7c3_68ba_416f_bb2d_7c9f7a51364d_ctl00_lbltpnominated")
	private WebElement MyNominatedTPLink;
	
	
	// Location of signout button
	@FindBy(xpath="//a[@href='/PamrAuth/SingleSignOut.aspx?language=en']")
	private WebElement signoutBtn;
	
	
	//Constructor to initialize the elements in dashboard page
	public Dashboard(WebDriver driver)
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	
	//Method to click on Job current openings link in dashboard
	public void setJobCurrentOpenings()
	{
		JobCurrentOpenings.click();
	}
	
	//method to click on profile update link in dashboard
	public void setProfileUpdate()
	{
		profileUpdate.click();
	}
	
	
	//Method to click on training program current openings link in dashboard
	public void settrainingProgramOpeningsLink()
	{
	
		trainingProgramOpeningsLink.click();
	}
	
	//method to click on cv update link in dashboard
	public void setcvUpdateLink()
	{
		cvUpdateLink.click();
	}
	
	// method to click on cv preview link on dashboard
	public void setCvPreview()
	{

		cvPreviewLink.click();
	}
	
	
	// method to click on quick assess link in dashboard
	public void setquickAccess()
	{
		quickAccess.click();
	}
	
	// method to click on signout button
	public void setSignoutBtn()
	{
		signoutBtn.click();
	}
	
	
	// method to click on job Alert link in dashboard
	public void setJobAlertLink()
	{
		jobAlertLink.click();
	}
	
	
	//method to click on My Nominated Jobs Link in dashboard
	public void setmyNominatedJobsLink()
	{
		myNominatedJobsLink.click();
	}

	
	//method to click on My nominated TP link in dashboard
	public void setMyNominatedTPLink()
	{
		MyNominatedTPLink.click();
	}
	
	
	//method to click on request letter under quick access
	public void setRequestLetter()
	{
		reqLetter.click();
	}

	
	//Method to click on Job alert link under quick access
	public void setQuickJobAlertLink()
	{
		QuickJobAlertLink.click();
	}
}
