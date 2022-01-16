package com.sgtesting.actitime.driverscript;

import org.openqa.selenium.WebDriver;

import com.sgtesting.actitime.tests.Customers;
import com.sgtesting.actitime.tests.HomePage;
import com.sgtesting.actitime.tests.Initialize;
import com.sgtesting.actitime.tests.LoginLogout;
import com.sgtesting.actitime.tests.Projects;
import com.sgtesting.actitime.tests.Tasks;
import com.sgtesting.actitime.tests.Users;

public class DriverScript {

	public static void main(String[] args) {
		WebDriver obrowser = null;
		// Create User Scenario
		// LaunchBrowser-->navigate-->login-->createUser-->deleteUser-->logout
		// -->closeApplication
		obrowser = Initialize.launchBrowser();
		Initialize.navigate(obrowser);
		LoginLogout.login(obrowser);
		HomePage.minimizeFlyOutWindow(obrowser);
		Users.createUser(obrowser);
		Users.deleteUser(obrowser);
		LoginLogout.logout(obrowser);
		Initialize.closeApplication(obrowser);

		// Create and Modify User Scenario
		// LaunchBrowser-->navigate-->login-->createUser-->modifyUser-->deleteUser-->logout-->closeApplication
		obrowser = Initialize.launchBrowser();
		Initialize.navigate(obrowser);
		LoginLogout.login(obrowser);
		HomePage.minimizeFlyOutWindow(obrowser);
		Users.createUser(obrowser);
		Users.modifyUser(obrowser);
		Users.deleteUser(obrowser);
		LoginLogout.logout(obrowser);
		Initialize.closeApplication(obrowser);

		// Create and Delete Customer Scenario
		// LaunchBrowser-->navigate-->login-->createCustomer-->deleteCustomer-->logout-->closeApplication
		obrowser = Initialize.launchBrowser();
		Initialize.navigate(obrowser);
		LoginLogout.login(obrowser);
		HomePage.minimizeFlyOutWindow(obrowser);
		Customers.createCustomer(obrowser);
		Customers.deleteCustomer(obrowser);
		LoginLogout.logout(obrowser);
		Initialize.closeApplication(obrowser);

//		// Create and Modify Customer Scenario
		// LaunchBrowser-->navigate-->login-->createCustomer-->deleteCustomer-->logout-->closeApplication
		obrowser = Initialize.launchBrowser();
		Initialize.navigate(obrowser);
		LoginLogout.login(obrowser);
		HomePage.minimizeFlyOutWindow(obrowser);
		Customers.createCustomer(obrowser);
		Customers.modifyCustomer(obrowser);
		Customers.deleteCustomer(obrowser);
		LoginLogout.logout(obrowser);
		Initialize.closeApplication(obrowser);

		// Create and Delete Project Scenario
		// LaunchBrowser-->navigate-->login-->createCustomer-->CreateProject-->DeleteProject-->deleteCustomer-->logout
		// -->closeApplication
		obrowser = Initialize.launchBrowser();
		Initialize.navigate(obrowser);
		LoginLogout.login(obrowser);
		HomePage.minimizeFlyOutWindow(obrowser);
		Customers.createCustomer(obrowser);
		Projects.createProject(obrowser);
		Projects.deleteProject(obrowser);
		Customers.deleteCustomer(obrowser);
		LoginLogout.logout(obrowser);
		Initialize.closeApplication(obrowser);

		// Create and Modify Project Scenario
		// LaunchBrowser-->navigate-->login-->createCustomer-->CreateProject-->ModifyProject-->DeleteProject-->deleteCustomer-->logout
		// -->closeApplication
		obrowser = Initialize.launchBrowser();
		Initialize.navigate(obrowser);
		LoginLogout.login(obrowser);
		HomePage.minimizeFlyOutWindow(obrowser);
		Customers.createCustomer(obrowser);
		Projects.createProject(obrowser);
		Projects.modifyProject(obrowser);
		Projects.deleteProject(obrowser);
		Customers.deleteCustomer(obrowser);
		LoginLogout.logout(obrowser);
		Initialize.closeApplication(obrowser);

		// Create and Delete Task Scenario
		// launchBrowser-->navigate-->login-->createCustomer-->CreateProject-->Create
		// Tasks -->Delete Tasks -->DeleteProject-->deleteCustomer-->logout
		// -->closeApplication
		obrowser = Initialize.launchBrowser();
		Initialize.navigate(obrowser);
		LoginLogout.login(obrowser);
		HomePage.minimizeFlyOutWindow(obrowser);
		Customers.createCustomer(obrowser);
		Projects.createProject(obrowser);
		Tasks.createTask(obrowser);
		Tasks.deleteTask(obrowser);
		Projects.deleteProject(obrowser);
		Customers.deleteCustomer(obrowser);
		LoginLogout.logout(obrowser);
		Initialize.closeApplication(obrowser);

	}

}
