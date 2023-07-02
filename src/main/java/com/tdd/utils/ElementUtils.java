package com.tdd.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.tdd.factory.DriverFactory;

public class ElementUtils extends DriverFactory {

	WebDriver driver = getDriver();

	public void openURL(String url) {
		driver.get(url);
	}

	public WebElement getElement(By locator) {
		WebElement e = driver.findElement(locator);
		return e;
	}

	public void clickElement(By locator) {
		getElement(locator).click();
	}

	public void doActionsSendKeys(By locator, String value) {
		WebElement element = getElement(locator);
		Actions action = new Actions(driver);
		action.sendKeys(element, value).perform();
	}

	public void doActionsClick(By locator) {
		WebElement element = getElement(locator);
		Actions action = new Actions(driver);
		action.click(element).perform();
	}

	public void hoverToElement(By locator) {

		WebElement element = getElement(locator);
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}

	public void sendKeysToElement(By locator, String value) {
		driver.findElement(locator).sendKeys(value);
	}
}
