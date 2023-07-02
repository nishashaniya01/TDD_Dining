package com.tdd.tests;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.tdd.base.TestBase;
import com.tdd.utils.Constants;
import com.tdd.utils.ExcelUtil;

public class LoginPageTest extends TestBase {

	@Test
	public void aurl() {

		loginpage.openAmazonHomePage("https://www.amazon.in/");

	}

//	@DataProvider
//	public Object[][] getTestData() {
//
//		Object data[][] = ExcelUtil.getTestData(Constants.LoginCredentials_SHEET_NAME);
//		return data;
//	}
//
//	@Test(dataProvider = "getTestData")
//	public void fillMobileOrEmailID(String mobileNumber) {
//		loginpage.hoverToSignIn();
//		try {
//			Thread.sleep(100);
//		} catch (InterruptedException e) {
//
//			e.printStackTrace();
//		}
//		loginpage.enterMobileOrEmailID(mobileNumber);
//
//	}
	
	@Test
	public void demoExcel() {
		loginpage.hoverToSignIn();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		loginpage.enterMobileOrEmailID(ExcelUtil.readExcelData());

	}

}
