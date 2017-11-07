package com.practice.naukri;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.library.actitime.JavascriptLibrary;

public class Naukriupdate {

	public static void main(String[] args) throws Exception {
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
			WebElement element = driver.findElement(By.xpath("//div[contains(text(),'Login')]"));
			JavascriptLibrary.javascriptClickElement(driver, element);
			Thread.sleep(5000);
			
			WebElement element1=driver.findElement(By.id("eLoginNew"));
		
			
			JavascriptLibrary.javascriptType(driver, element1, "vijaykumar.dn707@gmail.com");
			Thread.sleep(5000);
			WebElement element2=driver.findElement(By.id("pLogin"));
			JavascriptLibrary.javascriptType(driver, element2, "Aa1@1993");
			
			Thread.sleep(5000);
			WebElement element3 = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
			JavascriptLibrary.javascriptClickElement(driver, element3);
			
		}
		else{
			driver.close();
		}
		}
		
		
	}

}
