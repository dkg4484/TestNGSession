package com.qa.orange.tests;

import org.testng.annotations.Test;

/*
 * 
 * InvocationCount --> To execute particular test method multiple times.
*/

public class InvocationCountExample {

	@Test(invocationCount =  5)
	public void m1() {

		System.out.println("M1");

	}

}
