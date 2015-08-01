package com.facebook.testCases;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.facebook.base.Page;
import com.facebook.pages.inbox.FriendList;
import com.facebook.pages.inbox.LandingPage;
import com.facebook.pages.inbox.MyProfilePage;
import com.facebook.pages.login.LoginPage;
import com.util.TestUtil;

public class FindFriendTest {
	
	@Test
	public void findFriend() {
		String friendName="xxxl"; //read from xls file
		System.out.println("findFriend");
		if(!TestUtil.isExecutable("FindFriendTest",Page.xls1))
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
		MyProfilePage prof =  landingPage.gotoProfile();
		//FriendList fs =  prof.loadFriendList();
		//Assert.assertTrue(fs.searchFriend(friendName),friendName +" - Friend Not Present");
	}
	
	@Test(dependsOnMethods = {"findFriend"})
	public void messageFriend() {
		System.out.println("messageFriend");
	}

}
