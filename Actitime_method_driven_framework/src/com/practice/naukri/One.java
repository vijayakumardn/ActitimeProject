package com.practice.naukri;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class One {//To close all child browser popups

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriverWait wait=new WebDriverWait(driver, 20);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Set<String> allwh = driver.getWindowHandles();  
		int count=allwh.size();
		String mtitle=driver.getTitle();
		//System.out.println(count);
		for(String wh:allwh){
			driver.switchTo().window(wh);
		String cTit=driver.getTitle();
		if(cTit.equals(mtitle)){
			
		}
		else{
			driver.close();
		}
		}
	}

}
