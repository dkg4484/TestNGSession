package com.qa.orange.tests;

import org.testng.annotations.Test;

/*
 * Priority --> Its one of the attribute from TESTNG which we can apply in the @Test level
 * 	        --> Used for ordering the test cases
 * 			--> Varies from negative to positive
 *          --> Default priority is zero
*/

public class DifferentAttributes {

	@Test(priority = -1)
	public void start1() {

		System.out.println("Start1 ....");

	}

	@Test(priority = -1)
	public void start2() {

		System.out.println("Start2 ....");

	}

	@Test()
	public void end() {

		System.out.println("End ....");

	}

	@Test(priority = 1)
	public void launchBrowser() {

		System.out.println("launchBrowser");

	}

	@Test(priority = 2)
	public void launchUrl() {

		System.out.println("launchUrl");
	}

	@Test(priority = 3)
	public void sendCredentials() {

		System.out.println("sendCred");

	}

	@Test(priority = 4)
	public void clickButtton() {

		System.out.println("clickButtton");

	}

	@Test(priority = 10)
	public void verifyTitle() {

		System.out.println("verifyTitle");

	}

	@Test(priority = 2000)
	public void searchList() {

		System.out.println("searchList");

	}

}
