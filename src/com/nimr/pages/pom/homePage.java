package com.nimr.pages.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class homePage{

	@FindBy(id="SignInLink")
	private WebElement signin;

	//entering national id page
	@FindBy(xpath="//a[@href='/PamrAuth/MockSSO.aspx?auth=un']")
	private WebElement sign2;
	
	//service selection page, selecting eoman option
	@FindBy(xpath="//a[text()='e.Oman']")
	private WebElement eoman;
	
	//national id field location
	@FindBy(id="ctl00_body_txtNationalID")
	private WebElement natid;
	
	@FindBy(id="ctl00_body_btnLogin")
	private WebElement loginBtn;
	
	//click on continue as JS in service selection page
	@FindBy(xpath="//input[@value='Continue as Job Seeker']")
	private WebElement JSlogin;
	
	
	public homePage(WebDriver driver)
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	public void setSignin()
	{
		signin.click();
	}
	
	public void setEoman()
	{
		eoman.click();
	}
	
	public void setSign2()
	{
		sign2.click();
	}
	
	public void setNatid(String un) throws InterruptedException
	{
		natid.clear();
		Thread.sleep(1000);
		natid.sendKeys(un);
	}
	
	public void setLoginbtn()
	{
		loginBtn.click();
	}
	
	public void setJSlogin()
	{
		JSlogin.click();
	}
}
