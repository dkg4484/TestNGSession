package com.qa.orange.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertVsVerify {
	
	
	/*
	 * 
	 * Verify command used to check whether condition are met or not
	 * 
	 * If condition is not met it will go for other block to proceed
	 * 
	 * It will stop the test case execution and it process entire piece of code within the block
	 * 
	 * It will not throw any assertion error.
	 * 
	 * Verify command can be implemented through If-Else or Try-Catch Block
	 * 
	 * 
	 * 
	 * Assert command used to check whether test condition pass or fail
	 * 
	 * If condition is failed it will not process remaining lines of code within a method and
	 * 
	 * it will directly jump into next test method
	 * 
	 * It will throw the Assertion error
	
	
	*/

	@Test
	public void compareTwoString() {

		System.out.println("---------------Start--------------");

		String s1 = "WebDriver";

		String s2 = "Web";

		/*
		 * if (s1.equalsIgnoreCase(s2)) {
		 * 
		 * System.out.println("Same"); }
		 * 
		 * else {
		 * 
		 * System.out.println("Different"); }
		 */

		Assert.assertEquals(s1, s2);

		System.out.println("---------------End--------------");

	}

	@Test
	public void checkNumber() {

		System.out.println("---------------Start--------------");

		int num = -1;
		/*
		 * if (num < 0) {
		 * 
		 * System.out.println("Large"); }
		 * 
		 * else {
		 * 
		 * System.out.println("Small"); }
		 */

		Assert.assertTrue(num > 0);

		System.out.println("---------------End--------------");

	}

}
