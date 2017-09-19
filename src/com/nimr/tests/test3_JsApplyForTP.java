package com.nimr.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.nimr.pages.pom.Dashboard;
import com.nimr.pages.pom.JS_03_SearchTPResultPage;
import com.nimr.pages.pom.homePage;

import generics.baseTest;

public class test3_JsApplyForTP extends baseTest{

	@Test(groups={"smoke"},priority=3,alwaysRun=false)
	@Parameters
	public void testApplyTP() throws InterruptedException
	{
		//*Login from home page to dashboard
				homePage l=new homePage(driver);
				l.setSignin();
				l.setEoman();
				l.setSign2();
				l.setNatid("03113729");
				l.setLoginbtn();
				l.setJSlogin();
				
		// from dashboard to apply TP
				
				Dashboard d=new Dashboard(driver);
				d.settrainingProgramOpeningsLink();
				
				JS_03_SearchTPResultPage applyTP=new JS_03_SearchTPResultPage(driver);
				applyTP.setclickOnTPlink();
				applyTP.setapplyNowBtn();
				
	}
}
