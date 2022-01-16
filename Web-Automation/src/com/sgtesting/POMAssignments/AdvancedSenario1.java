package com.sgtesting.POMAssignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedSenario1 {
	private static WebDriver wb = null;
	private static ActiTimePage opage = null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		FlyOutWindow();
		createUser1();
		createUser2();
		createUser3();
		logout();
		loginUser1();
		logout(); // logout user 1
		loginUser2();
		logout(); // logout user 2
		loginUser3();
		logout(); // logout user 3
		login(); // login admin
		modifyUsers();	
		logout();
		loginModifyUser1();
		logout(); // logout user 1
		loginModifyUser2();
		logout(); // logout user 2
		loginModifyUser3();
		logout(); // logout user 3
		login();
		deleteModifiedUsers();
//		logout();
//		closeApplication();
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

	private static void createUser1() {
		try {
			Thread.sleep(6000);
			opage.getUserContainer().click();
			Thread.sleep(2000);
			opage.adduserButton().click();
			opage.getfirstNametxt().sendKeys("Tom");
			opage.getlastNametxt().sendKeys("User 1");
			opage.getmail().sendKeys("abs@gmail.com");
			opage.geUserName().sendKeys("Tom");
			opage.gePassword().sendKeys("abs");
			opage.gePasswordCopy().sendKeys("abs");
			Thread.sleep(2000);
			opage.clickCreateUser().click();
			System.out.println("User 1 is created");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void createUser2() {
		try {
			Thread.sleep(3000);
			opage.adduserButton().click();
			opage.getfirstNametxt().sendKeys("Jerry");
			opage.getlastNametxt().sendKeys("User 2");
			opage.getmail().sendKeys("abs@gmail.com");
			opage.geUserName().sendKeys("Jerry");
			opage.gePassword().sendKeys("abs");
			opage.gePasswordCopy().sendKeys("abs");
			Thread.sleep(2000);
			opage.clickCreateUser().click();
			System.out.println("User 2 is created");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void createUser3() {
		try {
			Thread.sleep(6000);
			opage.getUserContainer().click();
			;
			Thread.sleep(2000);
			opage.adduserButton().click();
			opage.getfirstNametxt().sendKeys("Sherlock");
			opage.getlastNametxt().sendKeys("User 3");
			opage.getmail().sendKeys("abs@gmail.com");
			opage.geUserName().sendKeys("Sherlock");
			opage.gePassword().sendKeys("abs");
			opage.gePasswordCopy().sendKeys("abs");
			Thread.sleep(2000);
			opage.clickCreateUser().click();
			System.out.println("User 3 is created");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void loginUser1() {
		try {
			opage.getUserName().sendKeys("Tom");
			Thread.sleep(1000);
			opage.getPassword().sendKeys("abs");
			opage.getLoginButton().click();
			Thread.sleep(2000);
			opage.getStartExploreBtn().click();
			System.out.println("Login User 1 Successfull");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void loginUser2() {
		try {
			opage.getUserName().sendKeys("Jerry");
			opage.getPassword().sendKeys("abs");
			opage.getLoginButton().click();
			Thread.sleep(2000);
			opage.getStartExploreBtn().click();
			System.out.println("Login User 2 Successfull");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void loginUser3() {
		try {
			opage.getUserName().sendKeys("Sherlock");
			opage.getPassword().sendKeys("abs");
			opage.getLoginButton().click();
			Thread.sleep(2000);
			opage.getStartExploreBtn().click();
			System.out.println("Login User 3 Successfull");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void modifyUsers() {
		try {
			Thread.sleep(4000);
			opage.getUserContainer().click();
			Thread.sleep(4000);
			opage.clickUserA().click();
			Thread.sleep(2000);
			opage.getfirstNametxt().click();
			Thread.sleep(2000);
			opage.getfirstNametxt().clear();
			Thread.sleep(3000);
			opage.getfirstNametxt().sendKeys("Demo 1");
			Thread.sleep(6000);
			opage.clickSaveBtn().click();
			System.out.println("User 1 is modified");
			Thread.sleep(4000);
			opage.clickUserB().click();
			Thread.sleep(2000);
			opage.getfirstNametxt().click();
			Thread.sleep(2000);
			opage.getfirstNametxt().clear();
			Thread.sleep(3000);
			opage.getfirstNametxt().sendKeys("Demo 2");
			Thread.sleep(6000);
			opage.clickSaveBtn().click();
			System.out.println("User 2 is modified");
			Thread.sleep(4000);
			opage.clickUserC().click();
			Thread.sleep(2000);
			opage.getfirstNametxt().click();
			Thread.sleep(2000);
			opage.getfirstNametxt().clear();
			Thread.sleep(3000);
			opage.getfirstNametxt().sendKeys("Demo 3");
			Thread.sleep(6000);
			opage.clickSaveBtn().click();
			System.out.println("User 3 is modified");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void loginModifyUser1() {
		try {
			opage.getUserName().sendKeys("Tom");
			Thread.sleep(1000);
			opage.getPassword().sendKeys("abs");
			opage.getLoginButton().click();
			Thread.sleep(2000);
			//opage.getStartExploreBtn().click();
			System.out.println("Login Modified User 1 Successfull");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void loginModifyUser2() {
		try {
			opage.getUserName().sendKeys("Jerry");
			opage.getPassword().sendKeys("abs");
			opage.getLoginButton().click();
			Thread.sleep(2000);
			//opage.getStartExploreBtn().click();
			System.out.println("Login Modified User 2 Successfull");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void loginModifyUser3() {
		try {
			opage.getUserName().sendKeys("Sherlock");
			opage.getPassword().sendKeys("abs");
			opage.getLoginButton().click();
			Thread.sleep(2000);
			//opage.getStartExploreBtn().click();
			System.out.println("Login Modified User 3 Successfull");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void deleteModifiedUsers() {
		try {
			Thread.sleep(4000);
			opage.clickUserA().click();
			Thread.sleep(3000);
			opage.clickDelete().click();
			Thread.sleep(3000);
			Alert oAlert = wb.switchTo().alert();
			oAlert.accept();
			System.out.println("Modified User 1 deleted");
			Thread.sleep(4000);
			opage.clickUserB().click();
			Thread.sleep(3000);
			opage.clickDelete().click();
			Thread.sleep(3000);
			//Alert oAlert = wb.switchTo().alert();
			oAlert.accept();
			System.out.println("Modified User 2 deleted");
			Thread.sleep(4000);
			opage.clickUserC().click();
			Thread.sleep(3000);
			opage.clickDelete().click();
			Thread.sleep(3000);
			//Alert oAlert = wb.switchTo().alert();
			oAlert.accept();
			System.out.println("Modified User 3 deleted");
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
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
