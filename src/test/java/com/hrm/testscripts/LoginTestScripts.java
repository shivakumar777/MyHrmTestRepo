package com.hrm.testscripts;

import org.testng.annotations.BeforeTest;

import com.hrm.services.LoginServices;

public class LoginTestScripts{
	LoginServices loginServices = new LoginServices();	
	
	    @BeforeTest
	    public void init() throws InterruptedException {
	    	loginServices.openHRMApplication();
	    	loginServices.loginToOrangeHRM();
	    }

}
