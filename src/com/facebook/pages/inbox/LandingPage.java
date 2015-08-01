package com.facebook.pages.inbox;

import com.facebook.base.Page;

public class LandingPage extends Page {
	
	public MyProfilePage gotoProfile() {
		
		click("go_to_profile");
		return new MyProfilePage();
	}

}
