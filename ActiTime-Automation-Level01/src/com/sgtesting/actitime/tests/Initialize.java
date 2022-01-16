package com.sgtesting.actitime.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Initialize {
	public static WebDriver obrowser=null;
	/**
	 * Created By: Harish M
	 * Created Date: 13-01-2021
	 * Test case ID: TC_Initialize_01
	 * Reviewed By: 
	 * Reviewed Date:
	 * Parameters:
	 * Return Value:
	 * Purpose:
	 * Description:
	 */
	public static void launchBrowser()
	{
		String path=null;
		try
		{
			System.setProperty("webdriver.chrome.driver",".\\Library\\drivers\\chromedriver.exe");
			//System.out.println(path);
			obrowser=new ChromeDriver();
			obrowser.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	/**
	 * Created By:
	 * Created Date:
	 * Test case ID:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return Value:
	 * Purpose:
	 * Description:
	 */
	public static void navigate()
	{
		try
		{
			obrowser.navigate().to("http://localhost:82/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	/**
	 * Created By:
	 * Created Date:
	 * Test case ID:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return Value:
	 * Purpose:
	 * Description:
	 */
	public static void closeApplication()
	{
		try
		{
			obrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

}
