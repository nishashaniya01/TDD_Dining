package com.tdd.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.tdd.factory.DriverFactory;
import com.tdd.pages.LoginPage;

public class TestBase {

	public DriverFactory driverfactory;
	WebDriver driver;
	public LoginPage loginpage;

	@BeforeClass
	public void setUpDrivr() {

		driverfactory = new DriverFactory();
		driver = driverfactory.initializeDriver();
		//System.out.print(driver);
		loginpage = new LoginPage(driver);

	}

	@AfterClass
	public void tearDown() {

		//System.out.print(driver);

		driver.quit();

	}
}
