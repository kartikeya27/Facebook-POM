package com.facebook.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.facebook.base.Page;
import com.facebook.pages.inbox.LandingPage;
import com.facebook.pages.inbox.MyProfilePage;
import com.facebook.pages.login.LoginPage;
import com.util.TestUtil;

public class ChangePicTest {
	
	@Test
	public void changPic() {
		
		if(!TestUtil.isExecutable("ChangePicTest",Page.xls1))
			throw new SkipException("Runmode set to NO");
		LandingPage landingPage=null;
		//logged in inside the application
		if(!Page.isLoggedIn) {
			LoginPage loginPage = new LoginPage();
			landingPage = loginPage.doLogin();
		} else {
		//I am logged in
			landingPage = Page.topMenu.gotoLandingpage();
		}
		MyProfilePage profilePage =  landingPage.gotoProfile();
		//profilePage.changePicture("");
	}

}
