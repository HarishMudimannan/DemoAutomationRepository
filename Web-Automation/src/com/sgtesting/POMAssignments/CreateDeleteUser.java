package com.sgtesting.POMAssignments;

// 1) launchBrowser-->navigate-->login-->createUser-->deleteUser-->logout -->closeApplication
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateDeleteUser {
	private static WebDriver wb= null;
	private static ActiTimePage opage = null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		FlyOutWindow();
		createUser();
		deleteUser();
		logout();
		closeApplication();
	}
	
	private static void launchBrowser()
	{
		try
		{
			String path = System.getProperty("user.dir");
			System.out.println(path);
			System.setProperty("webdriver.chrome.driver", path+"\\library\\drivers\\chromedriver.exe");
			wb = new ChromeDriver();
			opage= new ActiTimePage(wb);
			System.out.println("Chrome Browser launched successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate() {
		try {
			wb.manage().window().maximize();
			wb.get("http://localhost:82/login.do");
			Thread.sleep(4000);
			System.out.println("navigation done to ActiTime application");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void login()
	{
		try
		{
			opage.getUserName().sendKeys("admin");
			opage.getPassword().sendKeys("manager");
			opage.getLoginButton().click();
			Thread.sleep(2000);
			System.out.println("Login successfull with provided credential");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void FlyOutWindow()
	{
		try
		{
			Thread.sleep(6000);
			opage.getFlyOutWindow().click();
			System.out.println("FlyOut Window closed");
		}
		catch(Exception w)
		{
			w.printStackTrace();
		}
	}
	
	private static void createUser() {
		try {
			Thread.sleep(6000);
			opage.getUserContainer().click();;
			Thread.sleep(2000);
			opage.adduserButton().click();
			opage.getfirstNametxt().sendKeys("Demo");
			opage.getlastNametxt().sendKeys("User 1");
			opage.getmail().sendKeys("abs@gmail.com");
			opage.geUserName().sendKeys("Harish");
			opage.gePassword().sendKeys("abs");
			opage.gePasswordCopy().sendKeys("abs");
			Thread.sleep(2000);
			opage.clickCreateUser().click();
			System.out.println("User 1 is created");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void deleteUser() {
		try {
			Thread.sleep(6000);
			opage.clickUser1().click();
			Thread.sleep(3000);
			opage.clickDelete().click();
			Thread.sleep(3000);
			Alert oAlert=wb.switchTo().alert();
			oAlert.accept();
			System.out.println("User 1 deleted");
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void logout() {
		try {
			opage.logoutUser().click();;
			System.out.println("Logout successfull");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void closeApplication() {
		try {
			wb.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
