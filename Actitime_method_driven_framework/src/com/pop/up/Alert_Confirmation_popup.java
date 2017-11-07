package com.pop.up;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Confirmation_popup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/vijaykumar%20D%20N/Desktop/popup1.html");
		driver.findElement(By.xpath("//button[contains(text(),'Try')]")).click();
		Alert alert=driver.switchTo().alert();
		//alert.accept();
		alert.dismiss();
		//driver.quit();

	}

}
