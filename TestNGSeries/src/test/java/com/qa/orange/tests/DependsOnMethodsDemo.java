package com.qa.orange.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

// Dependency Test

/*
 * 
 * dependsOnMethods 
 * 
 * To make one method as dependent with another thereby 
 * we can skip the method execution when there was a failure in 
 * another one
 * 
 * Used for dependency test on test level
*/

public class DependsOnMethodsDemo {

	@Test
	public void m1() {

		System.out.println("Login");

	}

	@Test(dependsOnMethods = "m1")
	public void a1() {

		System.out.println("Order Product");

	}

//	@Test(dependsOnMethods = "m1")
//	public void m3() {
//
//		System.out.println("Payment");
//
//	}
//
//	@Test(dependsOnMethods = "m3")
//	public void m4() {
//
//		System.out.println("Checkout");
//
//	}

}
