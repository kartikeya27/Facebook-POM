package com.facebook.pages.inbox;

import org.openqa.selenium.By;

import com.facebook.base.Page;

public class TopMenu {
	//logout from facebook
	public void Logout() {
		Page.driver.findElement(By.xpath(Page.OR.getProperty("top_menu_list"))).click();
		Page.driver.findElement(By.xpath(Page.OR.getProperty("top_menu_logout"))).click();

	}
	//search on facebook
	public void search(String searchText) {
		
	}
	//got to landing page
	public LandingPage gotoLandingpage() {
		Page.driver.findElement(By.xpath(Page.CONFIG.getProperty("homePage_link")));
		return new LandingPage();
	}

}
