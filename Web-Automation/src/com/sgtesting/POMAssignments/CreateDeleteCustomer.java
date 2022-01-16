package com.sgtesting.POMAssignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//3) launchBrowser-->navigate-->login-->createCustomer-->deleteCustomer-->logout -->closeApplication
public class CreateDeleteCustomer {
	private static WebDriver wb = null;
	private static ActiTimePage opage = null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		FlyOutWindow();
		createCustomer();
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
			opage.getcustomerName().sendKeys("Infosys");
			opage.clickCreateCustomer().click();
			System.out.println("Customer creation successful");
		} catch (Exception w) {
			w.printStackTrace();
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
