package com.sgtesting.POMAssignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	ActiTimePage(WebDriver wb) {
		PageFactory.initElements(wb, this);
	}

	// User name
	private WebElement username;

	public WebElement getUserName() {
		return username;
	}

	// User password
	private WebElement pwd;

	public WebElement getPassword() {
		return pwd;
	}

	// Login Button
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement loginbutton;

	public WebElement getLoginButton() {
		return loginbutton;
	}

	// FlyOut Window
	@FindBy(xpath = "//div[text()='Getting Started Shortcuts']")
	private WebElement flyOut;

	public WebElement getFlyOutWindow() {
		return flyOut;
	}

	// creating User 1
	@FindBy(xpath = "//div[text()='USERS']")
	private WebElement clickUser;

	public WebElement getUserContainer() {
		return clickUser;
	}

	// click on add user
	@FindBy(xpath = "//div[text()='Add User']")
	private WebElement addUser;

	public WebElement adduserButton() {
		return addUser;
	}

	// start Explore
	@FindBy(xpath = "//span[text()='Start exploring actiTIME']")
	private WebElement startExplore;

	public WebElement getStartExploreBtn() {
		return startExplore;
	}

	// firstname
	private WebElement firstName;

	public WebElement getfirstNametxt() {
		return firstName;
	}

	// last name
	private WebElement lastName;

	public WebElement getlastNametxt() {
		return lastName;

	}

	// email
	private WebElement email;

	public WebElement getmail() {
		return email;
	}

	// Username
	private WebElement userDataLightBox_usernameField;

	public WebElement geUserName() {
		return userDataLightBox_usernameField;
	}

	// Password
	private WebElement password;

	public WebElement gePassword() {
		return password;
	}

	// Retype Password
	private WebElement passwordCopy;

	public WebElement gePasswordCopy() {
		return passwordCopy;
	}

	// click create user button
	@FindBy(xpath = "//span[text()='Create User']")
	private WebElement createUser;

	public WebElement clickCreateUser() {
		return createUser;
	}

	// Delete User
	// ------------------------------------------
	// click on User 1
	@FindBy(xpath = "//span[text()='User 1, Demo']")
	private WebElement user1;

	public WebElement clickUser1() {
		return user1;
	}

	// click on delete user
	private WebElement userDataLightBox_deleteBtn;

	public WebElement clickDelete() {
		return userDataLightBox_deleteBtn;
	}

	// logout
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logout;

	public WebElement logoutUser() {
		return logout;

	}

	/// Modify User
	// ----------------------------------------
	// click on ModifiedUser 1
	@FindBy(xpath = "//span[text()='User 1, Demo 1']")
	private WebElement moduser1;

	public WebElement clickModUser1() {
		return moduser1;
	}

	// click on ModifiedUser 1
	@FindBy(xpath = "//span[text()='User 2, Demo 2']")
	private WebElement moduser2;

	public WebElement clickModUser2() {
		return moduser2;
	}

	// click on ModifiedUser 1
	@FindBy(xpath = "//span[text()='User 3, Demo 3']")
	private WebElement moduser3;

	public WebElement clickModUser3() {
		return moduser3;
	}

	// click on save button
	@FindBy(xpath = "//span[text()='Save Changes']")
	private WebElement saveBtn;

	public WebElement clickSaveBtn() {
		return saveBtn;
	}

	// Create Customer
	// ------------------------------
	// Click on Task Container
	@FindBy(xpath = "//div[text()='TASKS']")
	private WebElement clickTask;

	public WebElement clickTaskContainer() {
		return clickTask;
	}

	// click on Add New
	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement addnew;

	public WebElement clickAddnew() {
		return addnew;
	}

	// select New Customer
	@FindBy(xpath = "/html/body/div[14]/div[1]")
	private WebElement customer;

	public WebElement clickCustomer() {
		return customer;
	}

	// Customer name
	private WebElement customerLightBox_nameField;

	public WebElement getcustomerName() {
		return customerLightBox_nameField;
	}

	// click create customer
	@FindBy(xpath = "//span[text()='Create Customer']")
	private WebElement oCustomer;

	public WebElement clickCreateCustomer() {
		return oCustomer;
	}

	// Delete user
	// -----------------------------------------------
	// click on setting
	@FindBy(xpath = "//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")

	private WebElement osetting;

	public WebElement clickSetting() {
		return osetting;
	}

	// Actions button
	@FindBy(xpath = "//div[text()='ACTIONS']")
	private WebElement actionBtn;

	public WebElement actionButton() {
		return actionBtn;
	}

	// delete button
	@FindBy(xpath = "//div[text()='Delete']")
	private WebElement deletebtn;

	public WebElement deletebutton() {
		return deletebtn;
	}

	// delete Permanently)
	private WebElement customerPanel_deleteConfirm_submitTitle;

	public WebElement deletePerAction() {
		return customerPanel_deleteConfirm_submitTitle;
	}

	// Modify user
	// -----------------------------------------------
	// select drop down
	@FindBy(xpath = "//*[@id='taskListBlock']/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/div/div[1]/div")
	private WebElement drpBtn;

	public WebElement drop() {
		return drpBtn;
	}

	// div[text()='Archived']
	@FindBy(xpath = "//div[text()='Archived']")
	private WebElement selArchived;

	public WebElement archivedBtn() {
		return selArchived;
	}

	// create project
	// --------------------------------------------------
	// New Project
	@FindBy(xpath = "/html/body/div[14]/div[2]")
	private WebElement newProjectBtn;

	public WebElement newProject() {
		return newProjectBtn;

	}

	// Project Name
	private WebElement projectPopup_projectNameField;

	public WebElement projectName() {
		return projectPopup_projectNameField;

	}

	// Create project
	@FindBy(xpath = "//span[text()='Create Project']")
	private WebElement createProjectBtn;

	public WebElement clickCreateProject() {
		return createProjectBtn;
	}

	// Modify project
	// --------------------------------------------------
	// View Project Setting
	@FindBy(xpath = "//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement viewProjectSettingBtn1;

	public WebElement viewProjectSetting1() {
		return viewProjectSettingBtn;
	}

	@FindBy(xpath = "//*[@id='taskListBlock']/div[4]/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[3]/div/div[1]/div")
	private WebElement modiProbtn;

	public WebElement modifyBtnPro() {
		return modiProbtn;
	}

	@FindBy(xpath = "//div[text()='Archived']")
	private WebElement ArchPro;

	public WebElement ArchProBtn() {
		return ArchPro;
	}

	// delete project
	// --------------------------------------------------
	// View Project Setting
	@FindBy(xpath = "//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement viewProjectSettingBtn;

	public WebElement viewProjectSetting() {
		return viewProjectSettingBtn;
	}

	@FindBy(xpath = "//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement projectActionBtn;

	public WebElement projectActionBtn2() {
		return projectActionBtn;
	}

	@FindBy(xpath = "//*[@id='taskListBlock']/div[4]/div[4]/div/div[3]/div")
	private WebElement BtnDelete;

	public WebElement BtnDeleteProject() {
		return BtnDelete;
	}

	private WebElement projectPanel_deleteConfirm_submitTitle;

	public WebElement deletePerBtn() {
		return projectPanel_deleteConfirm_submitTitle;
	}

	// Create Task
	// --------------------------------------------------
	// click on Add task
	@FindBy(xpath = "//div[text()='Add New Task']")
	private WebElement addTask;

	public WebElement addTaskBtn() {
		return addTask;
	}

	// click on new task
	@FindBy(xpath = "//div[text()='Create new tasks']")
	private WebElement createnewTaskBtn;

	public WebElement createnewTaskBtn() {
		return createnewTaskBtn;
	}

	// Task 1
	@FindBy(xpath = "//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")
	private WebElement task1;

	public WebElement createTask1() {
		return task1;
	}

	// Task 2
	@FindBy(xpath = "//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[2]/td[1]/input")
	private WebElement task2;

	public WebElement createTask2() {
		return task2;
	}

	// click on create task button
	// @FindBy(xpath="//span[text()='Create Tasks']")
	private WebElement createTasksPopup_commitBtn;

	public WebElement createTaskBtnmetg() {
		return createTasksPopup_commitBtn;
	}

	// Delete Task
	/// ------------------------------------
	// Click Task 1
	@FindBy(xpath = "//div[text()='Task 1']")
	private WebElement Task1;

	public WebElement Task1Btn() {
		return Task1;
	}

	// click Task 2
	@FindBy(xpath = "//div[text()='Task 2']")
	private WebElement Task2;

	public WebElement Task2Btn() {
		return Task2;
	}

	private WebElement DeleteTask1;

	public WebElement DeleteTask1() {
		return DeleteTask1;
	}

	// Actions button
	@FindBy(xpath = "//*[@id=\'taskListBlock\']/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement actionBtnTask;

	public WebElement actionButtonTask() {
		return actionBtnTask;
	}

	// advanced Scenario
	// ------------------------
	// Modify User
	@FindBy(xpath = "//span[text()='User 1, Tom']")
	private WebElement userA;

	public WebElement clickUserA() {
		return userA;
	}

	@FindBy(xpath = "//span[text()='User 2, Jerry']")
	private WebElement userB;

	public WebElement clickUserB() {
		return userB;
	}

	@FindBy(xpath = "//span[text()='User 3, Sherlock']")
	private WebElement userC;

	public WebElement clickUserC() {
		return userC;
	}
}
