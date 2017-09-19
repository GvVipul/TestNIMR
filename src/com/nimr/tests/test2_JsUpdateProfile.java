package com.nimr.tests;

import generics.baseTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.nimr.pages.pom.Dashboard;
import com.nimr.pages.pom.JS_02_ProfileUpdate;
import com.nimr.pages.pom.homePage;

public class test2_JsUpdateProfile extends baseTest {

	@Test(groups={"smoke"},priority=2,alwaysRun=true)
	@Parameters
	public void testUpdateProfile() throws InterruptedException
	{
		//*Login from home page to dashboard
		
		homePage l=new homePage(driver);
		l.setSignin();
		l.setEoman();
		l.setSign2();
		l.setNatid("187731");
		l.setLoginbtn();
		l.setJSlogin();
		
		
		//from dashboard to update profile
		Dashboard d=new Dashboard(driver);
		
		//click on update profile link in dashboard
		d.setProfileUpdate();
		
		JS_02_ProfileUpdate updateProfile=new JS_02_ProfileUpdate(driver);
		
		//click on save and continue button in first page
		updateProfile.setSave_continue1();
		
		//click on save and continue button in second page
		updateProfile.setSave_continue2();
		
		//click on update button in third page
		updateProfile.setUpdate();
		
	}
}
