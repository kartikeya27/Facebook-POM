package test;

import com.facebook.base.Page;
import com.facebook.pages.inbox.FriendList;
import com.facebook.pages.inbox.LandingPage;
import com.facebook.pages.inbox.MyProfilePage;
import com.facebook.pages.login.LoginPage;

public class Login {
	//make the navigational structure
	//validation - TestNG or Junit
	//reporting part
	//parameterized tests
	//how to run through ant
	//logging
	//mailing report

	public static void main(String[] args) {
		//Default constructor will call from super class 
		LoginPage l = new LoginPage();
		LandingPage landingPage =  l.doLogin("kebijebi@gmail.com", "mataji21");
		//Page.topMenu.Logout();
		MyProfilePage myProfile =  landingPage.gotoProfile();
		//myProfile.changePicture("/Users/kartikbhatt/Desktop");
		FriendList friendList = myProfile.loadFriendList();
		boolean r =friendList.searchFriend("Sarita Patel");
		System.out.println(r);
	}

}
