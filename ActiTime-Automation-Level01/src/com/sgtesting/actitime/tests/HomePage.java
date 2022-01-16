package com.sgtesting.actitime.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Initialize{
	
	/**
	 * Created By: Harish M
	 * Created Date: 13-01-2021
	 * Test case ID: TC_HomePage_01
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return Value:
	 * Purpose:
	 * Description:
	 */
	public static void minimizeFlyOutWindow()
	{
		try
		{
			Thread.sleep(3000);
			obrowser.findElement(By.xpath("//div[@class='gettingStartedShortcutsLabel']")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

}
