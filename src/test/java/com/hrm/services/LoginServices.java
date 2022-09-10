package com.hrm.services;

import com.hrm.configuration.BaseConfiguration;
import com.hrm.objectRepo.LoginObjectsRepo;
import com.hrm.utils.CommonUtils;
import com.hrm.utils.ExcelUtils;

public class LoginServices {
	BaseConfiguration configuration = new BaseConfiguration();
//	CommonUtils commonUtils = new CommonUtils();
	LoginObjectsRepo loginObjectsRepo = new LoginObjectsRepo();
	ExcelUtils excelUtils = new ExcelUtils();

	public void openHRMApplication() {
		configuration.invokeBrowser();

	}

	public void loginToOrangeHRM() {

		/* ctrl + shift + / for multi line comment
		  commonUtils.enterTextinTextBox("xpath",loginObjectsRepo.getObjects(). getProperty("username_xpath") , "admin");
		 commonUtils.enterTextinTextBox("xpath",loginObjectsRepo.getObjects().getProperty("password_xpath"), "admin");
		  commonUtils.clickButton("xpath", loginObjectsRepo.getObjects().getProperty("login_button"));
		 */
		
		CommonUtils.enterTextinTextBox("xpath",loginObjectsRepo.getObjects(). getProperty("username_xpath") , excelUtils.getDataFromExcelByRow("loginDetails", 1, 0) );
		 CommonUtils.enterTextinTextBox("xpath",loginObjectsRepo.getObjects().getProperty("password_xpath"), excelUtils.getDataFromExcelByRow("loginDetails", 1, 1));
		  CommonUtils.clickButton("xpath", loginObjectsRepo.getObjects().getProperty("login_button"));

	}
}
