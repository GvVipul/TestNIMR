package generics;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;



	
	@Listeners(FWListeners.class)
	public abstract class baseTest implements IAutoConst
	{
		public WebDriver driver;
		@BeforeSuite
		public void setDriverPath()
		{
			System.setProperty(CHROME_KEY,CHROME_VALUE);
			System.setProperty(GECKO_KEY, GECKO_VALUE);
		}
		
		@Parameters({"node","browser"})
		@BeforeMethod(alwaysRun=true)
		public void openApp(String node,String browser) throws MalformedURLException
		{
			URL whichSystem=new URL(node);
			DesiredCapabilities whichBrowser=new DesiredCapabilities();
			whichBrowser.setBrowserName(browser);
			driver=new RemoteWebDriver(whichSystem,whichBrowser);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
			String URL=UtilityLib.getPropertyValue(CONFIG_PATH, "URL");
			driver.get(URL);
			
		}
			
		
		@AfterMethod
		public void closeApp() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.close();
		}
	}


