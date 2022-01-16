package com.sgtesting.actitime.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Customers extends Initialize{
	
	/**
	 * Created By: Harish M
	 * Created Date: 13-01-2021
	 * Test case ID: TC_Customers_01
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return Value:
	 * Purpose:
	 * Description:
	 */
	public static void createCustomer()
	{
		try
		{
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//div[text()='TASKS']")).click();
			Thread.sleep(3000);
			obrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")).click();
			obrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Accenture");
			obrowser.findElement(By.xpath("//span[text()='Create Customer']")).click();
			System.out.println("Customer created successfully");
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
	public static void modifyCustomer()
	{
		try
		{
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//div[@class='editButton available']")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//div[text()='    Active    ']")).click();
			obrowser.findElement(By.xpath("//div[text()='Archived']")).click();
			obrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[1]")).click();
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
	public static void deleteCustomer()
	{
		try
		{
			Thread.sleep(5000);
			obrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(3000);
			obrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div")).click();
			Thread.sleep(3000);
			obrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(3000);
			obrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
			System.out.println("Customer deleted successfully");
			Thread.sleep(3000);		

		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

}
