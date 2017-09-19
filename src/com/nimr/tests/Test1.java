//JS applying for job
package com.nimr.tests;

import generics.baseTest;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.nimr.pages.pom.Dashboard;
import com.nimr.pages.pom.JS_01_SearchJobResultPage;
import com.nimr.pages.pom.homePage;

public class Test1 extends baseTest {
	
	@Test(groups={"smoke"},priority=1,alwaysRun=true)
	@Parameters
	public void testLogin() throws EncryptedDocumentException, InvalidFormatException, InterruptedException
	{
		//*Login from home page to dashboard
		homePage l=new homePage(driver);
		
		//click on sign in button at top right of the page
		l.setSignin();
		
		// click on eoman option 
		l.setEoman();
		
		// click on sign in button under eoman option
		l.setSign2();
		
		// Enter id into national id field
		l.setNatid("03113729");
		
		//After entering national id click on login button, to direct to service selection page
		l.setLoginbtn();
		
		//click on contimue as JS button in service selection page
		l.setJSlogin();
		
		//From dashboard to apply job
		
		Dashboard d=new Dashboard(driver);
		d.setJobCurrentOpenings();
		
		JS_01_SearchJobResultPage jbsearch=new JS_01_SearchJobResultPage(driver);
		jbsearch.setclickOnJobLink();
		jbsearch.setApplyJob();
		jbsearch.setOK();
		jbsearch.setOK2();
		d.setSignoutBtn();

		Reporter.log("Test Case Pass:JS applied for job",true);
	}
	}