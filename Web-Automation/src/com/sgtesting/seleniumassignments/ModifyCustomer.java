package com.sgtesting.seleniumassignments;

// 4) launchBrowser-->navigate-->login-->createCustomer-->modifyCustomer-->deleteCustomer-->logout -->closeApplication

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyCustomer {
	private static WebDriver obrowser = null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		loginUser();
		closeFlyoutWindow();
		createCustomer();
//		deleteCustomer();
//		logout();
//		closeApplication();
	}
	private static void launchBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\Java\\Web Driver\\chromedriver.exe");
			obrowser = new ChromeDriver();
			System.out.println("browser launched");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void navigate() {
		try {
			obrowser.manage().window().maximize();
			obrowser.get("http://localhost:82/login.do");
			Thread.sleep(4000);
			System.out.println("navigation done");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void loginUser() {
		try {
			obrowser.findElement(By.id("username")).sendKeys("admin");
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			System.out.println("User login successful");
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void closeFlyoutWindow() {
		try
		{
			Thread.sleep(5000);
			obrowser.findElement(By.xpath("//div[text()='Getting Started Shortcuts']")).click();
			System.out.println("Fly out window is closed");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createCustomer()
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
		}
		catch(Exception a)
		{
			a.printStackTrace();
		}
	}
	
	private static void modifyCustomer()
	{
		try
		{
			Thread.sleep(5000);
			obrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(3000);
//			obrowser.findElement(By.xpath("//div[text()='Accenture']")).click();
//			obrowser.findElement(By.xpath("//div[text()='Accenture']")).clear();
//			obrowser.findElement(By.xpath("//div[text()='Accenture']")).sendKeys("Infosys");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteCustomer()
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
		}
		catch(Exception a)
		{
			a.printStackTrace();
		}
	}
	
	private static void logout()
	{
		try
		{
			obrowser.findElement(By.xpath("//a[text()='Logout']")).click();
			System.out.println("Logout successfully");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void closeApplication() {
		try {
			obrowser.close();
			System.out.println("Appliation closed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
