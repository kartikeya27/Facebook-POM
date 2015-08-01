package com.facebook.pages.inbox;

import com.facebook.base.Page;

public class MyProfilePage extends Page {
	//change your picture on facebook
	public void changePicture(String newPicPath) {
		click("edit_profile_pic");
		//click("load_photo");
		input("fileupload_pic",newPicPath);
	}
	//load the firendlist
	public FriendList loadFriendList() {
		click("friend_link");
		return new FriendList();
	}

}
