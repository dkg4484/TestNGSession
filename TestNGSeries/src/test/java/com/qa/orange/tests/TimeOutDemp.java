package com.qa.orange.tests;

import org.testng.annotations.Test;

/*TimeOut
 * 
 * To set the time period for a method
 * 
 * We need to give mills-seconds for timeout
 * 
 * Interrupted or ThreadTimeOut Exception --> Run time Exception

*/
public class TimeOutDemp {

	@Test(timeOut = 1500)
	private void m1() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("m1");

	}

	@Test
	private void m2() {

		System.out.println("m2");

	}

}
