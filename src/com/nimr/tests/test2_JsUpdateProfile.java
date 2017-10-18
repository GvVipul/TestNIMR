package com.nimr.tests;

import java.io.IOException;

import generics.UtilityLib;
import generics.baseTest;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.nimr.pages.pom.Dashboard;
import com.nimr.pages.pom.JS_02_ProfileUpdate;
import com.nimr.pages.pom.homePage;

public class test2_JsUpdateProfile extends baseTest {

	@Test(groups={"smoke"},priority=2,alwaysRun=true)
	@Parameters
	public void testUpdateProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		//*Login from home page to dashboard
		
		homePage l=new homePage(driver);
		l.setSignin();
		l.setEoman();
		l.setSign2();
		// Enter id into national id field from excel - 1st row
		String NationalID=UtilityLib.getCellValue(INPUT_PATH,"NationalID",0,0);
		
		l.setNatid(NationalID);	
		l.setLoginbtn();
		l.setJSlogin();
		
		
		//from dashboard to update profile
		Dashboard d=new Dashboard(driver);
		
		//click on update profile link in dashboard
		d.setProfileUpdate();
		
		JS_02_ProfileUpdate updateProfile=new JS_02_ProfileUpdate(driver);
		
		//Click on browse button for Upload Profile Picture field
		updateProfile.setBrowseBtn();
		
		
		// Executing AutoIt to upload photo of JS
		try
		{
			Runtime r=Runtime.getRuntime();
			r.exec("D:\\Vipul\\SQL\\JS_UpdatePage.exe");
		}
		catch(Exception e)
		{
			System.out.println("Error in executing AutoIt under Test2_JsUpdateProfile");
		}
		
		Thread.sleep(15000);
		UtilityLib.getImplicitWait(driver);
		// Click on upload button for Upload Profile Picture field
		updateProfile.setUploadBtn();
		
		
		
		
		//click on save and continue button in first page
		updateProfile.setSave_continue1();
		
		//click on save and continue button in second page
		updateProfile.setSave_continue2();
		
		//click on update button in third page
		updateProfile.setUpdate();
		
	}
}
