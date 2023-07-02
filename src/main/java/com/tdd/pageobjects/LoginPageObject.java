package com.tdd.pageobjects;

import org.openqa.selenium.By;

public interface  LoginPageObject {

	public By signinButtonHover = By.xpath("//span[@id='nav-link-accountList-nav-line-1' and text()='Hello, sign in']");
	public By signButton = By.xpath(
			"//div[@id='nav-flyout-ya-signin']/a[@class='nav-action-signin-button']/span[contains(text(),'Sign in')]");
	public By emailormobTextField = By.xpath("//div[@class='a-row a-spacing-base']//input[@name='email']");

	public By continueButton = By.id("continue");
	public By condition1 = By.xpath("//div[@id='legalTextRow']/a[1]");
	public By NeedHelp = By.xpath(
			"(//div[@class='a-section'])[position()=3]//div[@class='a-row a-expander-container a-expander-inline-container']//span[@class='a-expander-prompt']");

	public By password = By.xpath("//input[@id='ap_password']");
	public By buttonSignin = By.id("signInSubmit");
	public By rememberMeCheckbox = By.xpath("//div[@class='a-checkbox']//input[@name='rememberMe']");
	public By bottomSignInButton = By
			.xpath("//div[@class='rhf-sign-in-button']//a[@class='action-button']/span[contains(text(),'Sign in')]");
}
