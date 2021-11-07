package com.qa.orange.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginOrange {

//	@DataProvider(name = "CredManager")
//	public Object[][] testData() {
//
//		Object[][] credentials = { { "Amod", "Amod123" }, { "Mukesh", "Mukesh123" }, { "Naveen", "Naveen123" },
//				{ "Rahul", "Rahul123" }, { "Karthik", "Karthik123" } };
//
//		return credentials;
//
//	}

	@DataProvider(name = "UrlManager")
	public Object[] storeUrl() {

		return new Object[] { "https://opensource-demo.orangehrmlive.com/", "https://www.google.com",
				"https://www.facebook.com" };
	}

	WebDriver driver;

	@Test(dataProvider = "UrlManager")
	public void launchUrl(String url) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get(url);

		driver.manage().window().maximize();

	}

//	@Test(dataProvider = "CredManager")
//	public void login(String uname, String pwd) {
//
//		driver.findElement(By.id("txtUsername")).sendKeys(uname);
//
//		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
//
//		driver.findElement(By.id("btnLogin")).click();
//
//	}

}
