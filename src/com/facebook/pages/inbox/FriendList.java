package com.facebook.pages.inbox;

import com.facebook.base.Page;

public class FriendList extends Page {
	
	public boolean searchFriend(String friednName) {
		input("friends_search_name",friednName);
		return isLinkPresent(friednName);
	}

}
