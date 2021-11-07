package com.qa.orange.tests;

import org.testng.Assert;
import org.testng.annotations.Test;



public class TestRunner {

	@Test
	public void compareTwoString() {

		String s1 = "WebDriver";

		String s2 = "Selenium WebDriver";

		Assert.assertEquals(s1, s2);

	}

	@Test
	public void checkNumber() {

		int num = 2;

		Assert.assertTrue(num > 5);
	}

}
