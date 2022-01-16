package com.sgtesting.POMAssignments;

//5) launchBrowser-->navigate-->login-->createCustomer-->CreateProject-->DeleteProject-->deleteCustomer-->logout -->closeApplication

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateDeleteProject {
	private static WebDriver wb = null;
	private static ActiTimePage opage = null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		FlyOutWindow();
		createCustomer();
		createProject();
		deleteProject();
		deleteCustomer();
		logout();
		closeApplication();
	}
	
	private static void launchBrowser() {
		try {
			String path = System.getProperty("user.dir");
			System.out.println(path);
			System.setProperty("webdriver.chrome.driver", path + "\\library\\drivers\\chromedriver.exe");
			wb = new ChromeDriver();
			opage = new ActiTimePage(wb);
			System.out.println("Chrome Browser launched successfully");
		} catch (Exception e) {
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

	private static void login() {
		try {
			opage.getUserName().sendKeys("admin");
			opage.getPassword().sendKeys("manager");
			opage.getLoginButton().click();
			Thread.sleep(2000);
			System.out.println("Login successfull with provided credential");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void FlyOutWindow() {
		try {
			Thread.sleep(6000);
			opage.getFlyOutWindow().click();
			System.out.println("FlyOut Window closed");
		} catch (Exception w) {
			w.printStackTrace();
		}
	}
	
	private static void createCustomer() {
		try {
			Thread.sleep(5000);
			opage.clickTaskContainer().click();
			Thread.sleep(2000);
			opage.clickAddnew().click();
			Thread.sleep(3000);
			opage.clickCustomer().click();
			Thread.sleep(2000);
			opage.getcustomerName().sendKeys("Accenture");
			opage.clickCreateCustomer().click();
			System.out.println("Customer creation successful");
		} catch (Exception w) {
			w.printStackTrace();
		}
	}
	
	private static void createProject()
	{
		try
		{
			opage.clickAddnew().click();
			Thread.sleep(3000);
			opage.newProject().click();
			Thread.sleep(3000);
			opage.projectName().sendKeys("Project QA");
			Thread.sleep(2000);
			opage.clickCreateProject().click();
			System.out.println("New Project is created");
		}
		catch(Exception w)
		{
			w.printStackTrace();
		}
	}
	private static void deleteProject()
	{
		try
		{
//		opage.clickTaskContainer().click();
			Thread.sleep(3000);
			opage.viewProjectSetting().click();
			Thread.sleep(4000);
			opage.projectActionBtn2().click();
			Thread.sleep(3000);
			opage.BtnDeleteProject().click();
			Thread.sleep(3000);
			opage.deletePerBtn().click();
			System.out.println("Delete project successful");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteCustomer() {
		try {
			Thread.sleep(5000);
//			opage.clickTaskContainer().click();
//			Thread.sleep(3000);
			opage.clickSetting().click();
			Thread.sleep(3000);
			opage.actionButton().click();
			Thread.sleep(3000);
			opage.deletebutton().click();
			Thread.sleep(3000);
			opage.deletePerAction().click();
			System.out.println("Delete customer successful");
			
		} catch (Exception w) {
			w.printStackTrace();
		}
	}
	
	private static void logout() {
		try {
			opage.logoutUser().click();
			;
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
