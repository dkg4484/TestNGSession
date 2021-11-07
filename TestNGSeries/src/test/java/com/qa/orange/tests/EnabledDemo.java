package com.qa.orange.tests;

import org.testng.annotations.Test;

public class EnabledDemo {
	
	/*Enabled
	 * 
	 * To ignore particular test method
	 * 
	 * Default value of Enabled is True
	 * 
	 * If we make false it will be ignored by the TestNG
	*/

	@Test
	public void m1() {

		System.out.println("Login");

	}

	@Test(enabled = false)
	public void m2() {

		System.out.println("Order Product");

	}

	@Test
	public void m3() {

		System.out.println("Payment");

	}

	@Test(enabled = false)
	public void m4() {

		System.out.println("Checkout");

	}

}
