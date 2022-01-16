package com.sgtesting.POMAssignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateDeleteTask {
	public static WebDriver oBrowser=null;
	public static ActiTimePage2 oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		createProject();
		createTask();
		deleteTask();
		deleteProject();
		deleteCustomer();
		logout();
		closeApplication();
	}

	private static void launchBrowser(){
		try{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage2(oBrowser);
			oBrowser.manage().window().maximize();
			System.out.println("Browser Launched");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void navigate(){
		try{
			oBrowser.navigate().to("http://localhost:82/login.do");
			Thread.sleep(4000);
			System.out.println("Navigated to provided URl");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	private static void login(){
		try{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLoginButton().click();
			Thread.sleep(4000);
			System.out.println("Login Admin");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	private static void minimizeFlyOutWindow(){
		try{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
			System.out.println("Minimize Flyout window");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	private static void logout(){
		try{
			oPage.getLogoutLink().click();
			Thread.sleep(2000);
			System.out.println("Logout");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	private static void closeApplication(){
		try{
			oBrowser.close();
			System.out.println("Close application");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	private static void createCustomer() {
		try {
			oPage.getClickOnTask().click();
			Thread.sleep(3000);
			oPage.getAddNewDropdownInTask().click();
			Thread.sleep(3000);
			oPage.getNewCustomerOption().click();
			Thread.sleep(3000);
			oPage.getCustomerNameField().sendKeys("Accenture");
			Thread.sleep(3000);
			oPage.getCustomerDescriptionField().sendKeys("Testing Adding Customer feature ");
			Thread.sleep(3000);
			oPage.getSaveCustomerButton().click();
			Thread.sleep(3000);
			System.out.println("Create Customer");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void deleteCustomer()
	{
		try {
			oPage.getclickSettingCustomertoModifyorDelete().click();
			Thread.sleep(3000);
			oPage.getclickActionButtontoDeleteCustomer().click();
			oPage.getclickDeleteCutomer().click();
			Thread.sleep(1000);
			oPage.getClickDeleteCustomerConfirm().click();
			Thread.sleep(3000);
			System.out.println("Delete Customer");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void createProject(){
		try{
			oPage.getclickAddNew().click();
			oPage.getclickNewprojectunderADDNew().click();
			Thread.sleep(2000);
			oPage.getGiveProjectnameonnameField().sendKeys("Project_QA");
			Thread.sleep(1000);
			oPage.getconfirmCreateproject().click();
			Thread.sleep(1000);
			System.out.println("Create new Project");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void deleteProject()
	{
		try
		{
			oPage.getclicksettingsatproject().click();
			Thread.sleep(1000);
			oPage.getclickActionsinProject().click();
			Thread.sleep(1000);
			oPage.getclickDeleteonProject().click();
			Thread.sleep(1000);
			oPage.getconfirmDeleteProject().click();
			Thread.sleep(1000);
			System.out.println("Delete Project");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createTask(){
		try
		{

			oPage.getselectNewtask().click();
			oPage.getselectCreatnewTask().click();
			Thread.sleep(1000);
			oPage.getselectCreatnewTask1underTask().sendKeys("TestTask");
			Thread.sleep(1000);
			oPage.getconfirmtask1().click();
			Thread.sleep(3000);
			System.out.println("Create Task");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteTask(){
		try													
		{
			Thread.sleep(4000);
			oPage.topNavBtn().click();
			Thread.sleep(5000);
			oPage.getselectAlltasktodelete().click();
			Thread.sleep(5000);
			oPage.Action().click();
			Thread.sleep(5000);
			oPage.DeleteBtn().click();
			Thread.sleep(5000);
			//oPage.getselectAlltasktodelete1().click();
			Thread.sleep(6000);
			oPage.getconfirmDeleteTask().click();
			Thread.sleep(5000);
			System.out.println("Delete Task");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

