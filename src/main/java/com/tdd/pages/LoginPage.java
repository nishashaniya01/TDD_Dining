package com.tdd.pages;

import org.openqa.selenium.WebDriver;

import com.tdd.utils.Constants;
import com.tdd.utils.ElementUtils;
import com.tdd.utils.ExcelUtil;
import com.tdd.pageobjects.LoginPageObject;

public class LoginPage extends ElementUtils implements LoginPageObject {

	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void openAmazonHomePage(String url) {
		openURL(url);
	}

	public void hoverToSignIn() {

		hoverToElement(signinButtonHover);
		doActionsClick(signButton);
	}

	public void enterMobileOrEmailID(String mobileNumber) {

		sendKeysToElement(emailormobTextField, mobileNumber);
		clickElement(continueButton);

	}

}
