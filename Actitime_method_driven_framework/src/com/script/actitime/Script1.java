package com.script.actitime;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.library.actitime.BaseTest;
import com.library.actitime.ExcelLib;
import com.po.actitime.HomePagePO;
import com.po.actitime.LoginPagePO;

public class Script1 extends BaseTest {
	
	
	@Test
	public void validLogin(){
		
		
		try {
			String expected="actiTIME - Login";
			LoginPagePO l=new LoginPagePO(driver);
			String un=ExcelLib.readExcel(xlpath, "Sheet1", 0, 0);
			String pwd=ExcelLib.readExcel(xlpath, "Sheet1", 0, 1);
			l.LoginLinkBtn(un,pwd);
			HomePagePO h=new HomePagePO(driver);
			h.verifyTitle(expected);
			h.logoutBtn();
			Reporter.log("Valid Login is Pass",true);
		} catch (Exception e) {
			Reporter.log("Valid Login is Failed", true);
			Assert.fail();
		}
	}

}
