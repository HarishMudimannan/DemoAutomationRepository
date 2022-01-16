package com.sgtesting.actitime.tests;

import org.openqa.selenium.By;

public class Projects extends Initialize {

	/**
	 * Created By: Harish M Created Date: 13-01-2021 Test case ID: TC_Projects_01
	 * Reviewed By: Reviewed Date: Parameters: Return Value: Purpose: Description:
	 */
	public static void createProject() {
		try {
			obrowser.findElement(By.xpath("//div[text()='TASKS']")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//div[text()='Add New']")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//div[text()='+ New Project']")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\"projectPopup_projectNameField\"]")).sendKeys("Project_QA");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='projectPopup_commitBtn']/div/span")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Created By: Created Date: Test case ID: Reviewed By: Reviewed Date:
	 * Parameters: Return Value: Purpose: Description:
	 */
	public static void modifyProject() {
		try {
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//div[@class='editButton available']")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath(
					"//div[@class='active']"))
					.click();
			Thread.sleep(5000);
			obrowser.findElement(By.xpath("//div[text()='Archived']")).click();
			Thread.sleep(6000);
			System.out.println("Project modified");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Created By: Created Date: Test case ID: Reviewed By: Reviewed Date:
	 * Parameters: Return Value: Purpose: Description:
	 */
	public static void deleteProject() {
		try {
			obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr/td[3]/a")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id='projectPanel_deleteConfirm_submitTitle']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
