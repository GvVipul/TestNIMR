package com.nimr.tests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.nimr.pages.pom.Dashboard;
import com.nimr.pages.pom.JS_03_SearchTPResultPage;
import com.nimr.pages.pom.homePage;

import generics.UtilityLib;
import generics.baseTest;

public class test3_JsApplyForTP extends baseTest{

	@Test(groups={"smoke"},priority=3,alwaysRun=false)
	@Parameters
	public void testApplyTP() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
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
				
		// from dashboard to apply TP
				
				Dashboard d=new Dashboard(driver);
				d.settrainingProgramOpeningsLink();
				
				JS_03_SearchTPResultPage applyTP=new JS_03_SearchTPResultPage(driver);
				applyTP.setclickOnTPlink();
				applyTP.setapplyNowBtn();
				
	}
}
