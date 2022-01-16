package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FireFoxDemo {
	private static WebDriver obrowser = null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		closeApplication();
	}

	private static void launchBrowser() {
		try {
			System.setProperty("webdriver.gecko.driver","D:\\Java\\Web Driver\\geckodriver.exe");
			obrowser = new ChromeDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void navigate() {
		try {
			obrowser.get("http://localhost:82/login.do");
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void closeApplication() {
		try {
			obrowser.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
