package com.sgtesting.log4j;

import org.apache.log4j.Logger;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutDemo {
	private static WebDriver obrowser = null;
	public static Logger log = Logger.getLogger("LoginLogout Test case result: ");

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		loginUser();
		closeFlyoutWindow();
		logout();
		closeApplication();
	}

	private static void launchBrowser() {
		try {
			String path = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path + "\\library\\drivers\\chromedriver.exe");
			obrowser = new ChromeDriver();
			log.info("Broswer Launched Successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void navigate() {
		try {
			obrowser.manage().window().maximize();
			obrowser.get("http://localhost:82/login.do");
			Thread.sleep(4000);
			log.info("navigation done");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void closeFlyoutWindow() {
		try {
			Thread.sleep(4000);
			obrowser.findElement(By.xpath("//div[text()='Getting Started Shortcuts']")).click();
			log.info("Fly out window is closed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void closeApplication() {
		try {
			obrowser.close();
			log.info("Appliation closed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void loginUser() {
		try {
			obrowser.findElement(By.id("username")).sendKeys("admin");
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(5000);
			log.info("User login successful");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void logout() {
		try {
			obrowser.findElement(By.xpath("//a[text()='Logout']")).click();
			log.info("Logout successfully");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
