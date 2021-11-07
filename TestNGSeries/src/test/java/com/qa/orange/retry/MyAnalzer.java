package com.qa.orange.retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyAnalzer implements IRetryAnalyzer {
	
	int minRetry = 0;
	int maxRetry = 2;

	public boolean retry(ITestResult result) {
		
		if(minRetry <= maxRetry) {
			
			minRetry++;
			
			return true;
			
		}

		return false;

	}

}
