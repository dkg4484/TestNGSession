package com.qa.orange.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {

	/*
	 * @BeforeSuite
	 * 
	 * @AfterSuite
	 * 
	 * @BeforeTest
	 * 
	 * @AfterTest
	 * 
	 * @BeforeClass
	 * 
	 * @AfterClass
	 * 
	 * @BeforeMethod
	 * 
	 * @AfterMethod
	 * 
	 * @Test
	 * 
	 * @BeforeGroups
	 * 
	 * @AfterGroups
	 * 
	 * @Parameters
	 * 
	 * @DataProvider
	 */

	@Test
	private void test1() {

		System.out.println("test1");

	}

	@Test
	private void test2() {

		System.out.println("test2");

	}

	@Test
	private void test3() {

		System.out.println("test3");

	}

	@BeforeMethod
	private void beforeMethod() {
		// TODO Auto-generated method stub

		System.out.println("beforeMethod");

	}

	@AfterMethod
	private void afterMethod() {
		// TODO Auto-generated method stub

		System.out.println("afterMethod");

	}

	@BeforeClass
	private void beforeClass() {
		// TODO Auto-generated method stub

		System.out.println("beforeClass");

	}

	@AfterClass
	private void afterClass() {
		// TODO Auto-generated method stub

		System.out.println("afterClass");

	}

	@BeforeTest
	private void beforeTest() {
		// TODO Auto-generated method stub

		System.out.println("beforeTest");

	}

	@AfterTest
	private void afterTest() {
		// TODO Auto-generated method stub

		System.out.println("afterTest");

	}

	@BeforeSuite
	private void beforeSuite() {
		// TODO Auto-generated method stub

		System.out.println("beforeSuite");

	}

	@AfterSuite
	private void afterSuite() {
		// TODO Auto-generated method stub

		System.out.println("afterSuite");

	}

}
