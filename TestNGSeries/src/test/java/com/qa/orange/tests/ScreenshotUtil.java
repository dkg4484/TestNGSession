package com.qa.orange.tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {

	public static void captureScreenShot(WebDriver driver, String fileName) {

		TakesScreenshot tks = (TakesScreenshot) driver;

		File temp = tks.getScreenshotAs(OutputType.FILE);

		File perm = new File("./screenshot/" + fileName + System.currentTimeMillis() + ".png");

		try {
			FileUtils.copyFile(temp, perm);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
