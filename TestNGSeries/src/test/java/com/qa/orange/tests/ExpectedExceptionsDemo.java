package com.qa.orange.tests;

import org.testng.annotations.Test;

/*
 * 
 * ExpectedException --> We can suppress the exception using this one.
*/

public class ExpectedExceptionsDemo {

	@Test(expectedExceptions = { Exception.class })
	private void m1() {

		String str = null;

		System.out.println(str.length());

		System.out.println(1 / 0);

		System.out.println("End");

	}

}
