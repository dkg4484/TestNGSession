package com.qa.orange.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftDependancy {

	@Test
	private void m1() {

		System.out.println("m1");

		Assert.fail();

	}

	@Test(dependsOnMethods = "m1", alwaysRun = true)
	private void m2() {

		System.out.println("m2");

	}

	@Test
	private void m3() {

		System.out.println("m3");

	}

}
