package com.tdd.factory;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverFactory {

	private static WebDriver driver;
	private static ThreadLocal<WebDriver> tldriver = new ThreadLocal<WebDriver>();

	public WebDriver initializeDriver() {

		String browserName = "chrome";
		switch (browserName) {

		case "chrome":

			ChromeOptions chromeoptions = new ChromeOptions();
			chromeoptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			driver = new ChromeDriver(chromeoptions);
			tldriver.set(driver);
			break;

		case "firefox":
			FirefoxOptions firefoxoptions = new FirefoxOptions();
			firefoxoptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			driver = new FirefoxDriver(firefoxoptions);
			tldriver.set(driver);
			break;

		default:
			System.out.println("Enter correct browser name");
			break;

		}

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		

		return getDriver();

	}

	public WebDriver getDriver() {

		return tldriver.get();
	}

}
