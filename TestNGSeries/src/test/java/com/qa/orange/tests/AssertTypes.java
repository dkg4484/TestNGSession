package com.qa.orange.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTypes {

	// Assert

	/*
	 * 1. Hard Assert
	 * 
	 * --Here we should use Assert Class to call some static methods such as assertEquals and assertTrue
	 * 
	 * --It is used when you need to know test case status and there is no requirement of processing remaining
	 * 
	 * piece of code when an assertion error
	 * 
	 * 
	 * 2. Soft Assert
	 * 
	 * -- Here we should create the object or instance for Soft Assert Class and use non-static methods such as assertEquals and assertTrue
	 * 
	 * -- Its used when we need to process entire block and also should print the status of test cases
	 * 
	 * -- We must use the assertAll() method at the end of the each method to get the test case status
	 */

	@Test
	public void compareTwoString() {

		System.out.println("Start===============>");

		String s1 = "WebDriver";

		String s2 = "Selenium WebDriver";

		SoftAssert soft = new SoftAssert();

		soft.assertEquals(s1, s2);

		System.out.println("End================>");

		soft.assertAll();

	}

	@Test
	public void checkNumber() {

		System.out.println("Start===================>");

		int num = 2;

		SoftAssert soft = new SoftAssert();

		soft.assertTrue(num > 5);

		System.out.println("End===================>");

		soft.assertAll();

	}

}
