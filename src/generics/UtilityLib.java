package generics;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityLib {

	//** gets screenshot of page **//
	public static void getScreenshot(WebDriver driver,String path) throws IOException
	{
		try
		{
		TakesScreenshot t=(TakesScreenshot)driver;
		File srcFile = t.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File(path));
		}
		catch(Exception e)
		{
			System.out.println("error in screenshot");
		}
	}
	
	
	
	//** get screenshot of entire desktop  **//
	public static void getScreenshot(String path) throws AWTException, IOException
	{
		try
		{
		Robot r=new Robot();
		Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
		BufferedImage img = r.createScreenCapture(new Rectangle(d));
		ImageIO.write(img, "png",new File(path));
		}
		catch(Exception e)
		{
			System.out.println("error in robot");
		}
	}

	
	
	//** get date format to save the screenshot  **//
	public static String now()
	{
		SimpleDateFormat s=new SimpleDateFormat("dd_MM_yy_hh_mm_ss");
		return s.format(new Date());
	}
	
	
	//**  get data from excel  **//
	public static String getCellValue(String path,String sheet,int r,int c) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		String v="";
		try
		{
		Workbook w=WorkbookFactory.create(new FileInputStream(path));
		v=w.getSheet(sheet).getRow(r).getCell(c).toString();
		}
		catch(Exception e)
		{
			System.out.println("error in excel");
		}
		return v;
	}
	
	
	//**  get row count from excel   **//
	public static int rowCount(String path,String Sheet)
	{
		int r=0;
		try
		{
			Workbook w=WorkbookFactory.create(new FileInputStream(path));
			r=w.getSheet(Sheet).getLastRowNum();
		}
		catch(Exception e)
		{
			System.out.println("error in last row count");
		}
		return r;
	}
	
	//** config file
	
	public static String getPropertyValue(String path,String key)
	{
		String v=" ";
		try
		{
			Properties p=new Properties();
			p.load(new FileInputStream(path));
			v=p.getProperty(key);
		}
		catch(Exception e)
		{
			
		}
		return v;
	}


	}