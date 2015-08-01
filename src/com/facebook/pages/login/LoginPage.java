package com.facebook.pages.login;

import org.testng.Assert;
import com.facebook.base.Page;
import com.facebook.pages.inbox.LandingPage;
import com.facebook.pages.inbox.TopMenu;
import com.util.ErrorUtil;


public class LoginPage extends Page {
	//null - if login is not success
	//LandingPage - if login is success
	public LandingPage doLogin(String userName, String password) {
		try {
			Assert.assertEquals("Facebook", driver.getTitle());
			}catch(Throwable t){
				//ErrorUtil.addVerificationFailure(t);
				Page.takeScreenshot("Login.jpg");
			}
		driver.get(CONFIG.getProperty("testSiteLandingPageURL"));
		System.out.println(isElementPresent("//*[@id='email']"));
		input("EMAIL",userName);
		input("PASSWORD",password);
		click("LOGIN_BUTTON");
		//validation
		if(isElementPresent("go_to_profile"))
			return new LandingPage();
		else
			return null;
		
		//initialize Topmenu
		//topMenu = new TopMenu();
	}
	//default - correct , username password
	public LandingPage doLogin() {
		
		return doLogin(CONFIG.getProperty("defaultUserName"),CONFIG.getProperty("defaultPassword"));
		
	}
	
	public void doRegister() {
		
	}

}
