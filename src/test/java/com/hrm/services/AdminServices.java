package com.hrm.services;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.hrm.configuration.BaseConfiguration;
import com.hrm.objectRepo.AdminPageObjects;
import com.hrm.objectRepo.LoginObjectsRepo;
import com.hrm.utils.CommonUtils;

public class AdminServices {
	
	CommonUtils commonUtils = new CommonUtils();
	AdminPageObjects adminPageObjects = new  AdminPageObjects();

	
	
	public void userNavigateToAdminTab() {
		
		commonUtils.mouseHoverElemet("xpath", adminPageObjects.getObjects().getProperty("admin_tab_xpath"));
		commonUtils.mouseHoverElemet("xpath", adminPageObjects.getObjects().getProperty("companyInfo_tab_xpath"));
		commonUtils.mouseHoverElemet("xpath", adminPageObjects.getObjects().getProperty("admin_tab_xpath"));
		
		
		
	}
}

//   in Admin.Service
//             I Should write Only Logic of the Each Functionality..!!