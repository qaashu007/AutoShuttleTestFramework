package com.shuttl.test;

import org.testng.annotations.Test;
import com.shuttl.projectPages.LoginPage;
import com.shuttle.page.TestCore;

public class LoginTest extends TestCore{
	@Test(priority=0)
	public void testLogin() {
		LoginPage Login =new LoginPage(driver);
		Login.enterMobileNumber("999999999");
		
	}

}
