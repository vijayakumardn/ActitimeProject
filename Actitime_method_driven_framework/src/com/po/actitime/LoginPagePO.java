package com.po.actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.library.actitime.BasePage;

public class LoginPagePO extends BasePage{

	public LoginPagePO(WebDriver driver) {
		super(driver);		
		wait.until(ExpectedConditions.titleContains("Login"));
	}
	@FindBy(id = "username")
	private WebElement uname;

	@FindBy(name = "pwd")
	private WebElement pwd;

	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement keepLoggedInCheckBox;

	@FindBy(xpath = "//div[contains(text(),'Login')]")
	private WebElement login;

	public void LoginLinkWithRememeber(String un, String pd) {
		uname.sendKeys(un);
		pwd.sendKeys(pd);
		keepLoggedInCheckBox.click();
		login.click();

	}

	public void LoginLinkBtn(String un, String pd) {
		uname.sendKeys(un);
		pwd.sendKeys(pd);
		login.click();

	}

	public void setLogin(String un, String pd) throws Exception {
		uname.sendKeys(un);
		pwd.sendKeys(pd);
		login.click();
	}


}
