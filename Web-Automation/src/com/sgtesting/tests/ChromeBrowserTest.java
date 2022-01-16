package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {
	private static WebDriver obrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		logout();
		closeApplication();
	}
	
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\Java\\Web Driver\\chromedriver.exe");
			obrowser = new ChromeDriver();
			System.out.println("browser launched");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			obrowser.get("http://localhost:82/login.do");
			Thread.sleep(4000);
			System.out.println("navigation done");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void closeApplication()
	{
		try
		{
			obrowser.close();
			System.out.println("Appliation closed");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			obrowser.findElement(By.xpath("//a[text()='Logout']")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
