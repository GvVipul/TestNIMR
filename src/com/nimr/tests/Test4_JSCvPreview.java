package com.nimr.tests;

import java.util.Set;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.nimr.pages.pom.Dashboard;
import com.nimr.pages.pom.JS_04_CvPreviewPage;
import com.nimr.pages.pom.homePage;

import generics.baseTest;

public class Test4_JSCvPreview extends baseTest {

	@Test(groups={"smoke"},priority=4,alwaysRun=true)
	@Parameters
	public void testCvPreviewJS() throws InterruptedException
	{
		//*Login from home page to dashboard
		homePage l=new homePage(driver);
		l.setSignin();
		l.setEoman();
		l.setSign2();
		l.setNatid("03113729");
		l.setLoginbtn();
		l.setJSlogin();
		
		//from dashboard to update profile
		Dashboard d=new Dashboard(driver);
				
		//click on CvPreview link in dashboard
		d.setCvPreview();
		
		
		JS_04_CvPreviewPage cvPreview=new JS_04_CvPreviewPage(driver);
		
		//click on print cv button on cv preview page
		cvPreview.setprintCV();
		Set<String> windowsList = driver.getWindowHandles();
		//int countOfWindows=windowsList.size();
		for(String wh:windowsList)
		{
			Reporter.log(wh);
			driver.switchTo().window(wh);
			driver.close();
		}
	}
}
