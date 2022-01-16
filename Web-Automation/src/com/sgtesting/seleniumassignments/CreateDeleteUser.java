package com.sgtesting.seleniumassignments;

import org.openqa.selenium.Alert;

//1) launchBrowser-->navigate-->login-->createUser-->deleteUser-->logout -->closeApplication

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateDeleteUser {
	private static WebDriver obrowser = null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		loginUser();
		closeFlyoutWindow();
		createUser();
		deleteUser();
		logout();
		closeApplication();
	}

	public static void launchBrowser() {
		try {
			String path=System.getProperty("user.dir");
			System.out.println(path);
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			obrowser = new ChromeDriver();
			System.out.println("browser launched");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void navigate() {
		try {
			obrowser.manage().window().maximize();
			obrowser.get("http://localhost:82/login.do");
			Thread.sleep(4000);
			System.out.println("navigation done");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void closeFlyoutWindow() {
		try
		{
			Thread.sleep(4000);
			obrowser.findElement(By.xpath("//div[text()='Getting Started Shortcuts']")).click();
			System.out.println("Fly out window is closed");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void closeApplication() {
		try {
			obrowser.close();
			System.out.println("Appliation closed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void loginUser() {
		try {
			obrowser.findElement(By.id("username")).sendKeys("admin");
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(5000);
			System.out.println("User login successful");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void createUser() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(5000);
			obrowser.findElement(By.name("firstName")).sendKeys("Demo");
			obrowser.findElement(By.name("lastName")).sendKeys("User1");
			obrowser.findElement(By.name("email")).sendKeys("abs@gmail.com");
			obrowser.findElement(By.name("username")).sendKeys("Harish");
			obrowser.findElement(By.name("password")).sendKeys("abs");
			obrowser.findElement(By.name("passwordCopy")).sendKeys("abs");
			Thread.sleep(3000);
			obrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			System.out.println("User is created");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void deleteUser() {
		try {
			Thread.sleep(5000);
			obrowser.findElement(By.xpath("//span[text()='User1, Demo']")).click();
			Thread.sleep(3000);
			obrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(3000);
			Alert oAlert = obrowser.switchTo().alert();
			oAlert.accept();
			System.out.println("User is deleted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void logout()
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

}
