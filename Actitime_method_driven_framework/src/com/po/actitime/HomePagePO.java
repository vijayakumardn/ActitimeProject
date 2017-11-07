package com.po.actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.library.actitime.BasePage;

public class HomePagePO extends BasePage{

	public HomePagePO(WebDriver driver) {
		super(driver);	
		wait.until(ExpectedConditions.titleContains("actiTIME - Login"));
		
	}
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	
	
	public  void logoutBtn() {

		logout.click();
	}
	

}
