package com.qa.orange.parallel;

import org.testng.annotations.Test;

@Test
public class TestClass1 {

	public void testMethod1() {

		System.out.println("TC1    TestMethod1 " + Thread.currentThread().getId() + " " + System.currentTimeMillis());

	}

	public void testMethod2() {

		System.out.println("TC1    TestMethod2 " + Thread.currentThread().getId() + " " + System.currentTimeMillis());

	}

	public void testMethod3() {

		System.out.println("TC1    TestMethod3 " + Thread.currentThread().getId() + " " + System.currentTimeMillis());

	}

}
