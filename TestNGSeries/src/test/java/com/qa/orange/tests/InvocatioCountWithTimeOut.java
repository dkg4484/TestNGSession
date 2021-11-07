package com.qa.orange.tests;

import org.testng.annotations.Test;

/*
 * 
 * Timeout can be applied along with Invocation count
 * 
 * But its millis are supplied for each single test method
 * 
 * Invocation time out can also be applied along with InvocationCount
 * 
 * But its millis are supplied for whole test methods.

*/
public class InvocatioCountWithTimeOut {

	@Test(invocationTimeOut = 1000, invocationCount = 3)
	private void m1() {

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("m1");

	}

}
