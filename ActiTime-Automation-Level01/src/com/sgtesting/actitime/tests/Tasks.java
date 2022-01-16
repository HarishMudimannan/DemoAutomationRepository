package com.sgtesting.actitime.tests;

import org.openqa.selenium.By;

public class Tasks extends Initialize{
	
	/**
	  * Created By: Harish M
	 * Created Date: 13-01-2021
	 * Test case ID: TC_Tasks_01
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return Value:
	 * Purpose:
	 * Description:
	 */
	public static void createTask()
	{
		try
		{
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]")).click();
			Thread.sleep(3000);
			obrowser.findElement(By.xpath("//div[text()='Create new tasks']")).click();
			Thread.sleep(1000);
			obrowser.findElement(
					By.xpath("//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[1]/td[1]/input"))
					.sendKeys("Test Script1");
			obrowser.findElement(By.xpath("//*[@id='createTasksPopup_commitBtn']/div/span")).click();

			// wb.findElement(By.xpath("/html/body/div[13]/div[1]")).click();
			Thread.sleep(3000);
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
	public static void deleteTask()
	{
		try
		{
			obrowser.findElement(By.xpath("//div[text()='Test Script1']")).click();
			Thread.sleep(3000);
			obrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[3]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[3]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='taskPanel_deleteConfirm_submitBtn']/div")).click();

		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

}
